package com.calculator1;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator c1= new CalculatorImpl();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("welcome to calculator");
		
		
		System.out.println("=====================");
		
		while(true) {
			System.out.println("enter your choice");
			System.out.println("1.Addition\n2.Substraction\n3.Multification\n4.Division\n5.exit");
			int choice=scan.nextInt();
			
			int a=0;
			int b=0;
			
			
			if(choice>=1 && choice<=4)
			{
				

				System.out.println("enter the first number");
				a=scan.nextInt();
				System.out.println("enter the secound number");
				b=scan.nextInt();

				
			}
			
			
			switch(choice) {
			case 1:
				
				int sum=c1.add(a, b);
				System.out.println(" sum of two number is  " +sum);
				System.out.println();
				break;
				
			case 2:
				int sub=c1.sub(a, b);
				System.out.println("substraction of two number is  " + sub);
				System.out.println();
				break;
			case 3:
				int mul=c1.mul(a, b);
				System.out.println("multifiaction of two number is  " +mul);
				System.out.println();
				break;
				
			case 4:
				int div=c1.div(a,b);
				System.out.println("division of two number is  "+ div);
				System.out.println();
				
			case 5:
				System.out.println("Thank You!! For using Calculator");
				System.out.println();
				System.exit(0);
			
			default:
				System.out.println("invalid choice");
				System.out.println();
				
			}
		}
	}

}
