package com.example.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Address;
import com.example.springboot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	Optional<Employee> findEmployeeByAddress(Address address);
	
	Optional<Employee> findByFirstName(String firstName);
	
	@Query(value="SELECT * from employee_table order by first_name",nativeQuery=true)
	List<Employee> findAllSortedEmployeeDetailsByFirstName();
	
	@Query("SELECT e from Employee e order by lastName")
	List<Employee> findAllEmployees();
	
	@Query(value="select first_name from employee_table where last_name= ?1",nativeQuery=true)
	String getFirstNameByLastName(String lastName);
 
	
	
}
