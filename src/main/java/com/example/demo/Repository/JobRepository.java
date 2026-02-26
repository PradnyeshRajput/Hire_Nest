package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modals.*;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByHr(HR hr);
}

