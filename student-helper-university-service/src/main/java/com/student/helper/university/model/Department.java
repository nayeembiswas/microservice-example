package com.student.helper.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Optional;



@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private double minimumCgpa;

    private String admissionStart;

    private String admissionEnd;

    private String studentBackgroundNeeded;

    private String imageUrl;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private University university;
    
//    @OneToMany
//    private List<Event> events;

}
