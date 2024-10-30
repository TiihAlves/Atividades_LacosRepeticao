package atividadewhile;

import java.util.Scanner;

public class PesquisaInterna {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int contBack = 0;
		int contFrontMulher = 0;
		int contMobileHomem = 0;
		int contFullNB = 0;
		int totalColaboradores = 0;
		int somaIdades = 0;
		
		boolean continuar= true;
		
		int idade, genero, tipodev;
		
		System.out.println("    Iniciar Pesquisa:");
		
		while(continuar) {
		
		System.out.println("Digite a idade do colaborador:");
		idade = scanner.nextInt();
		System.out.println("Identidade de Gênero?");
		System.out.println("(1) - Mulher Cis");
		System.out.println("(2) - Homem Cis");
		System.out.println("(3) - Não Binário");
		System.out.println("(4) - Mulher Trans");
		System.out.println("(5) - Homem Trans");
		System.out.println("(6) - Outros");
		genero = scanner.nextInt();
		System.out.println("Você atua como qual tipo de Pessoa Desenvolvedora?");
		System.out.println("(1) - Backend");
		System.out.println("(2) - Frontend");
		System.out.println("(3) - Mobile");
		System.out.println("(4) - FullStack");
		tipodev = scanner.nextInt();
		
		if(tipodev == 1) {
			contBack++;
		}
		if(tipodev == 2) {
			if(genero == 1 || genero == 4) {
				contFrontMulher++;
			}
		}
		if(tipodev == 3) {
			if(genero == 2 || genero == 5) {
				if(idade > 40) {
					contMobileHomem++;
				}
			}
		}
		if(tipodev == 4) {
			if(genero == 3) {
				if(idade < 30) {
					contFullNB++;
				}
			}
			
		}
		
		totalColaboradores++;
		somaIdades += idade;
		
		System.out.println("Deseja continuar a pesquisa? (s/n)");
		continuar = scanner.next().equalsIgnoreCase("s");
		
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+ contBack);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+ contFrontMulher);
		System.out.println("Total de Homens Cis e Trans desenvolvedores mobile maiores de 40 anos: "+ contMobileHomem);
		System.out.println("Total de Pessoas Não Binárias desenvolvedores FullStack menores de 30 anos: "+ contFullNB);
		System.out.println("Número total de pessoas que responderam à pesquisa: "+ totalColaboradores);
		
		if(totalColaboradores > 0) {
			double mediaIdade = (double) somaIdades/totalColaboradores;
			System.out.printf("Média de idade das pessoas que responderam a pesquisa: %.2f", mediaIdade);
						
		}else {
			System.out.println("Nenhuma pessoa respondeu à pesquisa.");
		}
		
		scanner.close();
	}

}
