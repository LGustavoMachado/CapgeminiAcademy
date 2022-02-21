package br.capgemini;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			System.out.println("===========================================\n");
			for(int l = 0; l < n; l++) { 
				for(int c = n - l; c > 0; c--) {
					System.out.print(" ");
				}
				for(int i = 0; i < l; i++) {
					System.out.print("*");
				}
				System.out.println("*");
			}
			System.out.println("===========================================\n");
			System.out.println("Digite: 0 para sair ou 1 para continuar.");
			int opcao = sc.nextInt();
			if(opcao == 0) {
				break;
			}
		}while(true);
		sc.close();
	}

}
