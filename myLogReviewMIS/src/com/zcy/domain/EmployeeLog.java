package com.zcy.domain;

public class EmployeeLog implements Comparable<EmployeeLog> {
	String number;
	String date;
	String log;
	String grade;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int compareTo(EmployeeLog o) {
		int i = this.getNumber().compareTo(o.getNumber());
		if (i != 0) {
			return i;
		} else {
			return this.getDate().compareTo(o.getDate());
		}
	}
}
