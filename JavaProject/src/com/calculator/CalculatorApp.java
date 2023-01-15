package com.calculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Calcu c1 = new CalcuImpl();
		Scanner scan= new Scanner(System.in);
		int a=0;
		int b=0;
		
		
		
			
			while(true)
			{
				System.out.println("Welcom To Calculator");
				System.out.println("1. Addition\n2. Multiple\n3. Division\n4. Substraction\n5. Exit");
				System.out.println("Enter Your Choice"); 
				int choice=scan.nextInt();
				
				if(choice>=1 && choice<=4) {
					System.out.println("enter the First Number");
					a=scan.nextInt();
					System.out.println("enter the Secound Number");
					b=scan.nextInt();
				}
					switch(choice) {
					
					case 1:
						System.out.println("The sum of two Number is " +c1.add(a, b));
						break;
					case 2:
						System.out.println("The Multiple of two number is " +c1.mul(a, b));
						break;
					case 3:
						System.out.println("the Division of two number is "  +c1.div(a, b));
						break;
					case 4:
						System.out.println("the Substract of two number is " +c1.sub(a, b));
						break;
					case 5:
						System.out.println("Thank You For Using calculator");
						System.exit(0);
					default:
						System.out.println("invalid Choice");
					
					}
			}
			
		}
		

	}
