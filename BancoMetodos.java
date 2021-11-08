package banco;

import java.util.Random;
import java.util.Scanner;


public class BancoMetodos {

   Random gerador = new Random();
	
	Scanner ler = new Scanner(System.in);

	private String tipoConta, nomeAgencia, nomeBanco;
	private boolean contaAberta;
	private int numConta, numAgencia, numBanco, idConta;
	private double saldo, deposito, saque;
	
	
	public void abrirConta() {

		do {
			System.out.println("Digite o tipo de conta: 1-corrente, 2-poupança, 3,conjunta");
			this.setIdConta(this.idConta = ler.nextInt());

		} while (idConta != 1 && idConta != 2 && idConta != 3);

		if (this.getIdConta() == 1) {
			this.setContaAberta(contaAberta = true);
			this.setTipoConta(tipoConta = "Conta Corrente");
			
			System.out.println("Sua conta é: " + this.getTipoConta());
			System.out.println("Conta aberta? " + this.getContaAberta());
			System.out.println("*****************************");

		}if (this.getIdConta() == 2) {
				this.setContaAberta(contaAberta = true);
				this.setTipoConta(tipoConta = "Conta Poupança");
				
				System.out.println("Sua conta é: " + this.getTipoConta());
				System.out.println("Conta aberta? " + this.getContaAberta());
				System.out.println("*****************************");
		
		
		} else if (this.getIdConta() == 3) {
			this.setContaAberta(contaAberta = true);
			this.setTipoConta(tipoConta = "Conta Conjunta");
			
			System.out.println("Sua conta é: " + this.getTipoConta());
			System.out.println("Conta aberta?" + this.getContaAberta());
			System.out.println("*****************************");
		
		}

		ler.nextLine();
		
		System.out.println("Digite o nome do Banco");
		this.setNomeBanco(this.nomeBanco = ler.nextLine());
		
		
		System.out.println("Digite o número do Banco");
	    this.setNumBanco(this.numBanco = ler.nextInt());
	    ler.nextLine();
	    
	    System.out.println("Digite o nome da Agencia");
	    this.setNomeAgencia(this.nomeAgencia = ler.nextLine());
	
	    System.out.println("Digite o número da Agencia");
	    this.setNumAgencia(this.numAgencia = ler.nextInt());
	    ler.nextLine();
	    
	    this.setNumConta(gerador.nextInt(9999));
	    System.out.println("o numero da sua conta é:" + this.getNumConta());
	    
	}

	public void status() {
		if (this.getContaAberta() == true) {
			System.out.println("Status:");
			System.out.println("Banco: " + this.getNomeBanco());
			System.out.println("Numero do Banco: " + this.getNumBanco());
			System.out.println("Agencia: " + this.getNomeAgencia());
			System.out.println("Numero da Agencia: " + this.getNumAgencia());
			System.out.println("Seu saldo é: " + this.getSaldo());
			System.out.println("Sua conta é: " + this.getTipoConta());
			System.out.println("número da conta: " + this.getNumConta());
			System.out.println("*****************************");
		} else
			System.out.println("Abra conta primeiro");
		System.out.println("*****************************");
	}
	
	public void debitar() {
		if (this.getContaAberta() == true) {
			System.out.println("Digite o valor a ser Debitado");
			this.setSaque(this.saque = ler.nextDouble());
			System.out.println("Debitando.......");
			this.setSaldo(this.getSaldo() - this.getSaque());
			System.out.println("Seu saldo é: " + this.getSaldo());
			System.out.println("*****************************");

		} else
			System.out.println("Abra conta primeiro");
		System.out.println("*****************************");
	}
	
	public void creditar() {
		if (this.getContaAberta() == true) {
			System.out.println("Digite o valor a ser creditado");
			this.setDeposito(this.deposito = ler.nextDouble());
			System.out.println("Creditando.......");
			this.setSaldo(this.getSaldo() + this.getDeposito());
			System.out.println("Seu saldo é: " + this.getSaldo());
			System.out.println("*****************************");
		} else
			System.out.println("Abra conta primeiro");
		System.out.println("*****************************");
	}
	
	public void encerrar() {
		if (this.getContaAberta() == true && this.getSaldo() == 0) {
			this.setContaAberta(this.contaAberta = false);
			System.out.println("fechando");
			System.out.println("Conta aberta?" + this.getContaAberta());
			System.out.println("*****************************");
		}
		if (this.getContaAberta() == false) {
			System.out.println("Sua conta está fechada");
			System.out.println("*****************************");
		} else {
			System.out.println("Seu saldo precisa ser 0 para que sua conta seja fechada");
			System.out.println("*****************************");
		}

	}
	
	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public String getNomeAgencia() {
		return nomeAgencia;
	}


	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}


	public String getNomeBanco() {
		return nomeBanco;
	}


	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}


	public boolean getContaAberta() {
		return contaAberta;
	}


	public void setContaAberta(boolean contaAberta) {
		this.contaAberta = contaAberta;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public int getNumAgencia() {
		return numAgencia;
	}


	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}


	public int getNumBanco() {
		return numBanco;
	}


	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}


	public int getIdConta() {
		return idConta;
	}


	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getDeposito() {
		return deposito;
	}


	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}


	public double getSaque() {
		return saque;
	}


	public void setSaque(double saque) {
		this.saque = saque;
	}


	
	
	
	
	
	
	
	

}
