package Java;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[]args) {
		int p=1, i=1;
		int [] numero = new int [6], numerosPares = new int[6], numerosImpares = new int[6];
		int totalNumerosPares = 0, totalNumerosImpares= 0;
		
		Scanner in = new Scanner(System.in);
		
		for (int c=0; c<6;c++) {
			System.out.println("Informe um número inteiro: ");
			numero[c] = in.nextInt();
	
			 if (numero[c] % 2==0) {
				totalNumerosPares++;
				numerosPares[p] = numero[c];
				p++;
				
			} else {
				totalNumerosImpares++;
				numerosImpares[i] = numero[c];
				i++;	
			}
			
		}
		System.out.println(totalNumerosPares+ " números informados são pares, sendo esses: ");
		if (totalNumerosPares<7) {
			for (p=totalNumerosPares;p>0;p--) {
				System.out.println(numerosPares[p]);
			}
			
			System.out.println(totalNumerosImpares+ " números informados são impares, sendo esses: ");
			if (totalNumerosImpares<7) {
				for (i=totalNumerosPares;i>0;i--) {
					System.out.println(numerosImpares[i]);
				}
		}


	}
}
}
