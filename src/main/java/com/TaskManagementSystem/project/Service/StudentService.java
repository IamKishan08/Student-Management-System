package com.TaskManagementSystem.project.Service;

import java.util.*;
import com.TaskManagementSystem.project.entity.*;

public interface StudentService {
    
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
