package atividadewhile;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menor21 = 0;
		int maior50 = 0;
		int idade;
		
		System.out.println("     Digite as idades para comparar: ");
		System.out.println("                 OU ");
		System.out.println(" Digite uma idade negativa para encerrar ");

		while(true) {
			System.out.printf("Idade: ");
			idade = scanner.nextInt();
			
			if(idade < 0) {
				break;
			}
			
			if(idade < 21) {
				menor21 ++;
			}else if(idade > 50) {
				maior50++;
			}
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+menor21);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
		
	}

}
