package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Modals.*;
import com.example.demo.Repository.HrRepositories;

@Service
public class HrServices {

    @Autowired
    private HrRepositories repo;

    public HR register(HR hr) {
        return repo.save(hr);
    }

    public HR login(String email, String password) {
        HR hr = repo.findByEmail(email);
        if(hr != null && hr.getPassword().equals(password)) {
            return hr;
        }
        return null;
    }

    public HR updateProfile(Long id, HR updatedHr) {
        HR hr = repo.findById(id).orElse(null);
        if(hr != null) {
            hr.setCompanyName(updatedHr.getCompanyName());
            hr.setCompanyDescription(updatedHr.getCompanyDescription());
            hr.setCompanyLocation(updatedHr.getCompanyLocation());
            return repo.save(hr);
        }
        return null;
    }
}