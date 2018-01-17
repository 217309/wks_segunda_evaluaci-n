import java.util.*;



public class CuentaCorriente {

	//propiedades
	
	String numCuenta; // Numero de la cuenta corriente
	double saldo; // saldo actual 
	String cliente;

	
	
		// Constructor por defecto, los datos se suministran como parametro (El usuario no puede introducir datos);
		
		public CuentaCorriente (	String cuenta,double cantidad,String cliente){
			
		this.numCuenta=cuenta;
		this.cliente=cliente;
		this.saldo=cantidad;
		
		}
	
		// public para que el metodo pueda ser llamado desde otras clases.
		
		public void ingresaEfectivo (double ingreso){

		saldo=ingreso+saldo;
	
		}
	
	
		public boolean retiraEfectivo (double cantidad){
			boolean b=false;
			
			if (cantidad<saldo){
				
				saldo=saldo-cantidad;
				b=true;
			}

			return b;

		
		}// retiraEfectivo 

		public void visualiza(){
			
			
			System.out.println("Numero de cuenta:"+ "\t" + this.numCuenta );
			System.out.println("saldo"+ "\t" + this.saldo);
			
		
		}
		
		
	
	

		
	
	
	










}// class
