package ksmart31.team02.document.domain;

public class LeaveApplication {

private String department_name;
private String member_position_name;
private String member_name;
private String leave_application_date;
private String leave_category_sort;
private String leave_application_start_day;
private String leave_application_end_day;	
private int leave_application_day;
private int leave_application_hour;
private String leave_application_reason;
private String leave_detail_sort;
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public String getMember_position_name() {
	return member_position_name;
}
public void setMember_position_name(String member_position_name) {
	this.member_position_name = member_position_name;
}
public String getMember_name() {
	return member_name;
}
public void setMember_name(String member_name) {
	this.member_name = member_name;
}
public String getLeave_application_date() {
	return leave_application_date;
}
public void setLeave_application_date(String leave_application_date) {
	this.leave_application_date = leave_application_date;
}
public String getLeave_category_sort() {
	return leave_category_sort;
}
public void setLeave_category_sort(String leave_category_sort) {
	this.leave_category_sort = leave_category_sort;
}
public String getLeave_application_start_day() {
	return leave_application_start_day;
}
public void setLeave_application_start_day(String leave_application_start_day) {
	this.leave_application_start_day = leave_application_start_day;
}
public String getLeave_application_end_day() {
	return leave_application_end_day;
}
public void setLeave_application_end_day(String leave_application_end_day) {
	this.leave_application_end_day = leave_application_end_day;
}
public int getLeave_application_day() {
	return leave_application_day;
}
public void setLeave_application_day(int leave_application_day) {
	this.leave_application_day = leave_application_day;
}
public int getLeave_application_hour() {
	return leave_application_hour;
}
public void setLeave_application_hour(int leave_application_hour) {
	this.leave_application_hour = leave_application_hour;
}
public String getLeave_application_reason() {
	return leave_application_reason;
}
public void setLeave_application_reason(String leave_application_reason) {
	this.leave_application_reason = leave_application_reason;
}
public String getLeave_detail_sort() {
	return leave_detail_sort;
}
public void setLeave_detail_sort(String leave_detail_sort) {
	this.leave_detail_sort = leave_detail_sort;
}
@Override
public String toString() {
	return "LeaveApplication [department_name=" + department_name + ", member_position_name=" + member_position_name
			+ ", member_name=" + member_name + ", leave_application_date=" + leave_application_date
			+ ", leave_category_sort=" + leave_category_sort + ", leave_application_start_day="
			+ leave_application_start_day + ", leave_application_end_day=" + leave_application_end_day
			+ ", leave_application_day=" + leave_application_day + ", leave_application_hour=" + leave_application_hour
			+ ", leave_application_reason=" + leave_application_reason + ", leave_detail_sort=" + leave_detail_sort
			+ "]";
}




}
