package Exercicios;
import java.util.Scanner;

public class Inverte {
	    public static void main(String[] args) {
	        Scanner texto = new Scanner(System.in);
	        System.out.println("Bem vindo ao Inverte-numeros!");
	        System.out.print("Digite um número de 3 dígitos: ");
	        int num = texto.nextInt();
	        /*Criei uma variavel chamada "num" que vale para o número em geral. 
	         * Como no exercício falava sobre apenas numeros de 3 digitos,
	         * o código apresenta um "Se", que filtrará se o número 
	         * tem 3 digitos mesmo (ou seja, todos os numeros entre
	         * 100 até 999). Caso não tiver, o programa exibirá uma mensagem*/
	        if (num < 100 || num > 999) {
	            System.out.println("Por favor, somente números com 3 digitos. Pressione f11 para recomeçar");
	        /* Nesta parte o código prosseguiu com o que foi digitado,
	         * então ele entra para um cálculo de inversão dos números. Por fim os exibirá invertidos */
	        } else {
	            int numero_um = num % 10;
	            int numero_dois = (num / 10) % 10;
	            int numero_tres = num / 100;
	            System.out.println("O número invertido é: " + numero_um + numero_dois + numero_tres);
	        }

	        texto.close();
	    }
	}

