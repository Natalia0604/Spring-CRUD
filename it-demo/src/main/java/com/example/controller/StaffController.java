package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StaffModel;
import com.example.service.StaffService;

// 負責做各種mapping，如果在url找到相應用的mapping就會執行。

@RestController
public class StaffController {
	@Autowired
	StaffModel staffModel;
	
	@Autowired
	StaffService staffService;
    @RequestMapping("/addStaff")
    public String hello(){
    	staffModel = new StaffModel();
    	staffModel.setPassword("1234");
    	staffModel.setEmail("email@email.com");
    	staffModel.setPhone("22334455");
    	staffModel.setPosition("Manager");
    	staffService.addStaff(staffModel);
        return "New Staff added";
    }
}
