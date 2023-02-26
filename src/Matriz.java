import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int l,c,i,j;
		
		System.out.print("Quantas linhas vai ter a matriz? ");
		l = sc.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		c = sc.nextInt();
		
		int[][] mat = new int [l][c];
		
		for(i=0;i<l;i++) {
		 for(j=0;j<c;j++) {
			 System.out.print("Elemento ["+i+","+j+"]: ");
			 mat[i][j]=sc.nextInt();
			 
		 }
		}
		
	     for(i=0;i<l;i++) {
		 for(j=0;j<c;j++) {
	        System.out.print(mat[i][j]+" ");
						 
					 }System.out.println();
					}
			
		
		
		
		
   sc.close();
	}

}
