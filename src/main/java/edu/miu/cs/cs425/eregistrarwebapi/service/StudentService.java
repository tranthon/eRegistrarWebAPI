package edu.miu.cs.cs425.eregistrarwebapi.service;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Optional<List<Student>> displayStudentList();
    public Optional<Student> registerStudent(Student student);
    public Optional<Student> getStudentById(long id);
    public void deleteStudent(long id);
}
