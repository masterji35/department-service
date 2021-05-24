package com.dailycodebuffer.departmentservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.departmentservice.entity.Department;
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	Department findByDepartmentId(Long departmentId);
	

}
