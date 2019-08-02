package aula0108;

import java.util.Random;

public class Desafio01 {
	
public static void main(String[] args) {
		
		int[][] matriz = new int [5][5];
		
		Random numerosr = new Random();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				matriz[i][j] = numerosr.nextInt(25);
			}
		} 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				System.out.println(matriz[i][j]+ " ");

			}
			
			System.out.println("\n");
			
		}
	}

}
