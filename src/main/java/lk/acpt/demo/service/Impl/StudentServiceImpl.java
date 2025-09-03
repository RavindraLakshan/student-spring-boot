package lk.acpt.demo.service.Impl;

import lk.acpt.demo.dto.StudentDto;
import lk.acpt.demo.entity.Student;
import lk.acpt.demo.repo.StudentRepo;
import lk.acpt.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    StudentRepo Srepo;

    @Autowired
    public StudentServiceImpl(StudentRepo srepo) {
        Srepo = srepo;
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Srepo.save(new Student(studentDto.getId(),studentDto.getFirstName(),studentDto.getLastName()));
        return studentDto;
    }
}
