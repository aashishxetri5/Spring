package com.springcore;

public class Student {
	private int studentId;
	private String studentName, studentAddress;
	private Subjects subj1;
	private Subjects subj2;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress, Subjects subj1, Subjects subj2) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.subj1 = subj1;
		this.subj2 = subj2;
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

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Subjects getSubj1() {
		return subj1;
	}

	public void setSubj1(Subjects subj1) {
		this.subj1 = subj1;
	}

	public Subjects getSubj2() {
		return subj2;
	}

	public void setSubj2(Subjects subj2) {
		this.subj2 = subj2;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

}
