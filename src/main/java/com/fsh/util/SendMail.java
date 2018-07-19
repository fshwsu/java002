package com.fsh.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
/**
 * 测试java程序
 * 
 * 
 */


public class SendMail {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mail.xml");

		JavaMailSenderImpl	mailsend=(JavaMailSenderImpl) context.getBean("mailSender");
	
		//创建简单的邮件
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("fshwsu@126.com");
		msg.setTo("951031232@qq.com");
		msg.setSubject("JAVA0115测试邮件");
		msg.setText("好好学习,天天向上!");
		
		//发送邮件
		
		mailsend.send(msg);
		
		System.out.println("send ok");

	}

}
