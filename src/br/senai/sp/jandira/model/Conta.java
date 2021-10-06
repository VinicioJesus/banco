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
	// cria um método publico que não retorna nada que define o Tipo
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
	
	
	// Método precisa de um argumento que é o parenteses

	public void depositar(double valorDeposito) {

		System.out.println(" ");
		System.out.println("Efetuando depósito...");

		if (valorDeposito > 0) {
			// saldo = saldo + valorDeposito
			saldo += valorDeposito;
			System.out.println("Depósito efetuado com Sucesso!");

		} else {
			System.out.println("não foi possível fazer o depósito");

		}
	}

	public boolean sacar(double valorSaque) {

		if (valorSaque < 0 || saldo < valorSaque) {
			System.out.println("não foi possível fazer o saque");
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
			System.out.println("Não foi possível realizar a transferência");
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
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
