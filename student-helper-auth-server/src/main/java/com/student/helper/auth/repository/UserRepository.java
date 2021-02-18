/**
 * 
 */
package com.student.helper.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.student.helper.auth.entity.User;

import java.util.Optional;

/**
 * @author Nayeemul
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * @param name
	 * @return
	 */
	Optional<User> findByUsername(String name);
	boolean existsByUsername(String name);

}
