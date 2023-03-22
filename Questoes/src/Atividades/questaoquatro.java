package Atividades;

import java.util.Scanner;

public class questaoquatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[] numero1 = new int[5], numero2 = new int[5];

		for (int cont = 0; cont < numero1.length; cont++) {
			System.out.println("Digite o primeiro número: ");
			numero1[cont] = leia.nextInt();

			System.out.println("Digite o segundo número: ");
			numero2[cont] = leia.nextInt();

			if (numero1[cont] == numero2[cont]) {
				System.out.println("Iguais!\n");
			} else {
				System.out.println("Não são iguais!\n");
			}
		}

		System.out.println("Fim do programa!");

	}

}
