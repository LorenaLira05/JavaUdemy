package vetores;
import java.util.Scanner;

public class Ex_3 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int menorIdade = 0;
			double alturaMedia=0, somaAltura = 0, porcentagem=0;
			int n;
			
			System.out.println("Quantas pessoas serao digitadas? ");
			n = sc.nextInt();
			
			String[] Nome = new String[n];
			int[] Idade = new int[n];
			double[] Altura = new double[n];
			
			for (int i=0; i<n; i++) {
				System.out.printf("Dados da %da pessoa:\n", i + 1);
				System.out.printf("nome: ");
				Nome[i]= sc.next();
				System.out.println("Idade: ");
				Idade[i]= sc.nextInt();
				System.out.println("Altura: ");
				Altura[i]= sc.nextDouble();
			}
			
			for (int i=0; i<n; i++) {
				somaAltura += Altura[i];
			}
			alturaMedia = somaAltura / n;
			
			for (int i=0; i<n; i++) {
				if(Idade[i]<16) {
					menorIdade += 1;
					porcentagem = menorIdade * 100.0 / n;

				}
			}
			

			System.out.printf("Altura media: %.2f%n", alturaMedia);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
			
			for (int i=0; i<n; i++) {
			    if (Idade[i] < 16) {
			        System.out.println(Nome[i]);
			    }
			}
			
			sc.close();
		}
}
