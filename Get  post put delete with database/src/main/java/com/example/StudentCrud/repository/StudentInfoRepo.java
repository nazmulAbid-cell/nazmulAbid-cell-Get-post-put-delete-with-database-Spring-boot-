package com.example.StudentCrud.repository;

import com.example.StudentCrud.entities.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentInfoRepo  extends JpaRepository<StudentInfo,Integer> {


}
