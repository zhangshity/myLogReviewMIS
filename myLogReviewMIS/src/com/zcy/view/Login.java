package com.zcy.view;

import java.util.ArrayList;

import com.zcy.controller.SaveLogin;
import com.zcy.controller.service.ReadWriteRecords;
import com.zcy.domain.Employee;

public class Login {

	public static void loginJudge(String s1, String s2) {
		SaveLogin.name = s1;
		SaveLogin.password = s2;
		ArrayList<Employee> list = ReadWriteRecords.getEmployee();
		for (Employee e : list) {
			if (s1.equals(e.getNumber())) { // 遍历的职员中不存在员工编号，即不存在 1！
				if (s1.equals(e.getNumber()) && s2.equals(e.getNumber())) { // 账号密码都存则进入系统2!
					if (s1.equals("00000")) { // 判断账户类型，进入相应UI
						AdminMenu.admin();
					} else if (s1.equals("10000")) {
						GMMenu.GM();
					} else if (s1.matches("[2-9][0]{4}")) {
						DMMenu.DM();
					} else if (s1.matches("[0-9]{5}") && !s1.matches("[0-9][0]{4}")) {
						EmployeeMenu.employee();
					}
				} else { // 2！
					System.out.println("Wrong password!");
				}

			} else { // 1!
				System.out.println("Account Not Exist!");
			}
		}
	}

}
