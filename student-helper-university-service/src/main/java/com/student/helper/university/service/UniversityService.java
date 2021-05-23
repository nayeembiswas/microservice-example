/**
 * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.service
 */
package com.student.helper.university.service;

import java.util.List;

import com.student.helper.university.model.University;

/**
 * @author Nayeem
 *
 */
public interface UniversityService {

	public String saveAndUpdate(University university);
	
	public University getById(Long id);
	
	public List<University> getAll();
	
//	public 
}
