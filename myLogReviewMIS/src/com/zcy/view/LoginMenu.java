package com.zcy.view;

import java.util.Scanner;

public class LoginMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("╔──────────────────────────────────────────────────────────╗");
			System.out.println("│                                                          │");
			System.out.println("│          Log Review Management Information System        │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│         Welcome! Please input UserName and Password      │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                              Q. - Quit   │");
			System.out.println("│                                Press Enter to continue...│");
			System.out.println("│                                                          │");
			System.out.println("│                                Designed by ZCY in FuZhou │");
			System.out.println("╚──────────────────────────────────────────────────────────╝");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			if (s.toLowerCase().equals("q")) {
				System.out.println("System off......");
				System.exit(0);
			}
			System.out.println(" ========================================================== ");
			System.out.println(" Please input your UserName:                                ");
			String name = sc.nextLine();
			System.out.println(" Please input your Password:                                ");
			String password = sc.nextLine();
			Login.loginJudge(name,password);
			sc.close();
		}
	}
}
