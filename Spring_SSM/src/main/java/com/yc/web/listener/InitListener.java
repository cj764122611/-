package com.yc.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yc.beans.District;
import com.yc.beans.HouseType;
import com.yc.services.DistrictBiz;
import com.yc.services.HouseTypeBiz;

/**
 * 启动容器时初始化
 * @author 偶是智障儿童
 *
 */
@WebListener
public class InitListener implements ServletContextListener {

	private ApplicationContext context;
    public InitListener() {
    	
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
        
    }

    public void contextInitialized(ServletContextEvent sce)  { 
        ServletContext application = sce.getServletContext();
        context = WebApplicationContextUtils.getRequiredWebApplicationContext(application);
        HouseTypeBiz houseTypeBiz = (HouseTypeBiz) context.getBean("houseTypeBizImpl");
        DistrictBiz districtBiz = (DistrictBiz) context.getBean("districtBizImpl");
        List<HouseType> houseTypeList = houseTypeBiz.getAllHouseType();
        List<District> districtList = districtBiz.getAllDistrict();
        application.setAttribute("districtList", districtList);
        application.setAttribute("houseTypeList", houseTypeList);
    }
	
}
