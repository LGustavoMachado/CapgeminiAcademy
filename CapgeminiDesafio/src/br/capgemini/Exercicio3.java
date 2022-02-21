package br.capgemini;

import java.util.Scanner;

//Esse Exercício fiz com auxílio de muitas pesquisas.
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite a palavra: ");
			String palavra = sc.next();

			int numero = palavra.length();
			int contagem = 0;

			for (int i = 0; i <= numero - 1; i++) {
				for (int j = 0; j <= numero - 1 - i; j++) {
					String palavra1 = palavra.substring(j, j + i + 1);
					for (int k = j + 1; k <= numero - i - 1; k++) {
						StringBuilder s2 = new StringBuilder(palavra.substring(k, k + i + 1));
						if (s2.toString().indexOf(palavra1.charAt(0)) >= 0) {
							int cont = 0;
							for (int m = 0; m < palavra1.length(); m++) {
								if (s2.toString().indexOf(palavra1.charAt(m)) >= 0) {
									s2.deleteCharAt(s2.toString().indexOf(palavra1.charAt(m)));
									cont++;
								}
							}
							if (cont == palavra1.length()) {
								contagem++;
							}
						}
					}
				}
			}
			System.out.println(contagem);
			System.out.println("\nDigite 0 para sair ou 1 para continuar.");
			int opcao = sc.nextInt();
			if (opcao == 0) {
				break;
			}
			sc.close();

		}

	}
}
