package listaD;

import java.util.Scanner;

/*Desenvolva  um  programa  para  realizar  a
*leitura  de  um  n�mero  entre  0  e  10.  O programa dever� apresentar a descri��o deste n�mero. 
*Exemplo: 9 �nove.
 */

public class D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		int num;
		
		System.out.println("Escolha um n�mero de 0 a 10. "); //ESCREVA
		num= meuScanner.nextInt(); //LEIA
		 
		if(num==0){
			
			System.out.println("Voc� escolheu o n�mero 0 - zero."); //ESCREVA			
			
		}if(num==1) {
			
			System.out.println("Voc� escolheu o n�mero 1 - um."); //ESCREVA	
			
			
		}if(num==2) {
			
			System.out.println("Voc� escolheu o n�mero 2 - dois."); //ESCREVA	
			
			
		}if(num==3) {
			
			System.out.println("Voc� escolheu o n�mero 3 - tr�s."); //ESCREVA	
			
			
		}if(num==4) {
			
			System.out.println("Voc� escolheu o n�mero 4 - quatro."); //ESCREVA	
			
			
		}if(num==5) {
			
			System.out.println("Voc� escolheu o n�mero 5 - cinco."); //ESCREVA	
			
			
		}if(num==6) {
			
			System.out.println("Voc� escolheu o n�mero 6 - seis."); //ESCREVA	
			
			
		}if(num==7) {
			
			System.out.println("Voc� escolheu o n�mero 7 - sete."); //ESCREVA	
			
			
		}if(num==8) {
			
			System.out.println("Voc� escolheu o n�mero 8 - oito."); //ESCREVA	
			
			
		}if(num==9) {
			
			System.out.println("Voc� escolheu o n�mero 9 - nove."); //ESCREVA	
			
			
		}if(num==10){
			
			System.out.println("Voc� escolheu o n�mero 10 - dez."); //ESCREVA	
			
		}if (num>10){
			
			System.out.println("N�mero inv�lido."); //ESCREVA	
		}
		
		
		
		
		
		
	}

}
