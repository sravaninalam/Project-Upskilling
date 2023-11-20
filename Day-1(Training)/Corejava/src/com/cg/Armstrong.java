package com.cg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=sc.nextInt();
		
		int temp=num; 
		int rem,sum=0;
		while(num>0) {
		rem=num%10; //store remainder
		sum=sum+(rem*rem*rem);
		num=num/10; //store quotient
		}
		if(temp==sum){
		System.out.println("The given Number is armstrong");
		}
		else {
		System.out.println("The given number is not armstrong");
		}
	}


}
