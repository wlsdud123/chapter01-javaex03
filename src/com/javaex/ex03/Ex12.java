package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month)
		{
		case 1:
		System.out.print("31일 입니다.");
		break;
		case 2:
		System.out.print("28일 입니다.");
		break;		
		case 3:
		System.out.print("31일 입니다.");
		break;		
		case 4:
		System.out.print("30일 입니다.");
		break;		
		case 5:
		System.out.print("31일 입니다.");
		break;		
		case 6:
		System.out.print("30일 입니다.");
		break;
		case 7:
		System.out.print("31일 입니다.");
		break;
		case 8:
		System.out.print("31일 입니다.");
		break;
		case 9:
		System.out.print("30일 입니다.");
		break;
		case 10:
		System.out.print("31일 입니다.");
		break;
		case 11:
		System.out.print("30일 입니다.");
		break;
		default:
		System.out.print("31일 입니다.");
		break;
		}
		sc.close();

	}
	}



