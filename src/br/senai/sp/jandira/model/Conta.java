package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	// Atributos da classe Conta
	private TipoConta tipo;
	private String numero; // variavel do tipo string para palavras que guarda no nome numero
	private Agencia agencia;
	private Cliente titular;
	private double saldo;

	// Construtores da classe Conta
	// nome do argumento tem que ser o mesmo do atributo
	public Conta(String numeroConta) {
		numero = numeroConta;
	}

	// set= definir
	// cria um m�todo publico que n�o retorna nada que define o Tipo
	public void setTipo(TipoConta tipo) {
		// this= se refere a um atributo ou metodo da mesma classe
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	// set NumeroAgencia ("aqui vai o argumento")
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public void setTitular (Cliente titular){
		this.titular = titular;
	}
	
	public Cliente getTitular () {
		return this.titular;
	}
	
	
	// M�todo precisa de um argumento que � o parenteses

	public void depositar(double valorDeposito) {

		System.out.println(" ");
		System.out.println("Efetuando dep�sito...");

		if (valorDeposito > 0) {
			// saldo = saldo + valorDeposito
			saldo += valorDeposito;
			System.out.println("Dep�sito efetuado com Sucesso!");

		} else {
			System.out.println("n�o foi poss�vel fazer o dep�sito");

		}
	}

	public boolean sacar(double valorSaque) {

		if (valorSaque < 0 || saldo < valorSaque) {
			System.out.println("n�o foi poss�vel fazer o saque");
			return false;
		} else {
			saldo -= valorSaque;
			return true;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {

		boolean resultado = sacar(valorTransferencia);

		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel realizar a transfer�ncia");
		}
	}

	// printf (estamos formatando)
	public void exibirDetalhes() {
		// substitui o %s pelo nome do titular
		// \n quebra de linha
		System.out.println("");
		System.out.println("-----------------------");
		System.out.printf("Titular: %s\n", titular.getNome());
		System.out.printf("E-mail: %s\n", titular.getEmail());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
