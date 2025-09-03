package lk.acpt.demo.controller;

import lk.acpt.demo.dto.StudentDto;
import lk.acpt.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/s1/Student")
public class Controller {

    @Autowired
    StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto) {
        StudentDto saveDto1 = studentService.saveStudent(studentDto);
        return new ResponseEntity<>(saveDto1, HttpStatus.CREATED);

    }

}
