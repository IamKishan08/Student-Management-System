package com.TaskManagementSystem.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TaskManagementSystem.project.entity.*;


public interface StudentRepository extends JpaRepository<Student,Long>{

}
