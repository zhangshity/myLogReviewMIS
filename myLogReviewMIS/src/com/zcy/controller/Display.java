package com.zcy.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.zcy.controller.service.ReadWriteRecords;
import com.zcy.domain.EmployeeLog;

public class Display {

	/*
	 * ========员工========= ====================== ======================
	 * 
	 */

	public static void PrintEmployeeLog() { // 员工自己日志
		int name = Integer.parseInt(SaveLogin.name);
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		for (EmployeeLog e : list) {
			if (Integer.parseInt(e.getNumber()) == name) {// e.getNumber().matches("[name][0-9]{4}")正则表达式不行
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

	/*
	 * ========部门经理========= ====================== ======================
	 * 
	 */
	public static void PrintDMEmployeeLog() { // DM 下属员工日志
		int name = Integer.parseInt(SaveLogin.name);
		int i = name / 10000;
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		for (EmployeeLog e : list) {
			if (Integer.parseInt(e.getNumber()) > i * 10000 && Integer.parseInt(e.getNumber()) < (i + 1) * 10000) {// e.getNumber().matches("[name][0-9]{4}")正则表达式不行
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

	public static void PrintDMLog() { // DM 自己的日志
		int name = Integer.parseInt(SaveLogin.name);
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		for (EmployeeLog e : list) {
			if (Integer.parseInt(e.getNumber()) == name) {// e.getNumber().matches("[name][0]{4}")正则表达式不行
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

	/*
	 * ========总经理========= ====================== ======================
	 * 
	 */
	public static void PrintGMEmployeeLog() { // GM 所有员工的日志
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		for (EmployeeLog e : list) {
			if (e.getNumber().matches("[2-9][0-9]{4}") && !e.getNumber().matches("[2-9][0]{4}")) {
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

	public static void PrintGMDMLog() { // GM 下属DM的日志
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		for (EmployeeLog e : list) {
			if (e.getNumber().matches("[2-9][0]{4}")) {
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

	public static void PrintGMEmployeeLogFormatted() { // GM 所有员工日志排序输出
		ArrayList<EmployeeLog> list = ReadWriteRecords.getEmployeeLog();
		Collections.sort(list);
		String result = "";
		for (EmployeeLog e : list) {
			if (e.getNumber().matches("[2-9][0-9]{4}") && !e.getNumber().matches("[2-9][0]{4}")) {
				result += e.getNumber() + "  " + e.getDate() + "  " + e.getLog() + "  " + e.getGrade() + "\n";
			}
		}
		System.out.println(result);
	}

}
