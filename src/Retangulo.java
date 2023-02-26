import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		 
		Scanner sc = new Scanner(System.in);
		
		double b,al,a,p,d;
		
        System.out.print("Base do retangulo: ");
        b= sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        al= sc.nextDouble();
        
        a= b*al;
        p= 2*(al+b);
        d= Math.sqrt(Math.pow(b, 2)+Math.pow(al, 2));
        
        
        
        System.out.println("Area " + String.format("%.4f", a));
        System.out.println("Perimetro " + String.format("%.4f", p));
        System.out.println("Diagonal " + String.format("%.4f", d));
        
        sc.close();

	}

}
