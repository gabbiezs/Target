package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int numero = input.nextInt();

		int fib1 = 0, fib2 = 1, fib3 = 1;
		boolean pertence = false;

		//calcula a sequ�ncia de Fibonacci at� um n�mero igual ou maior ao n�mero digitado
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
			System.out.println(numero + " faz parte da sequ�ncia de Fibonacci.");
		} else {
			System.out.println(numero + " n�o faz parte da sequ�ncia de Fibonacci.");
		}
		input.close();

	}

}
