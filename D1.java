package listaD;

/*Desenvolva um programa que leia dois valores e informe qual dos valores é o maior. Se os números forem iguais, o programa deverá indicar esta igualdade.
 *INFORME QUAL DOS VALORES É O MAIOR. SE OS NÚMEROS FOREM IGUAIS, O PROGRAMA DEVERÁ INDICAR ESTA IGUALDADE.
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
			System.out.println("O valor " + val1 + " é maior que o valor "+val2); //ESCREVA
			
			}if(val1==val2){  
				System.out.println("O valor " + val1 + " é igual ao valor "+val2); //ESCREVA
				
			}if (val1<val2) {
				
				
					System.out.println("O valor " + val2 + " é maior que o valor "+val1); //ESCREVA
				
			}
		
		
	}

}
