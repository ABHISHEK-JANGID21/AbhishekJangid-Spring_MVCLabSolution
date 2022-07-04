package com.greatlearning.debate.event.service;

import java.util.List;

import com.greatlearning.debate.event.entity.Student;

public interface IStudentService {
	public Student addNewStudent(Student student);

	public Student updateStudentDetails(Student student);

	public Student getStudentDetails(int studentId);

	public boolean deleteStudentDetails(int studentId);

	public List<Student> getAllStudentsInfo();

}
