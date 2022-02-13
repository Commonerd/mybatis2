package scott.main;

import java.util.Scanner;

import scott.service.DeptService;

public class AppMain {
	public static void main(String[] args) {

		DeptService service = new DeptService();
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("1.전체 부서 정보 출력");
			System.out.println("2. 부서 검색");
			System.out.println("3. 부서 추가");
			System.out.print("메뉴 선택 > ");
			int menu = s.nextInt();

			switch (menu) {
			case 1:
				service.depts();
				break;
			case 2:
				service.searchDept(s);
				break;
			case 3:
				service.addDept(s);
				break;
			default:
				System.out.println("없는 메뉴입니다. 프로그램 종료");
				flag = false;
				break;
			}
		}//while
		s.close();
	}//main

}//class
