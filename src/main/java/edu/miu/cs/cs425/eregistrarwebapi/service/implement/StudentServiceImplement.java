package edu.miu.cs.cs425.eregistrarwebapi.service.implement;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<List<Student>> displayStudentList() {
        return Optional.of(studentRepository.findAll());
    }

    @Override
    public Optional<Student> registerStudent(Student student) {
        return Optional.ofNullable(studentRepository.save(student));
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
