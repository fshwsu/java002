package com.fsh.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
/**
 * ����java����
 * 
 * 
 */


public class SendMail {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mail.xml");

		JavaMailSenderImpl	mailsend=(JavaMailSenderImpl) context.getBean("mailSender");
	
		//�����򵥵��ʼ�
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("fshwsu@126.com");
		msg.setTo("951031232@qq.com");
		msg.setSubject("JAVA0115�����ʼ�");
		msg.setText("�ú�ѧϰ,��������!");
		
		//�����ʼ�
		
		mailsend.send(msg);
		
		System.out.println("send ok");

	}

}
