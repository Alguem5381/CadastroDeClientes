package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;
	private String sexo;
	private int id;
	private String dataCadastro;
	
	public Cliente(String nome, String telefone, String email, String sexo, String dataCadastro) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.dataCadastro = dataCadastro;
	}
	public Cliente(String nome, String telefone, String email, String sexo) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
	}
	
	public Cliente(int id, String nome, String telefone, String email, String sexo, String dataCadastro) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.id = id;
		this.dataCadastro = dataCadastro;
	}

	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDate(){
		return this.dataCadastro;
	}
	
	

}
