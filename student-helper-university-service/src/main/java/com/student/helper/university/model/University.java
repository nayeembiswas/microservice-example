package com.student.helper.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class University implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private String country;

    private double cgpaScale;

    private String city;

    private String contactNumber;

    private String email;

    private String imageUrl;
    
//    @OneToMany(fetch = FetchType.EAGER, targetEntity = Department.class, cascade = CascadeType.MERGE)
//    @JoinColumn(name = "id", referencedColumnName = "university")
//    private List<Department> departments;
}
