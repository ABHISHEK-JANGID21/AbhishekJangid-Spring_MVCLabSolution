package com.greatlearning.debate.event.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.debate.event.dao.IStudentDao;
import com.greatlearning.debate.event.dao.StudentDaoImpl;
import com.greatlearning.debate.event.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao studentDao;

	public Student addNewStudent(Student student) {
		return this.studentDao.insertStudentInfo(student);
	}

	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudentDetails(int studentId) {
		return studentDao.findStudentInfo(studentId);
	}

	public boolean deleteStudentDetails(int studentId) {
		return studentDao.deleteStudentInfo(studentId);
	}

	public List<Student> getAllStudentsInfo() {
		// TODO Auto-generated method stub
		return studentDao.retrieveStudentInfo();
	}

}
