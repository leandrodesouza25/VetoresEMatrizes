package ExerciciosVetoresEMatrizes;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		

		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2];
		int usuario = 0;
		double constante;
		
		
		System.out.println("Digite a primeira matriz: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m1[l][c] = ler.nextDouble();
			}
		}
		System.out.println("\nDigite a segunda matriz  ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m2[l][c] = ler.nextDouble();
			}
		}
		
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			
			System.out.println("\nMatriz soma:  ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println( mR[l][c]);
				}
				System.out.println();
			}
		}
		
		else if (usuario == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}

			System.out.println("\nResultado da subtração: ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.println( mR[l][c]);
				}
				System.out.println();
			}
		}
		else if (usuario == 3) {
			System.out.println("Digite a constante: ");
			constante = ler.nextDouble();
			for(int l=0; l < 2; l++) {
				
				
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}
			
			System.out.println("\nResultados ");
			System.out.println("M1:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nM2:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
			}
		} 
		
	
     if (usuario == 4) {
	System.out.println("M1:");
	for(int l=0; l < 2; l++) {
		for (int c = 0; c < 2; c++) {
			Object[][] m11 = null;
			System.out.printf("\t %.2f \t", m11[l][c]);
		}
		System.out.println();
	}
	System.out.println("\nM2:");
	for(int l=0; l < 2; l++) {
		for (int c = 0; c < 2; c++) {
			Object[][] m21 = null;
			System.out.printf("\t %.2f \t", m21[l][c]);
		}
		System.out.println();
	}
}

else {
	System.out.println("inválido");
}

ler.close();
}

}




