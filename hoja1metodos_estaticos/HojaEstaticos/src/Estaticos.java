import java.util.Scanner;

public class Estaticos {

	public static int pideNumeroPositivo(String mensaje){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n;
		do{
			System.out.println("\n" + mensaje);
			n = teclado.nextInt();
		}while(n <= 0);
		return n;
	}//pideNumPositivo
	

	public static boolean esPrimo(int num){
		/*int contaDivisores, divisor;
		contaDivisores = 0;
		for(divisor = 2; divisor <= num-1 && contaDivisores == 0; divisor++){// contamos divisores de nun
			if(num % divisor == 0){
				contaDivisores++;
			}
		}*/
		
		if(cuentaDivisores(num) <= 2){//el numero es primo // ponemos <= porque el 1 es primo y solo tiene un divisor. 
			return true;
		}else{
			return false;
		}
	}//esPrimo
	
	public static int cuentaDivisores(int num){
		int contaDivisores, divisor;
		contaDivisores = 0;
		for(divisor = 1; divisor <= num; divisor++){// contamos divisores de nun
			if(num % divisor == 0){
				contaDivisores++;
			}
		}
		return contaDivisores;
	}//cuentaDivisores

	
	// es metodo public porque así lo pueden utilizar otras clases
	/*static porque así es compartido por todos los objetos de la clase
	y si modificamos ese metodo su valor se modifica para todos*/
	// long porque queremos que nos devuelva un long. 
	
	
	// preguntar funcionamiento 
	public static long factorial(int num){
			  if (num==0)// cuando el numero numero sea  0 
			    return 1;
			  else
			    return num * factorial(num-1);
			}


}// class Estaticos
