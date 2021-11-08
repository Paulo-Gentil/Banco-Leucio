package banco;

import java.util.Scanner;

public class BancoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BancoMetodos a = new BancoMetodos();
		
		Scanner leia = new Scanner(System.in);

		int menu;

		System.out.println("Bem vindo!!!");

		do {
			System.out.println("digite 1 para entar no sistema");

			menu = leia.nextInt();

		} while (menu != 1);

		do {
			System.out.println("Bem vindo!!!");
			System.out.println("verifique as opções disponiveis no MENU:");
			System.out.println("1 - Abrir conta");
			System.out.println("2 - creditar");
			System.out.println("3 - debitar");
			System.out.println("4 - Consultar");
			System.out.println("5 - encerrar conta");
			System.out.println("selecione uma opção:");
			menu = leia.nextInt();

			switch (menu) {
			case 1:
				a.abrirConta();
				break;
			case 2:
				a.creditar();
				break;
			case 3:
				a.debitar();
				break;
			
			case 4:
				a.status();
				break;
			case 5:
				a.encerrar();
				break;
			}

		} while (menu >= 1 && menu <= 5);

	}

		
}


