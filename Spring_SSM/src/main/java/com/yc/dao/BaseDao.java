package com.yc.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	/**
	 * 添加操作
	 * @param t
	 * @param sqlId
	 */
	public void save (T t,String sqlId);
	public void save (Class<T> clazz,String sqlId,Map<String,Object> map);
	public void save (Class<T> clazz,String sqlId,List<T> list);
	/**
	 * 更新数据操作
	 * @param t
	 * @param sqlId
	 */
	public void update (T t,String sqlId);
	public void update (Class<T> clazz,String sqlId,Map<String,Object> map);
	public void update (Class<T> clazz,String sqlId,List<T> list);
	public void update(Class<T> clazz,String sqlId);
	
	/**
	 * 删除操作
	 * @param t
	 * @param sqlId
	 */
	public void del (T t,String sqlId);
	public void del (Class<T> clazz,String sqlId,Map<String,Object> map);
	public void del (Class<T> clazz,String sqlId,List<Integer> ids);
	public void del(Class<T> clazz,String sqlId,Integer id);
	
	/**
	 * 查询所有
	 * @param t
	 * @param sqlId
	 */
	public List<T> findAll (T t,String sqlId);
	public List<T> findAll (Class<T> clazz,String sqlId,Map<String,Object> map);
	public List<T> findAll(Class<T> clazz,String sqlId);
	/**
	 * 单条数据查询
	 * @param t
	 * @param sqlId
	 */
	public T findOne (T t,String sqlId);
	public T findOne (Class<T> clazz,String sqlId,Map<String,Object> map);
	public T findOne(Class<T> clazz,String sqlId);
	public int findCount(Class<T> clazz, String sqlId, Map<String, Object> map);
}
