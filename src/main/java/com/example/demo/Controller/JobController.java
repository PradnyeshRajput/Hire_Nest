package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modals.HR;
import com.example.demo.Modals.Job;
import com.example.demo.Repository.HrRepositories;
import com.example.demo.Repository.JobRepository;
@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobRepository jobRepo;

    @Autowired
    private HrRepositories hrRepo;

    @PostMapping("/post/{hrId}")
    public Job postJob(@PathVariable Long hrId,
                       @RequestBody Job job) {

        HR hr = hrRepo.findById(hrId).orElse(null);
        job.setHr(hr);

        return jobRepo.save(job);
    }

    @GetMapping("/myjobs/{hrId}")
    public List<Job> getMyJobs(@PathVariable Long hrId) {
        HR hr = hrRepo.findById(hrId).orElse(null);
        return jobRepo.findByHr(hr);
    }
}