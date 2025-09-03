package lk.acpt.demo.service;

import lk.acpt.demo.dto.StudentDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    StudentDto saveStudent(StudentDto studentDto);
}
