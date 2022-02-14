package myschool.dto;

import java.util.Date;

public class Student {
	int studno;
	String name;
	String userid;
	int grade;
	String idnum;
	Date birthdate;
	String tel;
	int height;
	int weight;
	int deptno;
	int profno;
	public Student() {}
	public Student(int studno, String name, String userid, int grade, String idnum, Date birthdate, String tel,
			int height, int weight, int deptno, int profno) {
		super();
		this.studno = studno;
		this.name = name;
		this.userid = userid;
		this.grade = grade;
		this.idnum = idnum;
		this.birthdate = birthdate;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno = deptno;
		this.profno = profno;
	}
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getIdnum() {
		return idnum;
	}
	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	@Override
	public String toString() {
		return "student [studno=" + studno + ", name=" + name + ", userid=" + userid + ", grade=" + grade + ", idnum="
				+ idnum + ", birthdate=" + birthdate + ", tel=" + tel + ", height=" + height + ", weight=" + weight
				+ ", deptno=" + deptno + ", profno=" + profno + "]";
	}
	
	
	
	

	
}
