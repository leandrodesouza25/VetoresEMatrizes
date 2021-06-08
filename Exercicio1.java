package ExerciciosVetoresEMatrizes;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double[] A = new double[6];
		
		double soma = 0 , media = 0 ;
		double adicao  = 0;
		double valor = 100;
		 
        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;
        
        
        
        soma += A[0] + A[1] + A[5];
        adicao = valor + A[4];
        
         System.out.println("O resultado da soma é: " + soma);
        
        for(int l = 0 ; l <= A[4] ; l++) {
        	
       valor += A[4]; 
        	
       
        
        }
        System.out.println("a adição de 4 é: " + valor);
	}

}
