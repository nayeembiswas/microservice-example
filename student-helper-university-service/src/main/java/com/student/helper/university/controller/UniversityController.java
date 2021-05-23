/**
 * @Author Nayeem
 * @Date Jan 29, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.controller
 */
package com.student.helper.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.helper.university.model.University;
import com.student.helper.university.service.UniversityService;


/**
 * @author Nayeem
 *
 */

@RestController
@RequestMapping("uni/")
public class UniversityController {
	
	@Autowired
	private UniversityService service;
	
	@PostMapping("/add")
	public String add(@RequestBody University education)
	{
		return service.saveAndUpdate(education);
	}
	
	
	@GetMapping("find-by-user/{id}")
	public University findById(@PathVariable("id") Long id )
	{
		return service.getById(id);
	}
	
	@GetMapping("find")
	public List<University> findAll()
	{
		return service.getAll();
	}

}
