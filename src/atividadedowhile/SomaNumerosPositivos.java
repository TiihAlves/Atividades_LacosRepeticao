package atividadedowhile;

import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num, soma=0;
		
		System.out.println("Digite numeros para somar:");
		
		
		
		do {
			System.out.printf("Número: ");
			num = scanner.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		}while(num != 0);
		
		System.out.println("A Soma dos números positivos digitados é: "+soma);

		scanner.close();
	}

}
