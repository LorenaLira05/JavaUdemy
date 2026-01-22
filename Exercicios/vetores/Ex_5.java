package vetores;
import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, posicaoMaior;
		double maior = 0;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("Maior valor: \n");
		
		maior = vetor[0]; 
		posicaoMaior = 0;
		
		for(int i=0; i<n; i++) {
			if(vetor[i]> maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("Maior valor: %.1f%n", maior);
		System.out.printf("Posicao do maior valor: %d", posicaoMaior);
		
		sc.close();	
	}
}