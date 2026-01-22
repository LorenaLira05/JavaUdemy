package vetores;

import java.util.Scanner;

public class Ex_8 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media=0, somaMedia=0, par=0;
		
		System.out.println("Quantos elementos vai ter no vetor?");
		n=sc.nextInt();
		
		double[] vetor = new double [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero\n");
			vetor[i]= sc.nextDouble();
			if(vetor[i] % 2 == 0) {
				somaMedia += vetor[i];
				par +=1;
			}
		}
		
		media = somaMedia/ par;
		
		if(somaMedia != 0 ) {
			System.out.printf("\nMEDIA DOS PARES = %.1f\n", media);
		} else {
			System.out.print("NENHUM NUMERO PAR");
		}
		
		sc.close();	
	}
}
	
