/**
 * @Author Nayeem
 * @Date Jan 27, 2021
 * @Project student-helper-university-service
 * @Package com.student.helper.university.exception
 */
package com.student.helper.university.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Nayeem
 *
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String message) {
		super(message);
	}
}
