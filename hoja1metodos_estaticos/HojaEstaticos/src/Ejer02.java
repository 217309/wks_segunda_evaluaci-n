/*Dados dos n�meros P y Q que leeremos por teclado y que deben ser positivos, hacer un
programa que nos diga cual de los dos tiene m�s divisores, con un mensaje que diga �P tiene
mas divisores que Q� � viceversa.
Este programa debe llamar a un m�todo que calcule los divisores de un numero, y lo aplique
para P y para Q y luego compare y decida.
*/

public class Ejer02 {

	public static void main(String[] args) {
		int p, q;
		p = Estaticos.pideNumeroPositivo("�Numero positivo, para saber cuantos divisores tiene?");
		q = Estaticos.pideNumeroPositivo("�Numero positivo, para saber cuantos divisores tiene?");
		
		if(Estaticos.cuentaDivisores(p) > Estaticos.cuentaDivisores(q)){
			System.out.println(p + " tiene mas divisores que " + q);
		}else if(Estaticos.cuentaDivisores(q) > Estaticos.cuentaDivisores(p)){
			System.out.println(q + " tiene mas divisores que " + p);
		}else{
			System.out.println("Tienen el mismo numero de divisores: " + Estaticos.cuentaDivisores(p));
		}
	}//main

}
