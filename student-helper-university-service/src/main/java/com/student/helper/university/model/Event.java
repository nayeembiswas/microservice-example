package com.student.helper.university.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;



@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private String imageUrl;
    
    private Date startDate;
    
    private Date endDate;


    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Department department;
}
