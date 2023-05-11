package com.vishwa.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishwa.entity.Course;
import com.vishwa.entity.Student;
import com.vishwa.repository.CourseRepository;
import com.vishwa.repository.StudentRepository;
@Service
public class CourseServiceImpl implements CourseService {
@Autowired
private CourseRepository courseRepository;

@Override
public Course saveCourse(Course course) {
	// TODO Auto-generated method stub
	return courseRepository.save(course);
}

@Override
public List<Course> fetchcourList() {
	// TODO Auto-generated method stub
	return courseRepository.findAll();
}



	

	

}
