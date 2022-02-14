package myschool.main;


import java.util.Scanner;

import myschool.service.ProfessorService;
import myschool.service.StudentService;


public class ProfessorMain {

	public static void main(String[] args) {

		ProfessorService service = new ProfessorService();
		Scanner s = new Scanner(System.in);
		boolean flag = true;

		System.out.println("1.	교수 정보 추가");
		System.out.println("2.	교수의 급여(sal) 변경");
		System.out.println("3.	교수 정보 삭제");
		System.out.println("4.	교수 정보 조회(profno 기준)");
		System.out.println("5.	모든 교수 정보 조회");


		while (flag) {

			System.out.print("메뉴 선택 > ");
			int menu = s.nextInt();
			switch (menu) {

			case 1:

				service.addProfessor(s); break;

			case 2:

				service.updateSal(s); break;

			case 3:

				service.deleteProfessor(s); break;

			case 4:

				service.professorNo(s); break;

			case 5: 

				service.professorInfo(); break;

			

			default:

				System.out.println("없는 메뉴입니다. 프로그램 종료");

				flag = false;

				break;

			}

		}//while

		s.close();



	}



}