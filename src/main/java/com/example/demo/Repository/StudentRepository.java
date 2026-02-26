package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modals.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);

}