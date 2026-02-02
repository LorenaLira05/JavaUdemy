package vetores;

import java.util.Scanner;

public class Ex_7 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double media=0, somaMedia=0;
		
		System.out.println("Quantos elementos vai ter no vetor?");
		n=sc.nextInt();
		
		double[] vetor = new double [n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero\n");
			vetor[i]= sc.nextDouble();
			somaMedia += vetor[i];
		}
		
		media = somaMedia/ n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.print("Elementos abaixo da media: \n");
		
		for(int i=0; i<n; i++) {
			if(vetor[i]<media) {
				System.out.printf("%.1f\n", vetor[i]);
			}	
		}
		
		sc.close();	
	}
}
