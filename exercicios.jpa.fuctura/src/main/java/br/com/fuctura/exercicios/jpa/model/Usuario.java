package br.com.fuctura.exercicios.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


	@Entity
	@Data
	public class Usuario {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long codigo;
	   
	    private String nome;
	    private int idade;
	    private String cpf;	   
	}
