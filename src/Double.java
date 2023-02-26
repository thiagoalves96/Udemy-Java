import java.util.Locale; //Biblioteca

public class Double {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //Para imprimir com .
		double x;
		
		x = 1.3456;
		
		System.out.println(String.format("%.2f", x));

	}

}
