package com.zcy.view;

import java.util.Scanner;

import com.zcy.controller.Add;

public class AdminMenu {
	public static void admin() {
		while (true) {
			System.out.println("╔──────────────────────────────────────────────────────────╗");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                     员工工作日志监控系统 (admin)            │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│ 1. - 增加系统用户                                                                                        │");
			System.out.println("│ 2. - 批量增加系统用户                                                                                 │");
			System.out.println("│ 3. - 卸载员工工作日志分析报告                                                                 │");
			System.out.println("│ 4. - 用户因辞职或退休消户 （选做）                                                        │");
			System.out.println("│ 5. - 用户因跨部门调整用工号 （选做）                                                    │");
			System.out.println("│ 6. - 用户因升降级调整用工号或部门号（选做）                                      │");
			System.out.println("│                                                          │");
			System.out.println("│                                                          │");
			System.out.println("│                                                 0. - Quit│");
			System.out.println("│                                                          │");
			System.out.println("│                                Designed by ZCY in FuZhou │");
			System.out.println("╚──────────────────────────────────────────────────────────╝");
			System.out.println("你的选择:");
			Scanner sc1 = new Scanner(System.in);
			String s = sc1.nextLine();
			switch (s) {
			case "1":
				Add.setUser();
				break;
			case "2":
				break;
			case "3":
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
