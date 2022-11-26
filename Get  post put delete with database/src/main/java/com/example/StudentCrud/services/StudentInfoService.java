package com.example.StudentCrud.services;

import com.example.StudentCrud.entities.StudentInfo;
import com.example.StudentCrud.repository.StudentInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoService {

    @Autowired
    private StudentInfoRepo studentInfoRepo;

    public void saveStudentInfo(StudentInfo studentInfo){
        studentInfoRepo.save(studentInfo);
    }

    public List<StudentInfo> retriveStudentInfo(){
        return studentInfoRepo.findAll();
    }

    public String removeStudentInfo(int id){
        studentInfoRepo.deleteById(id);
        return "item is deleted";
    }

    public StudentInfo recoditionStudentInfo(StudentInfo studentInfo){
        StudentInfo s1 = studentInfoRepo.findById(studentInfo.getId()).get();
        s1.setName(studentInfo.getName());
        return studentInfoRepo.save(s1);

    }

}
