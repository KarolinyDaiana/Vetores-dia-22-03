package Atividades;

import java.util.Scanner;

import java.util.Random;

public class questaodois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();

		int[] codigo = new int[10], preco = new int[10];
		int aux = 0, aux2 = 0;

		for (int cont = 0; cont < 10; cont++) {
			codigo[cont] = aleatorio.nextInt(30 + 1);
			preco[cont] = aleatorio.nextInt(100 + 1);

			System.out.println("Produto de código " + codigo[cont] + ", custa R$" + preco[cont]);
		}

		for (int cont1 = 0; cont1 < preco.length; cont1++) {
			for (int cont2 = cont1 + 1; cont2 < preco.length; cont2++) {
				if (preco[cont1] < preco[cont2]) {
					aux = preco[cont1];
					preco[cont1] = preco[cont2];
					preco[cont2] = aux;

					aux2 = codigo[cont1];
					codigo[cont1] = codigo[cont2];
					codigo[cont2] = aux;
				}
			}
		}

		System.out.println("\n\nCódigo do produto mais caro: " + codigo[0] + ", que custa R$" + preco[0]);
		System.out.println("Código do segundo produto mais caro: " + codigo[1] + ", que custa R$" + preco[1]);
		System.out.println("Código do terceiro produto mais caro: " + codigo[2] + ", que custa R$" + preco[2]);

	}

}
