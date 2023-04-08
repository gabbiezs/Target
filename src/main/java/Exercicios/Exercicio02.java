package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = input.nextInt();

		int fib1 = 0, fib2 = 1, fib3 = 1;
		boolean pertence = false;

		//calcula a sequência de Fibonacci até um número igual ou maior ao número digitado
		if (numero == 0) {
			pertence = true;
		} else {
			while (fib3 <= numero) {
				if (fib3 == numero) {
					pertence = true;
					break;
				}
				fib1 = fib2;
				fib2 = fib3;
				fib3 = fib1 + fib2;
			}
		}

		if (pertence) {
			System.out.println(numero + " faz parte da sequência de Fibonacci.");
		} else {
			System.out.println(numero + " não faz parte da sequência de Fibonacci.");
		}
		input.close();

	}

}
