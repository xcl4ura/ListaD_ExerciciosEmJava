package listaD;

import java.util.Scanner;

/* Desenvolva  um  programa  para  calcular  o  reajuste  salarial  dos  funcionários  de  um empresa de desenvolvimento de softwares.
 *  O programa deverá solicitar a leitura do código e o salário atual do funcionário e realizar o reajuste salarial de acordo com a tabela abaixo. 
 * O  programa  deverá  apresentar  o  salário  antigo,  o  novo  salário,  o  valor  do  reajuste  e  a função do funcionário.
 */

public class D9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		
		int salAt,cod,reaj,salFi;
		
		System.out.println("Insira o salário atual do funcionário: ");
		salAt = meuScanner.nextInt();
		
		System.out.println("Insira o código do departamento: ");
		cod = meuScanner.nextInt();
			
		
		
		if(cod==1){
			
			reaj= (salAt/100)*5;
			
			salFi=reaj+salAt;
			
			System.out.println("O operador com o salário de "+salAt+" recebe o reajuste de 5%, que fica: "+salFi);
			
		}
		if(cod==2){
			
			reaj= (salAt/100)*10;
			
			salFi=reaj+salAt;
			
			System.out.println("O programador com o salário de "+salAt+" recebe o reajuste de 10%, que fica: "+salFi);
			
		}
		if(cod==3){
			
			reaj= (salAt/100)*15;
			
			salFi=reaj+salAt;
			
			System.out.println("O analista com o salário de "+salAt+" recebe o reajuste de 15%, que fica: "+salFi);
			
		}if(cod>3) {
			
			
			
			System.out.println("Código inválido!!");
		}
	}

}
