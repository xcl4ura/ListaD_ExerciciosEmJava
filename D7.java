package listaD;

import java.util.Scanner;

/*Desenvolva um programa para ler um n�mero e verificar se o mesmo � menor que 5, maior que 10 ou entre 5 e 10.*/

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		
		int val;
		
		
		System.out.println("Insira um valor: \n");
		val = meuScanner.nextInt();
		
		if(val<5){
			
			System.out.println("O n�mero � menor que 5!");
			
			
		}if(val>10) {
			
			
			System.out.println("O n�mero � maior que 10!");
			
			
		}if(val>5 && val<10) {
			
			System.out.println("o n�mero est� entre 5 e 10");
			
			
		}
	}

}
