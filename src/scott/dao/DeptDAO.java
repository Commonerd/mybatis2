package scott.dao;

import org.apache.ibatis.session.SqlSession;

import scott.provider.SqlSessionFactoryMake;

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