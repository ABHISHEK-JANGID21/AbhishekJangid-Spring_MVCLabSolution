package com.greatlearning.debate.event.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.config.TxNamespaceHandler;

import com.greatlearning.debate.event.entity.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	SessionFactory sessionFactory;

	private Session session;

	public StudentDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {

			session = sessionFactory.openSession();
		}
	}

	public Student insertStudentInfo(Student student) {
		session.save(student);
		System.out.println("Student info saved");
		return student;
	}

	public Student updateStudentInfo(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteStudentInfo(int studentId) {
		Student studentObj = findStudentInfo(studentId);

		session.getTransaction().begin();
		System.out.println("deleting student country is: " + studentObj.getCountry());
		session.delete(studentObj);

		session.getTransaction().commit();

		if (studentObj != null) {
			return true;
		}
		return false;

	}

	public Student findStudentInfo(int studentId) {
		// TODO Auto-generated method stub
		return session.find(Student.class, new Integer(studentId));
	}

	public List<Student> retrieveStudentInfo() {
		// TODO Auto-generated method stub
		return session.createQuery("Select s from Student s", Student.class).getResultList();
	}

}
