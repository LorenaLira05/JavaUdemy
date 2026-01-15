package estrutura_for;
import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double mediaPonderada = (a * 2.0 + b * 3.0 + c * 5.0) /10;
			System.out.printf("%.1f%n", mediaPonderada);		
		} 
		sc.close();
		
	}
	
}
