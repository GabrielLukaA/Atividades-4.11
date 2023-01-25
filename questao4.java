package atividades;

import java.util.Scanner;

public class questao4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int quantiaNomes, opcao;

		System.out.println("Informe quantos nomes o seu vetor terá: ");
		quantiaNomes = in.nextInt();

		String[] nomes = new String[quantiaNomes];
		String busca = new String();

		for (int c = 0; c < quantiaNomes; c++) {
			System.out.println("Informe um nome: ");
			nomes[c] = in.next();
		}
		for (opcao = 4; opcao == 4; opcao = opcao) {
			System.out.println("======== MENU ======== ");
			System.out.println("1) Cadastrar nome");
			System.out.println("2) Pesquisar nome");
			System.out.println("3) Listar todos os nomes");
			System.out.println("0) Sair do programa");
			System.out.println("——————–");

			System.out.println("O que você deseja fazer? ");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				quantiaNomes++;
				System.out.println("Adicione mais um nonme: ");
				nomes[quantiaNomes - 1] = in.next();
				opcao = 4;
				break;
			case 2:
				System.out.println("Informe o nome que deseja encontrar: ");
				busca = in.next();

				for (int c = 0; c < quantiaNomes; c++) {
					if (nomes[c] == busca) {
						System.out.println("Esse nome está na posição " + c);
						c = quantiaNomes + 5;
					}
				}
				opcao = 4;
				break;
			case 3:
				for (int c = 0; c < quantiaNomes; c++) {
					System.out.println(nomes[c]);
				}
				opcao = 4;
				break;
			case 0:
				break;
			}
		}
	}
}
