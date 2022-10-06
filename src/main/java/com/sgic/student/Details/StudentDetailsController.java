package com.sgic.student.Details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class StudentDetailsController {
	
	//Service class injection
	@Autowired
	private StudentDetailsService studentDetailsService;
	
	//get request method
	@RequestMapping("/getstudents")
	public List<StudentDetails> getAllStudentDetails(){
		return studentDetailsService.getAllStudents();
	}
	
	//delet data by id
	@RequestMapping("/students/{id}")
	public StudentDetails getStudent(@PathVariable String id) {
		return studentDetailsService.getStudent(id);
	}
	
	//update data method
	@PutMapping("/updatestudents/{id}")
	public void updateStudentsData(@RequestBody StudentDetails studentDetail, @PathVariable String id ) {
			studentDetailsService.updateStudent(id, studentDetail);
	}
	
	//Post data mapping
	@PostMapping("/addstudents")
	public void addStudents(@RequestBody StudentDetails studentDetail) {
		studentDetailsService.addStudent(studentDetail);
	}
	@DeleteMapping("/deletestudents/{id}")
	public void deleteStudent(@PathVariable String id) {
		studentDetailsService.deleteStudent(id);
	}
	
	

}
