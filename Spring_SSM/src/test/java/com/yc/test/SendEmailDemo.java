package com.yc.test;

import java.io.File;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.MyBatisApp01;
import com.yc.utils.SendMail;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MyBatisApp01.class)
public class SendEmailDemo {
	
	@Resource(name="sendMail")
	private SendMail mailSender;
	
	@Autowired
	private JavaMailSender javaMailSender;
	/*
	@Autowired
	private SimpleMailMessage mail;*/
	
	@Test
	public void demo1() {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom("18570940562@163.com");
        mail.setTo("764122611@qq.com");//收件人邮箱地址
        mail.setSubject("spring自带javamail发送的邮件");//主题
        mail.setText("hello this mail is from spring javaMail ");//正文
        mailSender.send(mail);
	}
	
	@Test
	public void demo2() throws MessagingException {	
       MimeMessage mimeMessage = javaMailSender.createMimeMessage();
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
       messageHelper.setTo("764122611@qq.com");//收件人邮箱地址
       messageHelper.setFrom("18570940562@163.com");
       messageHelper.setSubject("spring自带javamail发送的邮件");//主题
       messageHelper.setText("<html><head></head><body><h1>hello!!spring html Mail</h1> <a href='www.baidu.com'>百度一下</a></body></html>",true);
       mailSender.sendHtml(mimeMessage);
	}
	
	@Test
	public void demo3() throws MessagingException {		
       MimeMessage mimeMessage = javaMailSender.createMimeMessage();
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
       messageHelper.setTo("764122611@qq.com");//收件人邮箱地址
       messageHelper.setFrom("18570940562@163.com");
       messageHelper.setSubject("塞尔达的世界欢迎你.....");//主题
       messageHelper.setText("<html><head></head><body><h1>hello!!spring html Mail</h1><img src='cid:img'/></body></html>",true);
       
       FileSystemResource image = new FileSystemResource(new File("F:\\compress\\image2.jpg"));
       messageHelper.addInline("img",image); 
       mailSender.sendHtml(mimeMessage);
	}
	
	
	@Test
	public void demo4() throws MessagingException {		
       MimeMessage mimeMessage = javaMailSender.createMimeMessage();
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true,"utf-8");
       messageHelper.setTo("764122611@qq.com");//收件人邮箱地址
       messageHelper.setFrom("18570940562@163.com");
       messageHelper.setSubject("spring Eamil的测试");//主题
       messageHelper.setText("<html><head></head><body><h1>陈杰</h1><img src='cid:img'/></body></html>",true);
       
       FileSystemResource image = new FileSystemResource(new File("F:\\compress\\image2.jpg"));
       FileSystemResource file = new FileSystemResource(new File("E:\\mywork\\log\\sales\\20180807104709.sql"));
       messageHelper.addAttachment("20180807104709.sql", file);
       messageHelper.addInline("img",image); 
       mailSender.sendHtml(mimeMessage);
	}
	
	
	
	

	
	
}
