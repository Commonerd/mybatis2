
package myschool.service;



import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Scanner;



import myschool.dao.StudentDao;

import myschool.dto.Student;



public class StudentService {


	StudentDao dao = new StudentDao();

	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");

	

	public void addStudent(Scanner scan) {

		System.out.println("학생정보 입력");
		Student s = new Student();
		System.out.print("name > ");
		s.setName(scan.next());
		System.out.print("userid > ");
		s.setUserid(scan.next());
		System.out.print("grade > ");
		s.setGrade(scan.nextInt());;
		System.out.print("idnum > ");
		s.setIdnum(scan.next());
		System.out.print("birthdate(yy/MM/dd) >");
		String birth =  scan.next();
		
		Date b = null; 

		try {

			b = sdf.parse(birth);

		} catch (ParseException e) {

			System.out.println("날짜 형식이 틀림(yy/MM/dd)");

		}

		s.setBirthdate(b);

		System.out.print("tel");

		s.setTel(scan.next());

		System.out.print("height");

		s.setHeight(scan.nextInt());

		System.out.print("weight");

		s.setWeight(scan.nextInt());

		System.out.print("deptno");

		s.setDeptno(scan.nextInt());

		System.out.print("profno");

		s.setProfno(scan.nextInt());

		int i = dao.addStudent(s);

		if (i > 0) {

			System.out.println(i+"번 학생 정보가 추가되었습니다.");

		}

	}



	public void updateGrade(Scanner scan) {

		System.out.println("학년 수정");

		System.out.print("학번 > ");

		int studno = scan.nextInt();

		System.out.print("변경할 학년 > ");

		int grade = scan.nextInt();



		Map<String, Object> m = new HashMap<String, Object>();

		m.put("studno", studno);

		m.put("grade", grade);



		int i = dao.updateGrade(m);



		if (i > 0) {

			System.out.println(studno + " 학생이 " + grade + "학년으로 변경됨.");

		} else {

			System.out.println(studno + " : 학생 없음");

		}

	}



	public void deleteStudent(Scanner scan) {

		System.out.println("학생 정보 삭제");



		System.out.print("학번 > ");

		int studno = scan.nextInt();



		int i = dao.deleteStudent(studno);



		if (i > 0) {

			System.out.println(studno + " 학생이 삭제됨.");

		} else {

			System.out.println(studno + " : 학생 없음");

		}

	}



	public void selectNo(Scanner scan) {

		System.out.println("학생 정보 조회(학번)");

		System.out.print("학번 > ");



		int studno = scan.nextInt();

		Student s = dao.selectNo(studno);

		if (s == null) {

			System.out.println(studno + " : 학생 없음");

		} else {

			System.out.println(s);

		}

	}



	public void selectName(Scanner scan) {

		System.out.println("학생 정보 조회(이름)");

		System.out.print("이름 > ");

		String name = scan.next();

		List<Student> list = dao.selectName(name);

		if (list.size() == 0) {

			System.out.println(name + " : 학생 없음");

		} else {

			for (Student s : list) {

				System.out.println(s);

			}

		}

	}

}