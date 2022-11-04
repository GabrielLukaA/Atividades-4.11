package Java;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		double[] totalVendas = new double[4];
		double[] comissao = new double[4];
		String[] nome = new String[4];
		double[] quantiaReceber = new double[4];
		int i = 0;
		double totalVendasVendedores = 0.0;
		String nomeMaiorComissao = new String();
		String nomeMenorComissao = new String();
		double maiorComissao = 0.0, menorComissao = 0.0;
		
		Scanner in = new Scanner(System.in);

		for (i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println("Informe o seu nome: ");
			nome[i] = in.next();
			System.out.println("Informe a sua quantia de vendas: ");
			totalVendas[i] = in.nextDouble();
			System.out.println("Informe o seu percentual de comissão: ");
			comissao[i] = in.nextDouble();

			totalVendasVendedores += totalVendas[i];
			quantiaReceber[i] = totalVendas[i] * comissao[i] / 100;
			
			if (i==0) {
				nomeMaiorComissao = nome[i];
				nomeMenorComissao = nome[i];
				maiorComissao = quantiaReceber [i];
				menorComissao = quantiaReceber[i];
			} else if (i>0) {
				if (quantiaReceber[i]>maiorComissao) {
					maiorComissao = quantiaReceber [i];
					nomeMaiorComissao = nome[i];
				} if (quantiaReceber[i]< menorComissao) {
					menorComissao = quantiaReceber[i];
					nomeMenorComissao = nome[i];
				}
			}
			
		}

		System.out.println("vendedor " + nome[0] + " irá receber " + quantiaReceber[0] + " reais");
		System.out.println("vendedor " + nome[1] + " irá receber " + quantiaReceber[1] + " reais");
		System.out.println("vendedor " + nome[2] + " irá receber " + quantiaReceber[2] + " reais");
		System.out.println("vendedor " + nome[3] + " irá receber " + quantiaReceber[3] + " reais");
		System.out.println("vendedor " + nome[4] + " irá receber " + quantiaReceber[4] + " reais");
		System.out.println("vendedor " + nome[5] + " irá receber " + quantiaReceber[5] + " reais");
		System.out.println("vendedor " + nome[6] + " irá receber " + quantiaReceber[6] + " reais");
		System.out.println("vendedor " + nome[7] + " irá receber " + quantiaReceber[7] + " reais");
		System.out.println("vendedor " + nome[8] + " irá receber " + quantiaReceber[8] + " reais");
		System.out.println("vendedor " + nome[9] + " irá receber " + quantiaReceber[9] + " reais");

		
		System.out.println("O total de vendas de todos os vendedores foi de R$ "+totalVendasVendedores);
		System.out.println("O maior ganho de comissão foi do vendedor "+nomeMaiorComissao+" com uma quantia a receber de R$ "+maiorComissao);
		System.out.println("O menor ganho de comissão foi do vendedor "+nomeMenorComissao+" com uma quantia a receber de R$ "+menorComissao);
		
	}
}
