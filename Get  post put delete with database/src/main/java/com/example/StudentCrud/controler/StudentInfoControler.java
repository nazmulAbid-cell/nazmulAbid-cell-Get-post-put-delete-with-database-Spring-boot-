package com.example.StudentCrud.controler;

import com.example.StudentCrud.entities.StudentInfo;
import com.example.StudentCrud.services.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentInfoControler {
    //controler will talk to the Services Class

    @Autowired
    private StudentInfoService studentInfoService;

    @PostMapping("/addInfo")
    public void addStudentInfo(@RequestBody StudentInfo studentInfo){
        studentInfoService.saveStudentInfo(studentInfo);

    }
    @GetMapping("/getInfo")
    public List<StudentInfo> getStudentInfo(){
        return studentInfoService.retriveStudentInfo();
    }

    @DeleteMapping("/deleteInfo/{id}")
    public String  deleteStudentInfo(@PathVariable int id){
        return  studentInfoService.removeStudentInfo(id);

    }
    @PutMapping("/updateInfo")
    public StudentInfo updateStudentInfo(@RequestBody StudentInfo studentInfo){
       return studentInfoService.recoditionStudentInfo(studentInfo);

    }


}
