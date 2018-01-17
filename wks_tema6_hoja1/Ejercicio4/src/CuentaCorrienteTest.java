import java.util.Scanner;


public class CuentaCorrienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		CuentaCorriente cuenta1;
		cuenta1 = new CuentaCorriente("001", 0, "Diego Sancho");
		
		CuentaCorriente cuenta2;
		cuenta2 = new CuentaCorriente("002", 0, "Guillermo Sancho");
		
		int ingreso = 0;
		int retirada;
		int op=0;
		// La primera vez que pasamos por este menu el op nos redirige al metodo  public static int menu(String mensaje);
			op = menu("Elige que desea hacer: :\n 1. Ingresar en la cuenta 001 :\n 2. Ingresar en la cuenta 002 :\n 3.Retirar en la cuenta 001: \n 4.Retirar en la cuenta 002: \n 5.Visualizar ambas cuentas 0. Salir");
	
			while(op!=0){
			    switch (op){
			    case 1:
				System.out.println("¿Cuanto quiere ingresar?");
				ingreso=teclado.nextInt();
				cuenta1.ingresaEfectivo(ingreso);
				break;
			    
			    case 2:
			    	System.out.println("¿Cuanto quiere ingresar?");
				ingreso=teclado.nextInt();
				cuenta2.ingresaEfectivo(ingreso);
				break;
			 
			    case 3:
			    	System.out.println("¿Cuanto quieres quitar?");
				retirada=teclado.nextInt();
				cuenta1.retiraEfectivo(retirada);
				break;
			    	
			    case 4:
			    	System.out.println("¿Cuanto quieres quitar?");
				retirada=teclado.nextInt();
				cuenta2.retiraEfectivo(retirada);
				break;
			    
			    case 5:
			    	System.out.println("Visualizar ambas cuentas");
			    cuenta1.visualiza();
			    cuenta2.visualiza();
				break;
			    default:
				System.out.println("opcion no valida"); 
			    }
	
			    op = menu("Elige que desea hacer: :\n 1. Ingresar en la cuenta 001 :\n 2. Ingresar en la cuenta 002 :\n 3.Retirar en la cuenta 001: \n 4.Retirar en la cuenta 002: \n 5.Visualizar ambas cuentas 0. Salir");
			    
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
	    
	 
	
	    
	 		
		
}// class