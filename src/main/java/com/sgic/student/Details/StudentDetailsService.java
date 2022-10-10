package com.sgic.student.Details;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Service annotation or telling the spring consider this class as service class
@Service
public class StudentDetailsService {
	
	@Autowired
	private StudentRopoitoy studentRepository;
	
	//private List<StudentDetails> Students=new ArrayList<>();

	public List<StudentDetails> getAllStudents() {
		List<StudentDetails> Students=new ArrayList<>();
		studentRepository.findAll().forEach(Students::add);//refer lamnda in java8
		return Students;
		
	}
	
     //AddStudent Method
	public StudentDetails addStudent(StudentDetails studentDetail) {
		return studentRepository.save(studentDetail);
		
	}
	
	
	
    //update Student Method: here save method can perform both actions
	public StudentDetails updateStudent(Long id, StudentDetails studentDetail) {
		return studentRepository.save(studentDetail);
		
		/*for(int i=0;i<Students.size();i++) {
			StudentDetails d=Students.get(i);
			if(d.getFirstName().equals(id)) { //here int variable cannot be passed as primitive unit for that i passed by name
				Students.set(i, studentDetail);
				return;
			}
		}*/
	}
	//get one student

	public StudentDetails getStudent(Long id) {
		//return Students.stream().filter(t->t.getId().equals(id)).findFirst().get(); //find from hard code
		return studentRepository.findById(id).orElse(null);
	}
	

	public void deleteStudent(Long id) {
		//Students.removeIf(t->t.getId().equals(id));
		studentRepository.deleteById(id);
		
	}
	
	
	

}
