package com.prodian.task.service;

 

import java.util.List;

import com.prodian.task.modal.ResultResponse;
import com.prodian.task.modal.Staff;

public interface StaffService {

	Staff updateOrInsertStaff(Staff staff);

	ResultResponse getAllStaffDetails();

}
