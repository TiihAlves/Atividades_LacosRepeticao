package atividadewhile;

import java.util.Scanner;

public class PesquisaInterna {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int contadorBackend = 0;
		int contadorMulherFrontend = 0;
		int contadorHomemMobile = 0;
		int contadorNaoBinario = 0;
		int totalColaboradores = 0;
		int somaIdades = 0;

		boolean continuar = true;

		int idade, genero, tipodev;

		System.out.println("    Iniciar Pesquisa:");

		while (continuar) {

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

			if (genero < 1 || genero > 6) {
				System.out.println(" Opção Inválida!");
				System.out.printf(" Tente Novamente!");

			} else {

				System.out.println("Você atua como qual tipo de Pessoa Desenvolvedora?");
				System.out.println("(1) - Backend");
				System.out.println("(2) - Frontend");
				System.out.println("(3) - Mobile");
				System.out.println("(4) - FullStack");
			}
			tipodev = scanner.nextInt();

			if (tipodev == 1) {
				contadorBackend++;
				
			} else if (tipodev == 2) {
				if (genero == 1 || genero == 4) {
					contadorMulherFrontend++;
				}

			} else if (tipodev == 3) {
				if (genero == 2 || genero == 5) {
					if (idade > 40) {
						contadorHomemMobile++;
					}
				}

			} else if (tipodev == 4) {
				if (genero == 3) {
					if (idade < 30) {
						contadorNaoBinario++;
					}
				}
			} else {
				System.out.println("Opção Inválida!");
			}

			totalColaboradores++;
			somaIdades += idade;

			System.out.println("Deseja continuar a pesquisa? (s/n)");
			continuar = scanner.next().equalsIgnoreCase("s");

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + contadorBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorMulherFrontend);
		System.out.println(
				"Total de Homens Cis e Trans desenvolvedores mobile maiores de 40 anos: " + contadorHomemMobile);
		System.out.println(
				"Total de Pessoas Não Binárias desenvolvedores FullStack menores de 30 anos: " + contadorNaoBinario);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + totalColaboradores);

		if (totalColaboradores > 0) {
			double mediaIdade = (double) somaIdades / totalColaboradores;
			System.out.printf("Média de idade das pessoas que responderam a pesquisa: %.2f", mediaIdade);

		} else {
			System.out.println("Nenhuma pessoa respondeu à pesquisa.");
		}

		scanner.close();
	}

}
