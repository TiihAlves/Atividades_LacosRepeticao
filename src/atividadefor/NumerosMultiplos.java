package atividadefor;

import java.util.Scanner;

public class NumerosMultiplos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = scanner.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		num2 = scanner.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo Inválido!");
		}else {
			
			for(int i = num1; i <= num2; i++ ) {
				
				if ((i % 3 ==0 )&&(i % 5 == 0)) {
					
					System.out.println(i + " é multiplo de 3 e 5");
					
				}
				
			}
		
			
		}
		scanner.close();
	}

}
