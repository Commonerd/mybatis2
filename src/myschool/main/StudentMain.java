package myschool.main;



import java.util.Scanner;



import myschool.service.StudentService;



public class StudentMain {



	public static void main(String[] args) {

		StudentService service = new StudentService();

		

		Scanner s = new Scanner(System.in);

		boolean flag = true;

		

		System.out.println("1.	학생 정보 추가");

		System.out.println("2.	학생의 학년(grade) 변경");

		System.out.println("3.	학생 정보 삭제");

		System.out.println("4.	학생 정보 조회(studno 기준)");

		System.out.println("5.	학생 정보 조회(name)");

	

		while (flag) {

			

			System.out.print("메뉴 선택 > ");

			int menu = s.nextInt();



			switch (menu) {

			case 1:

				service.addStudent(s); break;

			case 2:

				service.updateGrade(s); break;

			case 3:

				service.deleteStudent(s); break;

			case 4:

				service.selectNo(s); break;

			case 5: 

				service.selectName(s); break;

			

			default:

				System.out.println("없는 메뉴입니다. 프로그램 종료");

				flag = false;

				break;

			}

		}//while

		s.close();



	}



}