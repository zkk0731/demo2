package com.example.demo2.service.ifs;

import java.util.List;

import com.example.demo2.entity.Course;
import com.example.demo2.entity.Student;
import com.example.demo2.vo.CourseRes;

public interface CourseService {

	public Course createCourse(String id,String name,int day,int start,int end,int credit);
	
	public Course alterCourse(String id,String name,int day,int start,int end,int credit);
	
	public CourseRes deleteCourse(String id);
	
	public CourseRes findCourseById(String id);
	
	public CourseRes findCourseByName(String name);
	
	public Student createStudent(String id,String name);
	
	public Student alterStudent(String id,String name);
	
	public CourseRes deleteStudent(String id);
	
	public CourseRes courseSelection(List<String> courseSelList);
	
	
}