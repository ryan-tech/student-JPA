package com.TechBee.Classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    // create
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    // read
    public Student getStudent(Integer id) {
        //if(studentRepository.findById(id).isPresent()) {
        return studentRepository.findById(id).get();
       // }
    }

    // update
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    // delete
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

}
