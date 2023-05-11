package com.vishwa.service;


import java.util.List;

import com.vishwa.entity.Course;
import com.vishwa.entity.Student;

public interface CourseService {

	//Course saveCourse(Course course);

	//List<Course> fetchcourList();

	Course saveCourse(Course course);

	List<Course> fetchcourList();

}
