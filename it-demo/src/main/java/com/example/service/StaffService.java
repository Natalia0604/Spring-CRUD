package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.StaffModel;
import com.example.repository.StaffRepository;

//負責簡化代碼，在這裡建立各種CRUD的指令。

@Service
public class StaffService {
	@Autowired
	StaffRepository staffRepository;
	//呼叫 staffRepository的addStaff 方法執行新增資料
	public void addStaff(StaffModel staffModel){
		staffRepository.addStaff(staffModel);
	}
}
	
