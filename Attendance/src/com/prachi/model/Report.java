package com.prachi.model;

public class Report {
	
	
	 private String branchid;
	 private String semester;
	 private String studentid;
	 private String previousdate;
	 private String nextdate;
	public String getPreviousdate() {
		return previousdate;
	}
	public void setPreviousdate(String previousdate) {
		this.previousdate = previousdate;
	}
	public String getNextdate() {
		return nextdate;
	}
	public void setNextdate(String nextdate) {
		this.nextdate = nextdate;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	
}

	