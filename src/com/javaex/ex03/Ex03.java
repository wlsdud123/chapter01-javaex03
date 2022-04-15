package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요");
				System.out.print("숫자: ");
				int a = sc.nextInt();
				
				if (a > 0) {
				System.out.print("양수입니다.");
				}
				
				else if (a < 0)
				{
				System.out.print("음수입니다.");
				}
				/*else if (a == 0)
				{
				System.out.print("0입니다.");
				}*/
				else
				{
				System.out.print("0입니다.");
				}				
				

				sc.close();

		}
		}
