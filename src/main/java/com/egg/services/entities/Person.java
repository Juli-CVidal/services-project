package com.egg.services.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "person")
public abstract class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	@NotEmpty
	protected String name;

	@NotEmpty
	protected String lastname;

	@NotEmpty
	protected String phoneNumber;

	@NotEmpty
	@Email
	protected String mail;

	@NotEmpty
	protected String image;

	@NotEmpty
	protected String password;

	@NotEmpty
	protected Rol rol;

	public Person(@NotEmpty String name, @NotEmpty String lastname, @NotEmpty String phoneNumber,
			@NotEmpty @Email String mail, @NotEmpty String image, @NotEmpty String password, @NotEmpty Rol rol) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.image = image;
		this.password = password;
		this.rol = rol;
	}

}
