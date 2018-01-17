
public class Ejer3Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		long factorial;
		
		N = Estaticos.pideNumeroPositivo("Introduce numero del cual quieras obtener su factorial");
				
		factorial = Estaticos.factorial(N);
	
		System.out.println("El factorial de"+N+"es"+factorial);
	
	}// main 
}// class
