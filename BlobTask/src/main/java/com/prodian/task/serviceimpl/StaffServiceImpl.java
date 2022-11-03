package com.prodian.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.prodian.task.modal.ResultResponse;
import com.prodian.task.modal.Staff;
import com.prodian.task.repositoriy.StaffRepository;
import com.prodian.task.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffRepository;

	@Override
	public Staff updateOrInsertStaff(Staff staff) {
		
		return staffRepository.save(staff);
		
	}

	@Override
	public ResultResponse getAllStaffDetails() {
		
		ResultResponse resultResponse = new ResultResponse();
		
		try {
		List<Staff> staffs = staffRepository.findAll();
		
		if(staffs.size()>0) {
			
			resultResponse.setData(staffs);
			resultResponse.setCode(HttpStatus.OK);
			resultResponse.setStatus("Sucees");
			
			return resultResponse;
		}else {
			
			resultResponse.setData(staffs);
			resultResponse.setCode(HttpStatus.BAD_REQUEST);
			resultResponse.setStatus("Failed");
			
			return resultResponse;
			
		}
		}catch(Exception e) {
			
			return null;	
			
		}
		
		 
	}
	
	
	

}
 