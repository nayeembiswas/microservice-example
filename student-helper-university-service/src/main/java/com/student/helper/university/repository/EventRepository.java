/**
 * 
 */
package com.student.helper.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.helper.university.model.Event;

/**
 * @author Nayeem
 *
 */

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
