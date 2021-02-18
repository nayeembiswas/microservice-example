/**
 * 
 */
package com.student.helper.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.helper.auth.entity.Role;
import com.student.helper.auth.entity.User;
import com.student.helper.auth.exception.RecordNotFoundException;
import com.student.helper.auth.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author Nayeemul
 *
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String addOrUpdateUser(User user)
	{
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		System.out.println(user.getPassword());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		
		try {
			userRepository.save(user);
			return "saved";
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("failed");
		}
		
	}
	public String addOrUpdateUserFromRS(User user)
	{
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		Role role = new Role(2, "ROLE_operator");
		
		List<Role> roles = new ArrayList<>();
		roles.add(role);
		
		user.setRoles(roles);
		
		System.out.println(user);
		
		try {
			userRepository.save(user);
			return "saved";
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("failed");
		}
		
	}

	public User findUserByName(String name) {
		Optional<User> users = userRepository.findByUsername(name);
		return users.orElseThrow(() -> new RecordNotFoundException("No record found for given user name: " + name));
	}

	public List<User> findAllActiveUsers() {
		return userRepository.findAll();
	}
	
	public User findActiveUserInfo(int userId) {
		return userRepository.findById(userId).orElseThrow(() -> new RecordNotFoundException("No record found for given user name: " + userId));
	}
	
	public ResponseEntity<List<User>> findUserByRole(String roleName) {
		List<User> users = userRepository.findAll();
		List<User> universities = new ArrayList<>();
				for(User user: users)
				{
					for(Role role: user.getRoles())
					{
						if(role.getName().equals(roleName))
						{
							universities.add(user);
						}
					}
					
				}
		
		
		return new ResponseEntity<List<User>>(universities, HttpStatus.OK);
	}


}
