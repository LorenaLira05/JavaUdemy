package vetores;
import java.util.Scanner;

public class Ex_11 {
		
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int somaHomens=0, somaMulheres,n, posicaoMaior=0, posicaoMenor=0;
				double maiorAltura, menorAltura, mediaMulheres, totalAlturaF;
				
				System.out.println("Quantas pessoas serao digitadas? ");
				n = sc.nextInt();
				
				
				char[] genero = new char[n];
				double[] altura = new double[n];
				
				for (int i=0; i<n; i++) {
					System.out.printf("Altura:");
					altura[i]= sc.nextDouble();
					System.out.printf("Genero:");
					genero[i]= sc.next().charAt(0);
				}
				
				menorAltura=altura[0];
				maiorAltura=altura[0];
				posicaoMaior=0;
				posicaoMenor=0;
				
				for(int i=0; i<n; i++) {
					if(altura[i]> maiorAltura) {
						maiorAltura = altura[i];
						posicaoMaior = i;
					} if(altura[i]< menorAltura) {
						menorAltura = altura[i];
						posicaoMenor = i;
					}
				}
				
				somaMulheres =0;
				somaHomens=0;
				totalAlturaF=0;
				
				for(int i=0; i<n; i++) {
					if(genero[i]== 'f' || genero[i]== 'F') {
						somaMulheres++;
						totalAlturaF+= altura[i];
				} else {
					somaHomens ++;
				}
				}
				
				mediaMulheres = totalAlturaF / somaMulheres;

				System.out.printf("Menor altura = %.2f\n", menorAltura);
			    System.out.printf("Maior altura = %.2f\n", maiorAltura);
			    System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulheres);
			    System.out.printf("Numero de homens = %d\n", somaHomens);


				sc.close();
			
	}

}
