package com.zcy.view;

import java.util.Scanner;

import com.zcy.controller.Add;
import com.zcy.controller.Display;
import com.zcy.controller.Review;

public class DMMenu {
	public static void DM() {
		while (true) {
			System.out.println("╔──────────────────────────────────────────────────────────╗");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                     员工工作日志监控系统 (DM)                 │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│ 1. - 增加工作日志                                                                                                     │");
			System.out.println("│ 2. - 查看个人工作日志                                                                                              │");
			System.out.println("│ 3. - 审批直管下属的日志                                                                                          │");
			System.out.println("│ 4. - 查看直管下属历史日志                                                                                      │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                 0. - Quit│");
			System.out.println("│                                                          │");
			System.out.println("│                                Designed by ZCY in FuZhou │");
			System.out.println("╚──────────────────────────────────────────────────────────╝");
			System.out.println("你的选择:");
			Scanner sc3 = new Scanner(System.in);
			String s = sc3.nextLine();
			switch (s) {
			case "1":
				Add.setLog();
				break;
			case "2":
				Display.PrintDMLog();
				System.out.println("Press Enter to continue...");
				sc3.nextLine();
				break;
			case "3":
				Review.setEmployeeReview();
				break;
			case "4":
				Display.PrintDMEmployeeLog();
				System.out.println("Press Enter to continue...");
				sc3.nextLine();
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
