package com.student.helper.auth.repository;

import com.student.helper.auth.entity.OauthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nayeemul
 *
 */

@Repository
public interface OauthClientDetailsRepository extends JpaRepository<OauthClientDetails, String>{

}
