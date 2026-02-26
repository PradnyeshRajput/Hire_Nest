package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Modals.*;
import com.example.demo.Service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

	@Autowired
    private  StudentService service;

//    public StudentController(StudentService service) {
//        this.service = service;
//    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id,
                          @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteStudent(id);
    }
    

    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return service.register(student);
    }

    @PostMapping("/login")
    public String login(@RequestBody Student student) {
        Student logged = service.login(student.getEmail(), student.getPassword());
        if(logged != null)
            return "Login Successful";
        else
            return "Invalid Credentials";
    }
}