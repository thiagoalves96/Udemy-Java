import java.util.Locale;

public class Entrada_dedados {
	
    public static void main(String[] args) {
    	
    	Locale.setDefault(Locale.US);
    	
    	int idade;
    	double salario, altura;
    	char genero;
    	String nome;
    	
    	idade= 30;
    	salario= 5800.5;
    	altura= 1.72;
    	genero= 'f';
    	nome= "Maria Silva";
    			
    	
    	
        System.out.println("IDADE = "+ idade);
        System.out.println("Salario = "+ String.format("%.2f", salario));
        System.out.println("Altura = "+ String.format("%.2f", altura));
        System.out.println("Genero = "+ genero);
        System.out.println("Nome= "+nome);
    }
}
