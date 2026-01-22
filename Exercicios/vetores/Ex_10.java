package vetores;
import java.util.Scanner;

public class Ex_10 {
	
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
			
				double mediaAluno=0;
				int n;
				
				System.out.println("Quantos alunos serao digitados? ");
				n = sc.nextInt();
				
				String[] nome = new String[n];
				double[] nota1 = new double[n];
				double[] nota2 = new double[n];
				
				for (int i=0; i<n; i++) {
					System.out.printf("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
					sc.nextLine();
					nome[i]= sc.nextLine();
					nota1[i]= sc.nextDouble();
					nota2[i]= sc.nextDouble();
				}
				
				System.out.println("Alunos aprovados: \n");
				
				for (int i=0; i<n; i++) {
					mediaAluno = (nota1[i] + nota2[i])/2.0 ;
					if (mediaAluno >= 6.0) {
						System.out.println(nome[i]);
			    }
					
				}	
				sc.close();
		}
	}
