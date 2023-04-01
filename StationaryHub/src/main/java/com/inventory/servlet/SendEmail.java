package com.inventory.servlet;
 
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.Random;

public class SendEmail {
	public static int num;
	public String getRandom() {
	Random rnd = new Random();
	num = rnd.nextInt(999999);
//	long num=Math.round(Math.random()*999999);
//	String s=num+"";
	
	return String.format("%06d", num);
	}

	public boolean sendMail(String toMail){
		
		boolean test = false;
		
		Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");
		
		String fromMail="ishitajain9399@gmail.com";
		String password="qwgbcvwwcwyuubvf";
		
		
		Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromMail, password);
            }
        });
		
		try {
			
     	Message mess = new MimeMessage(session);
			
			mess.setFrom(new InternetAddress(fromMail ));
			mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
			
			mess.setSubject("User Email Verification");
			mess.setText("Please verify your account using this code "+getRandom());
			Transport.send(mess);
			test=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return test;
	}
}
