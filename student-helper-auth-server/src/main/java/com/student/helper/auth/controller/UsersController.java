/**
 * 
 */
package com.student.helper.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.student.helper.auth.entity.User;
import com.student.helper.auth.service.UserService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;



/**
 * @author Nayeemul
 *
 */
@RestController
@RequestMapping("/user")
public class UsersController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String add(@RequestBody User user)
	{
		return userService.addOrUpdateUser(user);
	}
	
	@PostMapping("/save")
	public String save(@RequestBody User user)
	{
		System.out.println(user);
		return userService.addOrUpdateUserFromRS(user);
	}

	@GetMapping(value = "/info")
	public ResponseEntity<User> findUsrByName(@RequestParam String username) {
		User user = userService.findUserByName(username);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping(value = "/info/active/user-list")
	public ResponseEntity<List<User>> findAllActiveUsers() {
		List<User> users = userService.findAllActiveUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@GetMapping(value = "/info/active/user")
	public ResponseEntity<User> findActiveUserInfo(@RequestParam @Valid @NotNull(message = "Id must not be null") int userId) {
		User user = userService.findActiveUserInfo(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}

