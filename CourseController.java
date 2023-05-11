package com.vishwa.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.entity.Course;
import com.vishwa.entity.Student;
import com.vishwa.service.CourseService;
import com.vishwa.service.StudentService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	//save
		@PostMapping("/courses/")
		public Course saveCourse(@RequestBody Course course) {
			return courseService.saveCourse(course);
		}
		//get all departments Record
		@GetMapping("/courses/")
		public List<Course> fetchCourseList(){
			return courseService.fetchcourList();
		}
		

}

