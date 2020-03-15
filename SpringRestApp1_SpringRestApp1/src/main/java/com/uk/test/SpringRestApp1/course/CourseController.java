package com.uk.test.SpringRestApp1.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping("/course")
	private List<Course> getAllCourses() {
		return courseService.getAllCourse();
	}

	@GetMapping("/course/{courseid}")
	private Course getCourse(@PathVariable("courseid") String id) {
		return courseService.getCourse(id);
	}

	@PostMapping("/course")
	private void addCoures(@RequestBody Course course) {

		courseService.addCourse(course);
	}

	@PutMapping("/course/{courseid}")
	private void updateCoures(@RequestBody Course course, @PathVariable("courseid") String id) {

		courseService.updateCourse(course,id);
	}
	
	@DeleteMapping("/course/{courseid}")
	private void deleteCoures(@PathVariable("courseid") String id) {

		courseService.deleteCourse(id);
	}
}
