package com.sgic.student.Details;

import org.springframework.data.jpa.repository.JpaRepository;



// repository interface does extends the crudRepository to execute the crud operation logic implementation

//<StudentDetails:(is entity class), String:(primary key data type)>
public interface StudentRopoitoy extends JpaRepository<StudentDetails, String>{

}
