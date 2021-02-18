/**
 * 
 */
package com.student.helper.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.helper.auth.entity.OauthClientDetails;
import com.student.helper.auth.service.OauthClientDetailsService;

/**
 * @author Nayeemul
 *
 */

@RestController
@RequestMapping("/client-details")
public class OauthClientDetailsController {
	
	@Autowired
	private OauthClientDetailsService oauthClientDetailsService; 
	
	@PostMapping("/add")
	public String add(@RequestBody OauthClientDetails clientDetails)
	{
		return oauthClientDetailsService.addOrUpdateClient(clientDetails);
	}

}
