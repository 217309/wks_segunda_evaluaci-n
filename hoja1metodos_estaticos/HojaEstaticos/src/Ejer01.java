/*Hacer un programa que lea un n�mero N y nos escriba en la pantalla mediante un mensaje si es
� no primo (NOTA: N�mero primo es aqu�l que es divisible solo por s� mismo y por, la unidad)
Desarrollar este programa creando un m�todo llamado esPrimo que devuelva true si el n�mero
es primo y false si no lo es.*/


public class Ejer01 {

	public static void main(String[] args) {

		int num;
		//pido el numero por teclado. quiero que sea mayor que cero
		num = Estaticos.pideNumeroPositivo("Numero mayor que cero?");
		if(Estaticos.esPrimo(num)){
			System.out.println("Es primo");
		}else{
			System.out.println("No es primo");
		}

	}//main

	
	
}
