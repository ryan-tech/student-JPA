package com.TechBee.Classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @RequestMapping("/students/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/students/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
    }

}
