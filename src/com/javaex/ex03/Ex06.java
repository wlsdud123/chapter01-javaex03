package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 ");
		int a = sc.nextInt();
		int aa = (a%3);
		
		if(aa == 0)
		{
		System.out.println(""+a+"은(는) 3의 배수 입니다.");
		}
		else
		{
			System.out.println(""+a+"은(는) 3의 배수가 아닙니다.");
		}
	
		

	}

}
