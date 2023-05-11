package com.vishwa.service;


import java.util.List;

import com.vishwa.entity.Student;
import com.vishwa.error.StudentNotFoundException;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> fetchStudList();

	public Student updateStudent(Long did, Student student);

	public Student fetchStudentByName(String studentName);

	public void deleteStudentById(Long did) throws StudentNotFoundException;

	public Student fetchStudentById(Long did) throws StudentNotFoundException;

	public Student fetchStudentByEmail(String studentEmail);

}
