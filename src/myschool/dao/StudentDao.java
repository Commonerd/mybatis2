package myschool.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import myschool.dto.Student;
import session.provider.SqlSessionFactoryMake;

public class StudentDao {
	public int addStudent(Student s) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			int i = session.insert("myschool student addStudent", s);
			if (i != 0) {
				i = s.getStudno();

			}
			return i;
		} finally {
			session.commit();
			session.close();
		}
	}

	public int updateGrade(Map<String, Object> m) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.update("myschool.student.updateGrade", m);
		} finally {
			session.commit();
			session.close();
		}
	}

	public int deleteStudent(int studno) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.delete("myschool.student.deleteStudent",studno);
		} finally {
			session.commit();
			session.close();
			}
		}
		public Student selectNo(int studno) {
			SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
			try {
				return session.selectOne("myschool.student.selectNo", studno);
			} finally {

				session.close();

			}
	}
		public List<Student> selectName(String name) {
			SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try { 
			return session.selectList("myschool.student.select.Name", name);
		} finally {
			session.close();
		}
		}
		
	}

