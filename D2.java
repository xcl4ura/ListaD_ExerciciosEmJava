package listaD;

import java.util.Scanner;

/*DESENVOLVA  UM  PROGRAMA  QUE  LEIA  UM  N�MERO  E  INFORME  SE  ESTE  N�MERO  �  MAIOR, MENOR OU IGUAL A 100.*/


public class D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int val1;

		System.out.println("Insira o valor"); //ESCREVA
		 val1= meuScanner.nextInt(); //LEIA
		 
		 if(val1>100){
			 
			 System.out.println("O valor " + val1 + " � maior que 100!"); //ESCREVA			 		 
			 
		 }if(val1==100){
			 
			 System.out.println("O valor " + val1 + " � igual a 100!"); //ESCREVA
			 
		 }if(val1<100){
			 
			 System.out.println("O valor " + val1 + " � menor que 100!"); //ESCREVA
			 
		 }
		
	}

}
