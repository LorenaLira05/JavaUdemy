package vetores;
import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números voce vai digitar?");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double soma = 0;
		double media =0;
		
		for(int i=0; i<n; i ++) {
			vetor[i]= sc.nextDouble();
		}
		
		System.out.println("valores: ");
		
		for(int i=0; i<n; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		for(int i=0; i<n; i ++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.println("\nSOMA = " + soma);
		System.out.println("MEDIA = " + media);
		

		sc.close();	
		
	}
}
