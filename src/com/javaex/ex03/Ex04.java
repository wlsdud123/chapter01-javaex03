package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int a = sc.nextInt();
		int aa = a*10000;
		int b = aa+12000;
		
		if (a <= 8)
		{
			System.out.println("임금은 "+aa+"원 입니다.");
		}
		else 
		{
			System.out.println("임금은 "+b+"원 입니다.");
		}
			
		sc.close();
	

	}

}
