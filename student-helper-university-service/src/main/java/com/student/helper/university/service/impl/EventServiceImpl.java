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

import com.student.helper.university.model.Event;
import com.student.helper.university.repository.EventRepository;
import com.student.helper.university.service.EventService;

/**
 * @author Nayeem
 *
 */

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository repo;

	@Override
	public String saveAndUpdate(Event department) {
		try {
			repo.save(department);
			return "saved";
			}catch (Exception e) {
				return "can't save";
			}
	}

	@Override
	public Event getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<Event> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
