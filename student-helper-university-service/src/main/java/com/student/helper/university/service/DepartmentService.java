/**
 * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-Department-service
 * @Package com.student.helper.Department.service
 */
package com.student.helper.university.service;

import java.util.List;

import com.student.helper.university.model.Department;


/**
 * @author Nayeem
 *
 */
public interface DepartmentService {
	
	public String saveAndUpdate(Department department);
	
	public Department getById(Long id);
	
	public List<Department> getAll();

}
