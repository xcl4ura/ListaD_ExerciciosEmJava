package listaD;

//DESENVOLVA UM PROGRAMA PARA EFETUAR A LEITURA DE TRÊS VALORES (A, B E C) E APRESENTAR OS VALORES DISPOSTOS EM ORDEM CRESCENTE.
import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner meuScanner = new Scanner(System.in);
		int a,b,c;

		System.out.println("Insira o 1º valor: "); //ESCREVA
		 a= meuScanner.nextInt(); //LEIA
		 
		 System.out.println("Insira o 2º valor: "); //ESCREVA
		 b = meuScanner.nextInt(); //LEIA
		 
		 System.out.println("Insira o 3º valor: "); //ESCREVA
		 c = meuScanner.nextInt(); //LEIA
		 
		if(a>b && a>c && b<c){
			
			System.out.println(a+", "+c+", "+b); //ESCREVA
			
		}if(b>a && b>c && c<a) {
			
			System.out.println(b+", "+a+", "+c); //ESCREVA
			
		}if(c>a && c>b && a<b) {
			
			System.out.println(c+", "+b+", "+a); //ESCREVA
		}if(a>b && a>c && b>c){
			
			System.out.println(a+", "+b+", "+c); //ESCREVA
			
		}if(b>a && b>c && c>a) {
			
			System.out.println(b+", "+c+", "+a); //ESCREVA
			
		}if(c>a && c>b && a>b) {
			
			System.out.println(c+", "+a+", "+b); //ESCREVA
		}
		 
		 
	}

}
