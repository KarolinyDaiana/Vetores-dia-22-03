package Atividades;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[] temperaturaMedia = new int[12];
		int menor = 99, maior = -99;

		String[] mes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		String menorMes = "nada", maiorMes = "nada";

		for (int cont = 0; cont < 12; cont++) {
			System.out.println("Temperatura média do mês " + mes[cont] + ":");
			temperaturaMedia[cont] = leia.nextInt();

			if (temperaturaMedia[cont] < menor) {
				menor = temperaturaMedia[cont];
				menorMes = mes[cont];

			} else if (temperaturaMedia[cont] > maior) {
				maior = temperaturaMedia[cont];
				maiorMes = mes[cont];

			}
		}

		System.out.println("A maior temperatura foi registrada no mês de " + maiorMes + ", sendo " + maior + "° C.");
		System.out.println("A menor temperatura foi registrada no mês de " + menorMes + ", sendo " + menor + "° C.");

	}

}
