package listaD;

import java.util.Scanner;

/*Desenvolva  um  programa  para  realizar  a
*leitura  de  um  número  entre  0  e  10.  O programa deverá apresentar a descrição deste número. 
*Exemplo: 9 –nove.
 */

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		int num;
		
		System.out.println("Escolha um número de 0 a 10. "); //ESCREVA
		num= meuScanner.nextInt(); //LEIA
		 
		if(num==0){
			
			System.out.println("Você escolheu o número 0 - zero."); //ESCREVA			
			
		}if(num==1) {
			
			System.out.println("Você escolheu o número 1 - um."); //ESCREVA	
			
			
		}if(num==2) {
			
			System.out.println("Você escolheu o número 2 - dois."); //ESCREVA	
			
			
		}if(num==3) {
			
			System.out.println("Você escolheu o número 3 - três."); //ESCREVA	
			
			
		}if(num==4) {
			
			System.out.println("Você escolheu o número 4 - quatro."); //ESCREVA	
			
			
		}if(num==5) {
			
			System.out.println("Você escolheu o número 5 - cinco."); //ESCREVA	
			
			
		}if(num==6) {
			
			System.out.println("Você escolheu o número 6 - seis."); //ESCREVA	
			
			
		}if(num==7) {
			
			System.out.println("Você escolheu o número 7 - sete."); //ESCREVA	
			
			
		}if(num==8) {
			
			System.out.println("Você escolheu o número 8 - oito."); //ESCREVA	
			
			
		}if(num==9) {
			
			System.out.println("Você escolheu o número 9 - nove."); //ESCREVA	
			
			
		}if(num==10){
			
			System.out.println("Você escolheu o número 10 - dez."); //ESCREVA	
			
		}if (num>10){
			
			System.out.println("Número inválido."); //ESCREVA	
		}
		
		
		
		
		
		
	}

}
