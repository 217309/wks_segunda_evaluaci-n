import java.util.*;


public class IndicadorTestAgustin {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		IndicadorAgustin deposito;
		int op=0;
		int datos; //Una variable de tipo int para que envie los datos al constructor
		deposito = new IndicadorAgustin();
		//String cadenaDeIncrementar;

		System.out.println("Indica el tamaño maximo del deposito: ");
		datos = teclado.nextInt();
		deposito.setCapacidadmax(datos);
		
		// La primera vez que pasamos por este menu el op nos redirige al metodo  public static int menu(String mensaje);
		op = menu("Elige que desea hacer: :\n 1. Añadir liquido :\n 2. Extraer liquido :\n 0. Salir");

		while(op!=0){
		    switch (op){
		    case 1:
			System.out.println("¿Cuanto quieres añadir?");
			datos = teclado.nextInt();
			System.out.println("La cantidad que se ha añdido es: " + deposito.incrementarUnValor(datos));
			break;
		    case 2:
			System.out.println("¿Cuanto quieres quitar?");
			datos = teclado.nextInt();
			System.out.println("La cantidad que se ha extraido es: " + deposito.reduceUnValor(datos));
			break;
		    default:
			System.out.println("opcion no valida"); 
		    }
		    System.out.println("Lo maximo que puede almacenar: "+deposito.getCapacidadmax());
		    System.out.println("La cantidad que contiene: "+deposito.getValorActual());
		    System.out.println("El porcentaje de ocupación es: "+deposito.getResultado()+"% \n");

		    op = menu("Elige que desea hacer: :\n 1. Añadir liquido :\n 2. Extraer liquido :\n 0. Salir");
		    
		}//while
		System.out.println("Se ha finalizado el programa.");

	    }//main
		
	// La primera vez que entramos al menu op, nos redirige aqui. 
	    public static int menu(String mensaje){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int op;
		System.out.println(mensaje);
		op = teclado.nextInt(); 
		return op;
	    }// La primera vez el return op nos devuelve al lugar de donde ha partido, es decir op = menu("Elige que desea hacer: :\
	    // Y se ejecutara el while 
	    
	    // La segunda vez y siguientes...El return op nos devuelve hasta el metodo que lo ha llamado>>>switch (op)
	    
	   


	    public static int pedirEntero(String mensaje){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.println(mensaje);
		n = teclado.nextInt();
		return n;
	    }//pedirEntero
	}//class
