package Exercicios;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner texto = new Scanner(System.in);
		int numero_um = 0;
		int numero_dois = 0;
		String sinal = " ";
		
		System.out.println("Olá, seja bem-vindo a calculadora programada em java!\n");
		
		while(!(sinal.equals("#"))) {
			
			System.out.println("Qual operador aritmético queres usar?\n  +  -  /  *  \n Ou pressione # para sair ");
			sinal = texto.nextLine();
			if (sinal.equals("#")) {
				System.out.println("Programa encerrado");
			}
			else {
				System.out.println("Ok, digite o primeiro número por favor: ");
				numero_um = texto.nextInt();
				texto.nextLine();
				System.out.println("Perfeito! Agora digite o segundo número: ");
				numero_dois = texto.nextInt();
				texto.nextLine();
			}			
			
			if (sinal.equals("+")) {
				int resultado1 = numero_um + numero_dois;
				System.out.println("Resultado: "+resultado1);
			}
			else if (sinal.equals("-")) {
				int resultado2 = numero_um - numero_dois;
				System.out.println("Resultado: "+resultado2);
			}
			else if (sinal.equals("/")) {
				int resultado2 = numero_um / numero_dois;
				System.out.println("Resultado: "+resultado2);
			}
			else if (sinal.equals("*")) {
				int resultado3 = numero_um * numero_dois;
				System.out.println("Resultado: "+resultado3);
			}
			
		}
		
		texto.close();
	}

}

