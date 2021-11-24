package com.example.studentservice.controller;

import com.example.studentservice.VO.ResponseTemplateVO;
import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/all/")
    public List<Student> getAllStudent(){
        return studentService.getAll();
    }

    @PostMapping("/")
    public Student saveUser(@RequestBody Student student){

        return studentService.saveStudent(student);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                            Long studentId){
        return studentService.getUserWithDepartment(studentId);
    }
}
