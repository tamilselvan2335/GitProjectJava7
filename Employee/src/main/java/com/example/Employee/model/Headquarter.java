package com.example.Employee.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Headquarter")
public class Headquarter {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="headquarterId")
	private Long headquarterId;
	@Column(name="location")
	private String location;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,
            mappedBy = "headquarter")
 private List<Employees> employeeDetails;
    
	
	
	
}
