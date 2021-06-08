package ExerciciosVetoresEMatrizes;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		double[][] matriz = new double[3][3];
		double valor = 0.0;
		
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0 ; c < matriz [(int) l].length; c++) {
				System.out.printf("Entre com os números: [%d] [%d]" , l , c);
				
				matriz[l][c] = ler.nextDouble();
				
				
				if(matriz[l][c] > 10) {
					valor++;
				}
					
				}
				
				System.out.println("\n Os valores são " + valor + " Acima de 10");
			}
			
		}
				
				
		
		
				
				
	}


