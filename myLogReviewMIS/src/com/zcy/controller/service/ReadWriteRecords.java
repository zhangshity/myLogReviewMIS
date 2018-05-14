package com.zcy.controller.service;

import java.util.ArrayList;

import com.zcy.domain.Employee;
import com.zcy.domain.EmployeeLog;
import com.zcy.model.ReadWriteInterface;
import com.zcy.model.implement.ReadWriteTxt;

public class ReadWriteRecords {
	public static ArrayList<Employee> getEmployee() {
		ReadWriteTxt r = new ReadWriteTxt();
		ReadWriteInterface ri = r;
		return ri.readEmployee();
	}

	public static ArrayList<EmployeeLog> getEmployeeLog() {
		ReadWriteTxt r = new ReadWriteTxt();
		ReadWriteInterface ri = r;
		return ri.readEmployeeLog();
	}

	public static void setEmployee(ArrayList<Employee> list) {
		ReadWriteTxt w = new ReadWriteTxt();
		ReadWriteInterface wi = w;
		wi.writeEmloyee(list);
	}

	public static void setEmployeeLog(ArrayList<EmployeeLog> list) {
		ReadWriteTxt w = new ReadWriteTxt();
		ReadWriteInterface wi = w;
		wi.writeEmployeeLog(list);
	}
	
	public static void reSetEmployeeLog(ArrayList<EmployeeLog> list) {
		ReadWriteTxt w = new ReadWriteTxt();
		ReadWriteInterface wi = w;
		wi.reWriteEmployeeLog(list);
	}

}
