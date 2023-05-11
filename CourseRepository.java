package com.vishwa.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwa.entity.Course;
import com.vishwa.entity.Student;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{ 

}
