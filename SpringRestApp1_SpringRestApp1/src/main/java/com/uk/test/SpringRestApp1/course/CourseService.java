package com.uk.test.SpringRestApp1.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	private List<Course> courseList = new ArrayList<>(
			Arrays.asList(new Course("java", "Java Brains", "this is java description"),
					new Course("c", "Depth in C", "this is C description"),
					new Course("javascript", "javaScrupt", "this is javascript description")));

	public List<Course> getAllCourse() {

		return courseList;
	}

	public Course getCourse(String id) {
		return courseList.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addCourse(Course course) {
		courseList.add(course);

	}

	public void updateCourse(Course course, String id) {

		for (int i = 0; i < courseList.size(); i++) {
			Course c = courseList.get(i);
			if (c.getId().equals(id)) {
				courseList.set(i, course);
				return;
			}
		}
	}

	public void deleteCourse(String id) {
		courseList.removeIf(t -> t.getId().equals(id));
	}

}
