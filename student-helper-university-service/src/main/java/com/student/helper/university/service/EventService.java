/**
 * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.service
 */
package com.student.helper.university.service;

import java.util.List;

import com.student.helper.university.model.Event;

/**
 * @author Nayeem
 *
 */
public interface EventService {
	
	
	public String saveAndUpdate(Event department);
	
	public Event getById(Long id);
	
	public List<Event> getAll();

}
