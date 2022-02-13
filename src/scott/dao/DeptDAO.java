package scott.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import scott.dto.Dept;
import scott.provider.SqlSessionFactoryMake;

/* mapper파일에 선언해 둔 sql 호출 
 * sql마다 각각의 메서드*/
public class DeptDAO {

	public int addDept(Dept d) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.insert("scott.dept.addDept", d);
		} finally {
			session.commit();
			session.close();
		}
	}
	
	public Integer checkNo(int deptno) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.selectOne("scott.dept.checkNo",deptno);
		} finally {
			session.close();
		}
	}

	public Dept searchDept(int deptno) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.selectOne("scott.dept.searchDept", deptno);
		} finally {
			session.close();
		}
	}
	
	public List<Dept> depts() {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			List<Dept> depts = session.selectList("scott.dept.depts");
			return depts;
		} finally {
			session.close();
		}
	}
}
