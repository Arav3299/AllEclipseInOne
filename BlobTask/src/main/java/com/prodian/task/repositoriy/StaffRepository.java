package com.prodian.task.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.task.modal.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
