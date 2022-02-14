package myschool.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import myschool.dto.Professor;
import myschool.dto.Student;
import session.provider.SqlSessionFactoryMake;

public class ProfessorDao {
	public int addProfessor(Professor p) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			int i = session.insert("myschool professor addProfessor", p);
			if (i != 0) {
				i = p.getProfno();

			}
			return i;
		} finally {
			session.commit();
			session.close();
		}
	}

	public int updateSal(Map<String, Object> m) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.update("myschool.professor.updateSal", m);
		} finally {
			session.commit();
			session.close();
		}
	}

	public int deleteProfessor(int profno) {
		SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try {
			return session.delete("myschool.professor.deleteProfessor",profno);
		} finally {
			session.commit();
			session.close();
			}
		}
		public Professor professorNo(int profno) {
			SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
			try {
				return session.selectOne("myschool.professor.selectNo",profno);
			} finally {

				session.close();

			}
	}
		public List<Professor> professorInfo() {
			SqlSession session = SqlSessionFactoryMake.getFactory().openSession();
		try { 
			return session.selectList("myschool.professor.professorInfo");
		} finally {
			session.close();
		}
		}
		
	}

