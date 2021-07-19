package edu.miu.cs.cs425.eregistrarwebapi.controller;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/eregistrar/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "list")
    public List<Student> displayStudent() {
        return studentService.displayStudentList().get();
    }

    @PostMapping(value = "register")
    public Student registerNewStudent(@RequestBody @Valid Student student) {
        return studentService.registerStudent(student).get();
    }

    @GetMapping(value = "get/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.getStudentById(id).get();
    }

    @DeleteMapping(value = "delete/{id}")
    public void removeStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }
}
