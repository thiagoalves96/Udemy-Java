import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Primeiro valor: ");
		int x = sc.nextInt();
		System.out.print("Segundo valor: ");
		int a = sc.nextInt();
		System.out.print("Terceiro valor: ");
		int b = sc.nextInt();
		 
		if (a<b && a<x) {
			System.out.print("Menor: "+x);
		}else if (b<x) {
			System.out.print("Menor: "+b);
		}else if (x<b) {
			System.out.print("Menor: "+x);
		} else {}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
