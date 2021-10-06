package br.senai.sp.jandira.model;

public class Cliente {
	
	//atributo é o azul claro. que define as coisas de uma classe/objeto
	// o objeto ciente tem nome email e salario
	private String nome;
	private String email;
	private double salario;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	
}
