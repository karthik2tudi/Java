package com.techtroop.anudeep.model;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user_tab")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private String username;
	@Column
	private String password;
	
	@ElementCollection
	@CollectionTable(name="rolestab",joinColumns=@JoinColumn(name="id"))
	@Column(name="role")
	private Set<String> roles;

}
