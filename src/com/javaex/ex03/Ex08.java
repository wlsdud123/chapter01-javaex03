package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요");
	System.out.print("숫자: ");
	int print = sc.nextInt();
	
	
	if(print>0)
	{
		if(print%2==0)
		{
		System.out.print("짝수입니다.");
		}
		else {
		System.out.print("홀수입니다.");
		}
		}
	
		else if(print<0)
		{
			System.out.print("음수입니다.");
		}		
		else
	
			System.out.print("0입니다.");
		}

}
