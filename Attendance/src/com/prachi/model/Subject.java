package com.prachi.model;

public class Subject {
	public String getSubjectID() {
		return SubjectID;
	}
	public void setSubjectID(String subjectID) {
		SubjectID = subjectID;
	}
	public String getBranchID() {
		return BranchID;
	}
	public void setBranchID(String branchID) {
		BranchID = branchID;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	private  String SubjectID;
	private  String BranchID;
	private String SubjectName;
	private  String Semester;
	private String Status;


}
