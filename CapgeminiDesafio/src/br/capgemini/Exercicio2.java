package br.capgemini;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.println("Nome do usuário: ");
			String usuario = sc.next();
			
			System.out.println("Digite uma senha: ");
			String senha = sc.next();
	
			int maiuscula = 0, minuscula = 0, numero = 0, especial = 0;
	
			for (int i = 0; i < senha.length(); i++) {
				char letra = senha.charAt(i);
				if (letra >= 'A' && letra <= 'Z')
					maiuscula++;
				else if (letra >= 'a' && letra <= 'z')
					minuscula++;
				else if (letra >= '0' && letra <= '9')
					numero++;
				else
					especial++;
			}
			
			
			if (senha.length() < 6) {
				System.out.println("Sua senha deve ter no mínimo 6 caracteres.");
				
			}
			if (maiuscula == 0) {
				System.out.println("Conter no mínimo 1 letra em maiúsculo.");
			}
			if (minuscula == 0) {
				System.out.println("Conter no mínimo 1 letra em minúsculo.");
			}
			if (numero == 0) {
				System.out.println("Conter no mínimo 1 digito.");
			}
			if (especial == 0) {
				System.out.println("Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
			} 
			
			if(senha.length() >= 6 && maiuscula != 0 && minuscula != 0 && numero != 0 && especial != 0) {
				System.out.println("Parabéns " + usuario + ", sua senha está segura!\n"
						+ "Cadastro efetivado!");
				break;
			}	
			System.out.println("Senha não é forte o suficiente.\nDigite usuário e senha novamente!\n"
					+ "=========================================================================");
		}
		sc.close();
	}

}
