package listaD;

import java.util.Scanner;

/* Desenvolva  um  programa  para  calcular  o  reajuste  salarial  dos  funcion�rios  de  um empresa de desenvolvimento de softwares.
 *  O programa dever� solicitar a leitura do c�digo e o sal�rio atual do funcion�rio e realizar o reajuste salarial de acordo com a tabela abaixo. 
 * O  programa  dever�  apresentar  o  sal�rio  antigo,  o  novo  sal�rio,  o  valor  do  reajuste  e  a fun��o do funcion�rio.
 */

public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int salAt,cod,reaj,salFi;
		
		System.out.println("Insira o sal�rio atual do funcion�rio: ");
		salAt = meuScanner.nextInt();
		
		System.out.println("Insira o c�digo do departamento: ");
		cod = meuScanner.nextInt();
			
		
		
		if(cod==1){
			
			reaj= (salAt/100)*5;
			
			salFi=reaj+salAt;
			
			System.out.println("O operador com o sal�rio de "+salAt+" recebe o reajuste de 5%, que fica: "+salFi);
			
		}
		if(cod==2){
			
			reaj= (salAt/100)*10;
			
			salFi=reaj+salAt;
			
			System.out.println("O programador com o sal�rio de "+salAt+" recebe o reajuste de 10%, que fica: "+salFi);
			
		}
		if(cod==3){
			
			reaj= (salAt/100)*15;
			
			salFi=reaj+salAt;
			
			System.out.println("O analista com o sal�rio de "+salAt+" recebe o reajuste de 15%, que fica: "+salFi);
			
		}if(cod>3) {
			
			
			
			System.out.println("C�digo inv�lido!!");
		}
	}

}
