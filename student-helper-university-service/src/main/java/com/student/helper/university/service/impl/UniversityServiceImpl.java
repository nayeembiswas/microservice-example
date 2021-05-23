/**
  * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.service.impl
 */
package com.student.helper.university.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.helper.university.model.University;
import com.student.helper.university.repository.UniversityRepository;
import com.student.helper.university.service.UniversityService;

/**
 * @author Nayeem
 *
 */
@Service
public class UniversityServiceImpl implements UniversityService {
	
	@Autowired
	private UniversityRepository universityRepository;

	@Override
	public String saveAndUpdate(University university) {
		try {
		universityRepository.save(university);
		return "saved";
		}catch (Exception e) {
			return "can't save";
		}
		
	}

	@Override
	public University getById(Long id) {
		return universityRepository.findById(id).orElseThrow();
	}

	@Override
	public List<University> getAll() {
		
		return universityRepository.findAll();
	}

}
