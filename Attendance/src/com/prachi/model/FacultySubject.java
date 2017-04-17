package com.prachi.model;

public class FacultySubject {

	private  String FacultyID;
	private  String BranchID;
	private  String Semester;
	public String getFacultyID() {
		return FacultyID;
	}
	public void setFacultyID(String facultyID) {
		FacultyID = facultyID;
	}
	public String getBranchID() {
		return BranchID;
	}
	public void setBranchID(String branchID) {
		BranchID = branchID;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public String getSubjectID() {
		return SubjectID;
	}
	public void setSubjectID(String subjectID) {
		SubjectID = subjectID;
	}
	private  String SubjectID;
}
