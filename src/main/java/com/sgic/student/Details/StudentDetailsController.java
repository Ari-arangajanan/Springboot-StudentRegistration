package com.sgic.student.Details;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.student.*;

@RestController //

public class StudentDetailsController {
	
	Logger log=LoggerFactory.getLogger(StudentDetailsController.class);
	
	//Service class injection
	@Autowired
	private StudentDetailsService studentDetailsService;
	
	//get request method
	@RequestMapping(Constants.STUDENTS)
	public List<StudentDetails> getAllStudentDetails(){
		log.debug("Request {}");
		List<StudentDetails> Response=studentDetailsService.getAllStudents();
		log.debug("Responce {}",Response);
		log.info("get log message");
		return Response;
	}
	
	//request by data by id
	@RequestMapping(Constants.STUDENT)
	public StudentDetails getStudent(@PathVariable String id) {
		log.debug("Request {}",id);
		StudentDetails Response1=studentDetailsService.getStudent(id);
		log.debug("Responce {}",Response1);
		log.info("get by id log message");
		return Response1;
	}
	
	//update data method
	@PutMapping(Constants.UPDATE)
	public StudentDetails updateStudentsData(@RequestBody StudentDetails studentDetail, @PathVariable String id ) {
		log.debug("Request {}",studentDetail);
		StudentDetails updateResponse=studentDetailsService.updateStudent(id, studentDetail);
		log.debug("Responce {}",updateResponse);
		log.info("put by id log message");
		return updateResponse;
	}
	
	//Post data mapping
	@PostMapping(Constants.POST)
	public StudentDetails addStudents(@RequestBody StudentDetails studentDetail) {
		log.debug("Request {}",studentDetail);
		StudentDetails addStudent=studentDetailsService.addStudent(studentDetail);
		log.debug("Responce {}",addStudent);
		log.info("post log message");
		return addStudent;
	}
	@DeleteMapping(Constants.DELETE)
	public ResponseEntity<String> deleteStudent(@PathVariable String id) {
		log.debug("Request {}",id);
		studentDetailsService.deleteStudent(id);
		log.debug("Responce {}",id);
		log.info("delete by id log message");
		return ResponseEntity.ok("successfully deleted");
		
	}
	
	

}
