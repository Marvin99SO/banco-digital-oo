package com.br.bancodigital;

import com.br.bancodigital.models.Cliente;
import com.br.bancodigital.models.Conta;
import com.br.bancodigital.models.ContaCorrente;
import com.br.bancodigital.models.ContaPoupanca;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BancoDigitalApplication.class, args);
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
