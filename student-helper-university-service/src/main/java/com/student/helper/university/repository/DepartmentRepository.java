/**
 * 
 */
package com.student.helper.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.helper.university.model.Department;

/**
 * @author Nayeem
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
