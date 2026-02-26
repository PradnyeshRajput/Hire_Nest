package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modals.Application;
import com.example.demo.Modals.Job;
import com.example.demo.Repository.ApplicationRepository;
import com.example.demo.Service.AppliactionService;
import com.example.demo.Service.HrServices;


@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationRepository appRepo;

    @Autowired
    private AppliactionService service;

    @GetMapping("/job/{jobId}")
    public List<Application> getApplicants(@PathVariable Long jobId) {
        Job job = new Job();
        job.setJobId(jobId);
        return appRepo.findByJob(job);
    }

    @PutMapping("/status/{appId}")
    public Application updateStatus(@PathVariable Long appId,
                                    @RequestParam String status) {
        return service.updateStatus(appId, status);
    }
}