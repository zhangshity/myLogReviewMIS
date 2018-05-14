package com.zcy.view;

import java.util.Scanner;

import com.zcy.controller.Display;
import com.zcy.controller.Review;

public class GMMenu {
	public static void GM() {
		while (true) {
			System.out.println("╔──────────────────────────────────────────────────────────╗");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                     员工工作日志监控系统(GM)                 │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│ 1. - 查看员工工作日志和打分情况                                                                           │");
			System.out.println("│ 2. - 查看直管下属的日志                                                                                          │");
			System.out.println("│ 3. - 查看员工工作日志和打分情况并排序输出                                                        │");
			System.out.println("│ 4. - 审批直管下属的日志                                                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                 0. - Quit│");
			System.out.println("│                                                          │");
			System.out.println("│                                Designed by ZCY in FuZhou │");
			System.out.println("╚──────────────────────────────────────────────────────────╝");
			System.out.println("你的选择:");
			Scanner sc2 = new Scanner(System.in);
			String s = sc2.nextLine();
			switch (s) {
			case "1":
				Display.PrintGMEmployeeLog();
				System.out.println("Press Enter to continue...");
				sc2.nextLine();
				break;
			case "2":
				Display.PrintGMDMLog();
				System.out.println("Press Enter to continue...");
				sc2.nextLine();
				break;
			case "3":
				Display.PrintGMEmployeeLogFormatted();
				System.out.println("Press Enter to continue...");
				sc2.nextLine();
				break;
			case "4":
				Review.setDMReview();
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