package com.web.java;

import java.util.Scanner;

public class CalculateDistance_13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distane:");
		int distance=sc.nextInt();
     	System.out.println("enter the time:");
     	int time=sc.nextInt();
     	float speed=0;
     	if(time!=0)
     	{
     		speed =distance/time;
     	}
		
        System.out.println("The speed of the vehicle is="+speed);
	}

}
