package vetores;

import java.util.Scanner;

public class Ex_4 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n;
	int somaPares=0;
	System.out.println("Quantos numeros voce vai digitar? ");
	n = sc.nextInt();
	int[] vetor = new int[n];
	
	for(int i=0; i<n; i++) {
		System.out.println("Digite um numero: ");
		vetor[i] = sc.nextInt();
	}
	
	System.out.println("Numeros pares: \n");
	
	for(int i=0; i<n; i++) {
		if(vetor[i] % 2 == 0) {
			somaPares += 1;
			System.out.print(vetor[i] + " ");
			
		}
	}
	
	System.out.printf("\nQuantidade de pares: %d", somaPares);
	
	sc.close();
	
	}
	

}