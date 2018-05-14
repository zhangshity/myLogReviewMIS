package com.zcy.model;

import java.util.ArrayList;

import com.zcy.domain.Employee;
import com.zcy.domain.EmployeeLog;

public interface ReadWriteInterface {
	ArrayList<Employee> readEmployee();

	ArrayList<EmployeeLog> readEmployeeLog();

	void writeEmloyee(ArrayList<Employee> list);

	void writeEmployeeLog(ArrayList<EmployeeLog> list);

	void reWriteEmployeeLog(ArrayList<EmployeeLog> list);
}
