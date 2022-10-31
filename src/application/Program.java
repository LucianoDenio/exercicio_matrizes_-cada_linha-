package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		while(n>10) {
			System.out.print("Por favor digite um número menor que 10 :");
			n =sc.nextInt();
		}
		
		
		int [][] mat = new int [n][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				System.out.print("Elemento ["+(i)+","+(j)+"]:");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("MAIOR ELEMENTO DE CADA LINHA : ");
		
		
		
		for (int i=0;i<mat.length;i++) {
			int bigger = 0;
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j] > bigger) {
					bigger = mat[i][j];
				}
			}
			System.out.println(bigger);
		}
		
		
		
		
		
		
		sc.close();
	}

}
