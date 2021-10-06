package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;


public class App {

	public static void main(String[] args) {
		
		// Criar uma Agencia 
		
		Agencia agencia = new Agencia();
		agencia.setGerente("Vinicio de Jesus");
		agencia.setNumero("4214-9");
		agencia.setTelefone("(11) 98785-4691");
		agencia.setCidade("Jandira");
		
		// Criar o cliente Maria
		// String tem que ser entre aspas
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria da Silva");
		clienteMaria.setEmail("maria@terra.com.br");
		clienteMaria.setSalario(2000);		
		
		// criação da conta da Maria
		
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);		
		System.out.println("--->" + contaMaria.getTipo());

		// Criar o cliente Pedro
		
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@ig.com.br");
		clientePedro.setSalario(1500);
				
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.setAgencia(agencia);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);

		// Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@terra.com.br");
		clienteAna.setSalario(1800);		
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setTitular(clienteAna);
		contaAna.setAgencia(agencia);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);

		// Exibir detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println("*******************************");
		System.out.println(contaMaria.getTitular().getNome());
		System.out.println(contaMaria.getTitular().getEmail());
		System.out.println(contaPedro.getTitular().getNome());
		
		
		// depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar 300 reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		// depositar -200 da conta do Pedro
		contaPedro.depositar(200);
		contaPedro.exibirDetalhes();
		
		// sacar 400 da conta da Maria
		contaMaria.sacar(400);
		contaMaria.exibirDetalhes();
		
		// Transferir 100 reais da conta do Pedro
		// para a conta da Maria
		contaPedro.transferir(contaMaria, 100);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
		
	}

}
