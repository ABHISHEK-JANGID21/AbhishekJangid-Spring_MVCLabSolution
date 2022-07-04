package com.greatlearning.debate.event.dao;

import java.util.List;

import com.greatlearning.debate.event.entity.Student;

public interface IStudentDao {
	public Student insertStudentInfo(Student student);

	public Student updateStudentInfo(Student student);

	public boolean deleteStudentInfo(int studentId);

	public Student findStudentInfo(int studentId);

	public List<Student> retrieveStudentInfo();

}
