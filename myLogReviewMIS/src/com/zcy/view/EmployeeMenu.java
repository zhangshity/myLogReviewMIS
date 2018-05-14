package com.zcy.view;

import java.util.Scanner;

import com.zcy.controller.Add;
import com.zcy.controller.Display;

public class EmployeeMenu {
	public static void employee() {
		while (true) {
			System.out.println("╔──────────────────────────────────────────────────────────╗");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                     员工工作日志监控系统(Employee)           │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│ 1. - 增加工作日志                                                                                                     │");
			System.out.println("│ 2. - 查看个人工作日志                                                                                             │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                 0. - Quit│");
			System.out.println("│                                                          │");
			System.out.println("│                                Designed by ZCY in FuZhou │");
			System.out.println("╚──────────────────────────────────────────────────────────╝");
			System.out.println("你的选择:");
			Scanner sc4 = new Scanner(System.in);
			String s = sc4.nextLine();
			switch (s) {
			case "1":
				Add.setLog();
				break;
			case "2":
				Display.PrintEmployeeLog();
				System.out.println("Press Enter to continue...");
				sc4.nextLine();
				break;
			case "0":
				System.out.println("System off......");
				System.exit(0);
				break;
			default:
				break;
			}

		}
	}
}
