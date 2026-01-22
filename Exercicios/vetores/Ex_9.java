package vetores;
import java.util.Scanner;

public class Ex_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, posicaoMaisVelho, maisVelho;
		
		System.out.println("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.printf("nome: ");
			nome[i]= sc.next();
			System.out.println("Idade: ");
			idade[i]= sc.nextInt();
		}
		
		 maisVelho= idade[0];
		 posicaoMaisVelho=0;
		
		for (int i=0; i<n; i++) {
			if(maisVelho<idade[i]) {
				maisVelho = idade[i];
				posicaoMaisVelho= i;
			}
		}
			
		for (int i=0; i<n; i++) {
			if(maisVelho == idade[i]) {
				System.out.printf("Pessoa mais velha: " + nome[i]);
			}
			
		}

		sc.close();	
	}	
}
