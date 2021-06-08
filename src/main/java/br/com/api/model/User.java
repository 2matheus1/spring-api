package br.com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

	@Column(name="name", nullable=false, length=80)
	private String name;
	
	@Column(name="address", nullable=false, length=512)
	private String address;
	
	@Column(name="cpf", nullable=false, length=11)
	private String cpf;
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
}
