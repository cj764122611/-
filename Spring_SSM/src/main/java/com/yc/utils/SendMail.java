package com.yc.utils;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;



@Component
public class SendMail {
	
	@Autowired
	private JavaMailSender mailSender;

	public void send(SimpleMailMessage mail) {
		try {
			mailSender.send(mail);
			System.out.println("发送成功！！！");
		} catch (MailException e) {
			System.out.println("发送失败！！！");
		}
	}
	
	public void sendHtml(MimeMessage mimeMessage) {
		try {
			mailSender.send(mimeMessage);
			System.out.println("发送成功！！！");
		} catch (MailException e) {
			System.out.println("发送失败！！！");
		}
	}
}
