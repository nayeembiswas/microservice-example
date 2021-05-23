/**
 * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.service.impl
 */
package com.student.helper.university.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.helper.university.model.Department;
import com.student.helper.university.model.University;
import com.student.helper.university.repository.DepartmentRepository;
import com.student.helper.university.repository.UniversityRepository;
import com.student.helper.university.service.DepartmentService;

/**
 * @author Nayeem
 *
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private UniversityRepository universityRepository ;

	@Override
	public String saveAndUpdate(Department department) {
		
		University university = universityRepository.findById(department.getUniversity().getId()).orElseThrow();
		
		department.setUniversity(university);
		
		try {
			departmentRepository.save(department);
			return "saved";
			}catch (Exception e) {
				return "can't save";
			}
	}

	@Override
	public Department getById(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

}
