import java.util.Locale;
import java.util.Scanner;

public class SOMA_VET {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vai ser digitar? ");
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		double soma=0;
		int cont=0;
		for (int i = 0;i<N;i++) {
			System.out.print("Digite um numero: ");
			vet[i]=sc.nextDouble();
			soma = soma + vet[i];
			cont++;
		}
		double media = (double) soma/cont;
		 System.out.println();
		 System.out.println("NUMEROS DIGITADOS:");
		for (int i = 0;i<N;i++) {
			System.out.print(String.format("%.1f", vet[i])+" ");
			
		} System.out.println();
		System.out.println("Soma: "+ String.format("%.2f", soma));
		System.out.println("media: "+ String.format("%.2f", media));

		
		sc.close();

	}

}