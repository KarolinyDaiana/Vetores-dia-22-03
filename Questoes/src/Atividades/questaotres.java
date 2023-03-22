package Atividades;

import java.util.Scanner;

public class questaotres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[] numero = new int[15];

		for (int cont = 0; cont < 15; cont++) {
			System.out.println("Digite o " + (cont + 1) + "º número");
			numero[cont] = leia.nextInt();
		}

		for (int cont1 = 0; cont1 < 15; cont1++) {
			if (numero[cont1] < 0) {
				numero[cont1] = 0;
			}
		}

		System.out.println("Sequência atualizada:");

		for (int cont2 = 0; cont2 < 15; cont2++) {
			System.out.println(numero[cont2]);
		}

	}

}
