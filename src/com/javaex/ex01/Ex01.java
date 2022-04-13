/*
작성자: 전진영
작성일: 2022-04-13
설명: 나이기록 프로그램
*/



package com.javaex.ex01;

public class Ex01 {

	
	public static void main(String[] args)
	{
	
	int myage = 25; //변수선언 + 초기화 (같이)
		
		
		
	/*
	int myage; //int 정수 -2147483648 ~ 2147483647
	myage = 25;
	
	//메모리의 값을 출력하는 메소드
	System.out.println(myage);
	
	myage = 26;
	System.out.println(myage);
	*/
		
	byte no; //byte 정수 -128 ~ 127
	no = 127;
	System.out.println(no);
	
	
	/* int범위까지는 L을 붙이지 않아도된다. */
	long no2;
	no2 = 2147483647;
	System.out.println(no2);
	
	////////////////////////////////
	
	//변수여러개일때 선언후 초기화
	int var01;
	int var02;
	int var03;

	
	var01 = 10;
	var02 = 20;
	var03 = 30;
	
	//변수여러개일때 변수+초기화
	int var04 = 10;
	int var05 = 20;
	int var06 = 30;
	}

}
