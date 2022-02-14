
package myschool.service;



import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Scanner;

import myschool.dao.ProfessorDao;
import myschool.dao.StudentDao;
import myschool.dto.Professor;
import myschool.dto.Student;



public class ProfessorService {


	ProfessorDao dao = new ProfessorDao();

	SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");

	

	public void addProfessor(Scanner scan) {

		System.out.println("교수정보 입력");
		Professor p = new Professor();
		System.out.print("name > ");
		p.setName(scan.next());
		System.out.print("userid > ");
		p.setUserid(scan.next());
		System.out.print("position > ");
		p.setPosition(scan.next());
		System.out.print("sal > ");
		p.setSal(scan.nextInt());
		System.out.print("hiredate(yy/MM/dd) >");
		String hire =  scan.next();
		System.out.print("comm > ");
		p.setComm(scan.nextInt());
		System.out.print("deptno > ");
		p.setDeptno(scan.nextInt());
		
		Date b = null; 

		try {

			b = sdf.parse(hire);

		} catch (ParseException e) {

			System.out.println("날짜 형식이 틀림(yy/MM/dd)");

		}

		p.setHiredate(b);

		

		int i = dao.addProfessor(p);

		if (i > 0) {

			System.out.println(i+"번 교수 정보가 추가되었습니다.");

		}

	}



	public void updateSal(Scanner scan) {

		System.out.println("급여 수정");

		System.out.print("급여 > ");

		int profno = scan.nextInt();

		System.out.print("변경할 급여 > ");

		int sal = scan.nextInt();



		Map<String, Object> m = new HashMap<String, Object>();

		m.put("profno", profno);

		m.put("sal", sal);



		int i = dao.updateSal(m);



		if (i > 0) {

			System.out.println(profno + " 교수가 " + sal + "급여로 변경됨.");

		} else {

			System.out.println(profno + " : 교수 없음");

		}

	}



	public void deleteProfessor(Scanner scan) {

		System.out.println("교수 정보 삭제");



		System.out.print("교수번호 > ");

		int profno = scan.nextInt();



		int i = dao.deleteProfessor(profno);



		if (i > 0) {

			System.out.println(profno + " 교수가 삭제됨.");

		} else {

			System.out.println(profno + " : 교수 없음");

		}

	}



	public void professorNo(Scanner scan) {

		System.out.println("교수 정보 조회(교수번호)");

		System.out.print("교수번호 > ");



		int profno = scan.nextInt();

		Professor s = dao.professorNo(profno);

		if (s == null) {

			System.out.println(profno + " : 교수 없음");

		} else {

			System.out.println(s);

		}

	}



	public void professorInfo() {

		System.out.println("교수 정보 조회");

		List<Professor> list = dao.professorInfo();

		if (list.size() == 0) {

			System.out.println(" 교수 없음");

		} else {

			for (Professor p : list) {

				System.out.println(p);

			}

		}

	}

}