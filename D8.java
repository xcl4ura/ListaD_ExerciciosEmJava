package listaD;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  dois  números  e  realizar  a  divisão  do  maior  pelo menor, apresentando o resultado. */


public class D8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int val1,val2,div;
		
		System.out.println("Insira o primeiro valor: ");
		val1 = meuScanner.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		val2 = meuScanner.nextInt();
		
		
		if(val1>val2) {
			
			
			div = val1/val2;
			
			System.out.println(val1+" dividido por "+ val2 + " é igual a "+div);
			
			
		}if(val2>val1) {
			
			div = val2/val1;
			
			System.out.println(val2+" dividido por "+ val1 + " é igual a "+div);
			
		}
		
	}

}
