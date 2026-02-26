package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Modals.HR;
import com.example.demo.Service.HrServices;

public class HrController {
	 @Autowired
	    private HrServices service;

	    @PostMapping("/register")
	    public HR register(@RequestBody HR hr) {
	        return service.register(hr);
	    }

	    @PostMapping("/login")
	    public String login(@RequestBody HR hr) {
	        HR logged = service.login(hr.getEmail(), hr.getPassword());
	        if(logged != null)
	            return "Login Successful";
	        else
	            return "Invalid Credentials";
	    }

	    @PutMapping("/update/{id}")
	    public HR update(@PathVariable Long id, @RequestBody HR hr) {
	        return service.updateProfile(id, hr);
	    }
}
