package com.emailApp;

public class EmailApp {
	public static void main(String[] args) {
		Email e1= new Email("shabaz","Hussain");
		e1.setAlterEmail("this is alter email address : "+"shabaz@evolvus.com");
//		System.out.println(e1.getAlterEMail());
		e1.showInfo();
		
	}

}
