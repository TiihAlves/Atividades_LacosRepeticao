package atividadedowhile;

import java.util.Scanner;

public class MediaNumerosMultiplos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num, soma = 0, contador=0;
		
		System.out.println("Digite numeros para chegar a uma média:");
		
		do {
			System.out.printf("Número: ");
			num = scanner.nextInt();
			
				if (num != 0) {
					if(num % 3 == 0) {
						soma += num;
						contador++;
					}
					
				}
			
		}while(num !=0);
		
		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.printf("A média dos números múltiplos de 3 é: %.2f", media);
		}else {
			System.out.println("Nenhum número mútiplo de 3 foi digitado!");
		}
		
		scanner.close();
	}

}
