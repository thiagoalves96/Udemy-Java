import java.util.Scanner;

public class Idades {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome ");
		sc.nextLine();
		String nome2 = sc.nextLine();
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double media = (double) (idade+idade2)/2;
		
		System.out.println();
		System.out.print("A idade media de "+nome+" e "+nome2+
				" é de "+ String.format("%.1f", media)+" anos.");
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
