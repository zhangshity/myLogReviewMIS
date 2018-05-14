package com.zcy.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.zcy.controller.service.ReadWriteRecords;
import com.zcy.domain.Employee;
import com.zcy.domain.EmployeeLog;

public class Review {
	public static void setDMReview() { // 评分
		int name = Integer.parseInt(SaveLogin.name);
		ArrayList<EmployeeLog> list = new ArrayList<EmployeeLog>();
		ArrayList<EmployeeLog> nlist = new ArrayList<EmployeeLog>();
		Scanner sc5 = new Scanner(System.in);

		list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		
		Iterator<EmployeeLog> iter = list.iterator(); // 迭代器遍历 
		while (iter.hasNext()) {
			EmployeeLog el = iter.next(); //正则表达式判断，是否为部门经理DM的员工号，且记录没有审核（成绩为"0"）
			if (el.getNumber().matches("[2-9][0]{4}") && el.getGrade().equals("0")) { 
				result = el.getNumber() + "  " + el.getDate() + "  " + el.getLog();
				System.out.println(result);
				System.out.println("得分(0-100)："); //遍历过程中评分
				String grade = sc5.nextLine();
				el.setGrade(grade);  //调用对象的set方法，把分数写入对象的great属性中
				nlist.add(el);  // 添加到新集合，新的集合只有刚刚审批过
				iter.remove();  // 审批完成的移除，旧的集合删除了刚刚审批的
			}	
		}
		ReadWriteRecords.reSetEmployeeLog(list); //把Log.txt中的文件覆盖（删除了评分完成的）
		ReadWriteRecords.setEmployeeLog(nlist); //把评分完成的添加到进去
	}
		
//		for (EmployeeLog el : list) {
//			if (el.getNumber().matches("[2-9][0]{4}") && el.getGrade().equals("0")) {
//				result += el.getNumber() + "  " + el.getDate() + "  " + el.getLog();
//				System.out.println(result);
//				System.out.println("得分(0-100)：");
//				String grade = sc5.nextLine();
//				el.setGrade(grade);
//				nlist.add(el);  // 新的集合只有刚刚审批过
//				list.remove(el);  // 旧的集合删除了刚刚审批的
//			}
//		}
//		ReadWriteRecords.reSetEmployeeLog(list);
//		ReadWriteRecords.setEmployeeLog(nlist);
//	}
	
	
	public static void setEmployeeReview() { // 评分
		int name = Integer.parseInt(SaveLogin.name);
		int i = name/10000;
		ArrayList<EmployeeLog> list = new ArrayList<EmployeeLog>();
		ArrayList<EmployeeLog> nlist = new ArrayList<EmployeeLog>();
		Scanner sc5 = new Scanner(System.in);

		list = ReadWriteRecords.getEmployeeLog();
		String result = "";
		
		Iterator<EmployeeLog> iter = list.iterator();
		while (iter.hasNext()) {
			EmployeeLog el = iter.next();
			if (Integer.parseInt(el.getNumber()) > i * 10000 && Integer.parseInt(el.getNumber()) < (i + 1) * 10000 && el.getGrade().equals("0")) { 
				result = el.getNumber() + "  " + el.getDate() + "  " + el.getLog();
				System.out.println(result);
				System.out.println("得分(0-100)：");
				String grade = sc5.nextLine();
				el.setGrade(grade);
				nlist.add(el);  // 新的集合只有刚刚审批过
				iter.remove();  // 旧的集合删除了刚刚审批的
			}	
		}
		ReadWriteRecords.reSetEmployeeLog(list);
		ReadWriteRecords.setEmployeeLog(nlist);
	}
//		for (EmployeeLog el : list) {
//			if (Integer.parseInt(el.getNumber()) > i * 10000 && Integer.parseInt(el.getNumber()) < (i + 1) * 10000 && el.getGrade().equals("0")) {
//				result += el.getNumber() + "  " + el.getDate() + "  " + el.getLog();
//				System.out.println(result);
//				System.out.println("得分(0-100)：");
//				String grade = sc5.nextLine();
//				el.setGrade(grade);
//				nlist.add(el);  // 新的集合只有刚刚审批过
//				list.remove(el);  // 旧的集合删除了刚刚审批的
//			}
//		}
//		ReadWriteRecords.reSetEmployeeLog(list);
//		ReadWriteRecords.setEmployeeLog(nlist);
//	}
	
}
