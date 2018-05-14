package com.zcy.model.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.zcy.domain.Employee;
import com.zcy.domain.EmployeeLog;
import com.zcy.model.ReadWriteInterface;

public class ReadWriteTxt implements ReadWriteInterface {
	public ArrayList<Employee> readEmployee() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		BufferedReader bf = null;

		try {
			bf = new BufferedReader(new FileReader("./src/com/zcy/resource/Employee.txt"));
			String s = null;
			while ((s = bf.readLine()) != null) {
				String[] split = s.split("\\s+");
				Employee emp = new Employee();
				emp.setNumber(split[0]);
				emp.setName(split[1]);
				emp.setManager(split[2]);
				list.add(emp);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bf != null)
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}
	

	public ArrayList<EmployeeLog> readEmployeeLog() {
		ArrayList<EmployeeLog> list = new ArrayList<EmployeeLog>();
		BufferedReader bf = null;

		try {
			bf = new BufferedReader(new FileReader("./src/com/zcy/resource/EmployeeLog.txt"));
			String s = null;
			while ((s = bf.readLine()) != null) {
				String[] split = s.split("\\s+");
				EmployeeLog emplog = new EmployeeLog();
				emplog.setNumber(split[0]);
				emplog.setDate(split[1]);
				emplog.setLog(split[2]);
				emplog.setGrade(split[3]);
				list.add(emplog);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bf != null)
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}

	public void writeEmloyee(ArrayList<Employee> list) {

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("./src/com/zcy/resource/Employee.txt", true));
			for (Employee e : list) {
				bw.write(e.getNumber() + " " + e.getName() + " " + e.getManager() + "\n");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	public void writeEmployeeLog(ArrayList<EmployeeLog> list) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("./src/com/zcy/resource/EmployeeLog.txt", true));
			for (EmployeeLog e : list) {
				bw.write(e.getNumber() + " " + e.getDate() + " " + e.getLog() + " " + e.getGrade() + "\n");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
	
	public void reWriteEmployeeLog(ArrayList<EmployeeLog> list) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("./src/com/zcy/resource/EmployeeLog.txt", false));
			for (EmployeeLog e : list) {
				bw.write(e.getNumber() + " " + e.getDate() + " " + e.getLog() + " " + e.getGrade() + "\n");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (bw != null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
