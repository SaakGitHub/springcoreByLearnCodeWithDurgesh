package com.springcore.springcoreproject;

public class StudentBean {
	private int studentId;
	private String studentName;
	private String StudentAddres;
	
	
	
	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName=" + studentName + ", StudentAddres="
				+ StudentAddres + "]";
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(int studentId, String studentName, String studentAddres) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentAddres = studentAddres;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddres() {
		return StudentAddres;
	}
	public void setStudentAddres(String studentAddres) {
		StudentAddres = studentAddres;
	}
	
	
	
}
