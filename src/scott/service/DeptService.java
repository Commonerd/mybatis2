package scott.service;

import java.awt.dnd.DragSourceAdapter;
import java.util.List;
import java.util.Scanner;

import scott.dao.DeptDAO;
import scott.dto.Dept;

public class DeptService {
//기능별로 메서드 하나씩
	DeptDAO dao = new DeptDAO();
	
	public void addDept(Scanner scan) {
		System.out.println("부서 추가");
	
		int deptno = 0;
		while(true) {
			System.out.print("부서번호 > ");
			deptno = scan.nextInt();
			Integer x = dao.checkNo(deptno);
			if(x == null) {
				break;
			}else {
				System.out.println("이미 있는 부서번호입니다.");
			}
		}
		System.out.print("부서명 > ");
		String dname = scan.next();
		System.out.print("근무지 > ");
		String loc = scan.next();
		
		Dept d = new Dept(deptno, dname, loc);
		
		int i = dao.addDept(d);
		if(i > 0) {
			System.out.println("저장 완료");
		}
		
	}
	
	public void searchDept(Scanner scan) {
		System.out.println("부서 검색");
		
		System.out.print("부서번호 > ");
		int deptno = scan.nextInt();
		
		Dept d = dao.searchDept(deptno);
		if( d != null) {
			System.out.println(d);
		}else {
			System.out.println("잘못된 번호입니다.");
		}
		
	}
	
	
	public void depts() {
		System.out.println("전체 부서 정보 출력");
		List<Dept> dlist = dao.depts();
		for(Dept d : dlist) {
			System.out.println(d);
		}
	}
	
	
}









