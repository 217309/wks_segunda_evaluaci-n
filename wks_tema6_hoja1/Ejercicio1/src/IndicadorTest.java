import java.util.*;

public class IndicadorTest {

	public static void main(String[] args){
		
		// Creamos un objeto "deposito" dentro de la clase Animal. 
		// PREGUNTAR!!
		
		Scanner teclado = new Scanner(System.in); 
		Indicador indicador; // DECLARAMOS LA VARIABLE DEPOSITO (VARIABLE QUE GUARDARÁ LA DIRECCIÓN DE UN OBJETO LLAMADO INDICADOR)
							// Es como declarar un string. 
		indicador = new Indicador();
		int opcion=0;
		int op=0;
		int cantidad;
		
		// La primera vez que pasamos por este menu el op nos redirige  al metodo  public static int menu(String mensaje);
				
		opcion = menu("Elige que desea hacer: :\n 1. Añadir liquido :\n 2. Extraer liquido :\n 0. Salir");
			
		
		while(op!=0){
			
			switch (op){
			case 1:
				System.out.println("¿Cuanto quieres añadir?");
				cantidad = teclado.nextInt();

				// Estas comprobando que no se pasa del máximo del depósito (Se evalua en el metodo void echar_gasolina)
				// Preguntar como funciona 
				
				System.out.println("La cantidad que se ha añdido es:" deposito.echar_gasolina(cantidad));
				
			case 2:
				System.out.println("¿Cuanto quieres añadir?");
				cantidad = teclado.nextInt();
				
			case 3:
				System.out.println("¿Cuanto quieres añadir?");
				cantidad = teclado.nextInt();
				
				
			
			}// fin switch 
				
		}// fin while 
		
		
}// class
	
	// La primera vez que entramos al menu op, nos redirige aqui. 
	
	// Preguntar como se llega hasta aquí desde opcion=menu.....
	
	public static int menu(String mensaje){
		int opcion;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println(mensaje);
		opcion = teclado.nextInt();
		
		return opcion;
	}
	
	
	
	}// main 
