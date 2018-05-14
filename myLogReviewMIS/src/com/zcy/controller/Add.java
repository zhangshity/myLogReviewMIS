package com.zcy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.zcy.controller.service.ReadWriteRecords;
import com.zcy.domain.Employee;
import com.zcy.domain.EmployeeLog;

public class Add {
	public static void setLog() { // 员工添加log
		ArrayList<EmployeeLog> list = new ArrayList<EmployeeLog>();
		Scanner sc5 = new Scanner(System.in);
		System.out.println("请输入日期：");
		String date = sc5.nextLine();
		System.out.println("请输入日志：");
		String log = sc5.nextLine();
		EmployeeLog el = new EmployeeLog();
		el.setNumber(SaveLogin.name);
		el.setDate(date);
		el.setLog(log);
		el.setGrade("0");
		list.add(el);
		ReadWriteRecords.setEmployeeLog(list);
	}

	public static void setUser() { // 添加用户
		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<Employee> nlist = new ArrayList<Employee>();
		Scanner sc5 = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = sc5.nextLine();
		String deptNo = null;
		System.out.println("请输入部门编号(1位数字)：");
		deptNo = sc5.nextLine();
		while (!deptNo.matches("[2-9]")) {// 判断
			System.out.println("错误！请重新输入(1位数字)：");
			deptNo = sc5.nextLine();
		}
		list = ReadWriteRecords.getEmployee();
		String manager = null;
		for (Employee e : list) {  //遍历集合，如果对象的号码和输入数*10000相等，说明对象是部门主管
			if (Integer.parseInt(e.getNumber()) == Integer.parseInt(deptNo) * 10000)
				manager = e.getName();  //取出集合中的对象的属性：部门主管
		}
		int[] no = new int[100];
		int i = 0;
		for (Employee e : list) { //如果遍历集合的对象的号码取整10000，与输入部门号相同，则说明为同一部门
			if (Integer.parseInt(e.getNumber()) / 10000 == Integer.parseInt(deptNo)) {
				no[i] = Integer.parseInt(e.getNumber());  //这时把所有的同部门的部门号装到数组中
				i++;
			}
		}
		Arrays.sort(no);  //排序后，取出数组下标最大值，即为最大编号，
		String number=Integer.toString(no[i]+1);  //加一即自动存放编号
		Employee e = new Employee();
		e.setNumber(number);  //输入部门号，自动添加员工号
		e.setName(name);
		e.setManager(manager); // 输入部门号，自动添加部门经理
		nlist.add(e);
		ReadWriteRecords.setEmployee(nlist);  //写入txt
	}
}
