package listaD;

import java.util.Scanner;

/*DESENVOLVA UM PROGRAMA PARA AUXILIAR UMA EMPRESA NA CLASSIFICA��O DOS FUNCION�RIOS NOS DEPARTAMENTOS DA EMPRESA. 
*O PROGRAMA DEVERA SOLICITAR A CADA FUNCION�RIO O C�DIGO DO DEPARTAMENTO 
*EM  QUE  ELE  DEVER�  TRABALHAR  E  APRESENTAR  AO  FUNCION�RIO  A  DESCRI��O  DO DEPARTAMENTO CORRESPONDENTE AO C�DIGO INDICADO. 
*/

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int cod;
						
		System.out.println("Insira o c�digo do departamento em que voc� trabalha: "); //ESCREVA
		 cod = meuScanner.nextInt(); //LEIA
		 
		 if(cod==1){
			 
			 System.out.println("O departamento correspondente ao c�digo 1 � Expedi��o."); //ESCREVA
		 }if(cod==2) {
			 
			 System.out.println("O departamento correspondente ao c�digo 2 � Recursos Humanos. "); //ESCREVA		 
		 }if(cod==3) {
			 
			 System.out.println("O departamento correspondente ao c�digo 3 � Log�stica. "); //ESCREVA
		 }if(cod==4) {
			 
			 System.out.println("O departamento correspondente ao c�digo 4 � Contabilidade "); //ESCREVA
		 }if(cod>4){
			 
			 System.out.println("N�o existe departamento para o c�digo inserido."); //ESCREVA
		 }
		
	}

}
