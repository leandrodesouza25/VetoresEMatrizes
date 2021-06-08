package ExerciciosVetoresEMatrizes;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 
		int[] vet = new int[6];
		int somapares = 0, somaimpares = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		
		
		for(int i = 0 ; i <5 ; i++) {
			System.out.println("Entre com o valor: ");
			vet[i] = ler.nextInt();
			
			
			
		
		if(vet[i] % 2 == 0) {
			
		
			
			System.out.println("Par : " + vet[i]);
			somapares +=   vet[i];
			
			
		}
		else somaimpares++;
		
	}
		System.out.println("Pares: ");
		
		for(int i = 0 ; i<=5; i++) {
			
			if(vet[i] %2==0);
			System.out.printf("\n %d" , vet[i]);
			
		}
		System.out.println("\nNumeros impares:  " );

	     for(int i=0; i<5 ; i++) {
	    	 if(vet[i]%2 !=0) {
	    	System.out.printf("| %d | " , vet[i]);	 
	    	 }
	    	 
	    	 System.out.printf("\nA soma dos pares é: " , somapares);
	    	 System.out.printf("\n A soma dos impares é: " , somaimpares);
	    	 }
	    	 ler.close();
	    	 
	     }
}
