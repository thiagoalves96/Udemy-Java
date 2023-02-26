import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite dois numeros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a<b) { // Para dar certo em qualquer sequencia
			int maior=b;
			b=a;
			a=maior;				
		}
		
		
		for (int i=b;i<a;i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.print("A soma dos impares é: "+ soma);
		
		
		
		
sc.close();
	}

}
