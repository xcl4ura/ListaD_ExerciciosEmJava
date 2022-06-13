package listaD;

import java.util.Scanner;

/*DESENVOLVA UM PROGRAMA PARA AUXILIAR UMA EMPRESA NA CLASSIFICAÇÃO DOS FUNCIONÁRIOS NOS DEPARTAMENTOS DA EMPRESA. 
*O PROGRAMA DEVERA SOLICITAR A CADA FUNCIONÁRIO O CÓDIGO DO DEPARTAMENTO 
*EM  QUE  ELE  DEVERÁ  TRABALHAR  E  APRESENTAR  AO  FUNCIONÁRIO  A  DESCRIÇÃO  DO DEPARTAMENTO CORRESPONDENTE AO CÓDIGO INDICADO. 
*/

public class D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int cod;
						
		System.out.println("Insira o código do departamento em que você trabalha: "); //ESCREVA
		 cod = meuScanner.nextInt(); //LEIA
		 
		 if(cod==1){
			 
			 System.out.println("O departamento correspondente ao código 1 é Expedição."); //ESCREVA
		 }if(cod==2) {
			 
			 System.out.println("O departamento correspondente ao código 2 é Recursos Humanos. "); //ESCREVA		 
		 }if(cod==3) {
			 
			 System.out.println("O departamento correspondente ao código 3 é Logística. "); //ESCREVA
		 }if(cod==4) {
			 
			 System.out.println("O departamento correspondente ao código 4 é Contabilidade "); //ESCREVA
		 }if(cod>4){
			 
			 System.out.println("Não existe departamento para o código inserido."); //ESCREVA
		 }
		
	}

}
