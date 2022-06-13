package listaD;

import java.util.Scanner;

/*DESENVOLVA UM PROGRAMA PARA LER DOIS VALORES NUMÉRICOS E APRESENTAR A DIFERENÇA DO MAIOR PELO MENOR. */

public class D4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int val1, val2,dif;

		System.out.println("Insira o valor 1: "); //ESCREVA
		 val1 = meuScanner.nextInt(); //LEIA
		
		 System.out.println("Insira o valor 2: "); //ESCREVA
		 val2 = meuScanner.nextInt(); //LEIA
		 
		 if(val1>val2){
			 
			dif= val1 - val2;
			 
			 System.out.println("A difença dos valores é de "+dif); //ESCREVA
			 
		 }if(val2>val1){
			 
			 dif= val2 - val1;
			 
			 System.out.println("A difença dos valores é de "+dif); //ESCREVA

			 
		 }
		 
	}

}

