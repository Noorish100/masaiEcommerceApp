package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Email(message ="Enter Email in correct format.")
	@Column(unique = true)
	private String emailId;
	
	@NotNull(message = "FirstName should not null")
	private String firstName;
	
	@Size(min = 6, max = 12, message = "length of username must be between 3 & 10")
//	@Pattern(regexp = "/^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[^a-zA-Z0-9])(?!.*\\s).{6,12}$/")
	private String password;
	
	private String city;
	
	private String state;
	
	private String address;
	
	private String country;
	
	@NotNull(message = "not null")
	private String lastName;
    
    @OneToOne
    private Cart cart;

}
