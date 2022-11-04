package Java;
import java.util.Scanner;
import java.util.Random;
public class Questão3 {
	public static void main(String[]args) {
		double [] temperaturas = new double[121];
		double temperaturar, totalTemperatura=0.0, maiorTemperatura=0.0, menorTemperatura=0.0;
		
		Scanner in = new Scanner(System.in);
		Random temperatura = new Random(40);
		
		
		for (int contador=0;contador<temperaturas.length;contador++) {
		
			temperaturar= temperatura.nextDouble();
			if (temperaturar<15) {
				contador--;
			} else {
				totalTemperatura+=temperaturar;
				if (contador==0) {
					maiorTemperatura=temperaturar;
					menorTemperatura=temperaturar;
				} else {
					if (temperaturar>maiorTemperatura) {
						maiorTemperatura=temperaturar;
					} else (temperaturar<menorTemperatura){
						menorTemperatura=temperatura;
					}
				}
			}
			
			
			
		}
		

	}

}
