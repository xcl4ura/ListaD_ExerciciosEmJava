package listaD;

/*Desenvolva um programa que leia dois valores e informe qual dos valores � o maior. Se os n�meros forem iguais, o programa dever� indicar esta igualdade.
 *INFORME QUAL DOS VALORES � O MAIOR. SE OS N�MEROS FOREM IGUAIS, O PROGRAMA DEVER� INDICAR ESTA IGUALDADE.
 */

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int val1, val2;

		System.out.println("Insira o valor 1: "); //ESCREVA
		val1 = meuScanner.nextInt(); //LEIA
		
		System.out.println("Insira o valor 2: "); //ESCREVA
		val2 = meuScanner.nextInt(); //LEIA
		
		

		if(val1>val2){  
			System.out.println("O valor " + val1 + " � maior que o valor "+val2); //ESCREVA
			
			}if(val1==val2){  
				System.out.println("O valor " + val1 + " � igual ao valor "+val2); //ESCREVA
				
			}if (val1<val2) {
				
				
					System.out.println("O valor " + val2 + " � maior que o valor "+val1); //ESCREVA
				
			}
		
		
	}

}
