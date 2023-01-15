package com.emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String companySuffix="Accenture.com";
	private String email;
	
	// constructor to receive the firstname and lastname
	
	public Email(String firstName, String lastName) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		
		//System.out.println("Email created : " +this.firstName+" "+this.lastName);
		
		this.department=setDepartment();
		//System.out.println("Department :" +this.department);
		
		// generate random password
		
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("your password is :" +this.password);
		
		// combine element to generate email
		
		email=firstName.toLowerCase()+"." +lastName.toLowerCase() +"@"+ department+"." +companySuffix;
		//System.out.println("Your Email is :" +email);
		
	
	
	
	}
	private String setDepartment() {
		System.out.println("Department Code\n1 for Sales\n2 for Development\n3 for Account\0 for none\nEnter the Department Code :");
		Scanner scan= new Scanner(System.in);
		int depChoice=scan.nextInt();
		
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acc";}
		else {return "";}
		
		
	}
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$%&";
		char[] password= new char[length];
		Random r=  new Random();
		for(int i=0;i<length;i++)
		{
			// int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(r.nextInt(passwordSet.length()));
			//password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
		
	}
	
	// Set Mailbox capacity
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	//alter email
	public void setAlterEmail(String altemail)
	{
		this.alternateEmail=altemail;
	}
	// change the password
	
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity;}
	//public String getAlterEMail() { return alternateEmail;}
	public String getChangePassword() {return password;}
	
	public void showInfo() {
		System.out.println(firstName+","+ lastName);
		System.out.println(department);
		System.out.println(email);
		System.out.println(password);
		System.out.println(alternateEmail);
		
	}

}
