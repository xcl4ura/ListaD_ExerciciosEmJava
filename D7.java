package listaD;

import java.util.Scanner;

/*Desenvolva um programa para ler um número e verificar se o mesmo é menor que 5, maior que 10 ou entre 5 e 10.*/

public class D7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		
		int val;
		
		
		System.out.println("Insira um valor: \n");
		val = meuScanner.nextInt();
		
		if(val<5){
			
			System.out.println("O número é menor que 5!");
			
			
		}if(val>10) {
			
			
			System.out.println("O número é maior que 10!");
			
			
		}if(val>5 && val<10) {
			
			System.out.println("o número está entre 5 e 10");
			
			
		}
	}

}
