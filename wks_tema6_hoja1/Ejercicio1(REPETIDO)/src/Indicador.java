import java.util.Scanner;
public class Indicador {

	// Los atributos se van a declarar privados por lo general. 
	private double valorMaximo;
	private final double valorMinimo;
	private double valorActual;
	private String unidades;
	private String nombre;

	
	// El constructor y la clase tienen que llamarse igual
	// Asignamos todos los elementos menos el valorActual, es decir no lo pasamos como parametro.
	
	// Creando 2 constructores de esta manera, el constructor estaría sobrecargado. 
	// Por defecto el valorMaximo y el valorMinimo si no pasamos un valor nosotros, valdran 100 y 0 respectivamente. 
	Indicador(String uni,String nom){
		valorMaximo=100;
		valorMinimo=0;
		this.unidades=uni;
		this.nombre=nom;
		
	}
	
	Indicador(String uni,String nom, double max, double min){
		this.valorMaximo=max;
		this.valorMinimo=min;
		this.unidades=uni;
		this.nombre=nom;
		
	}

	
// Tenemos que fijar en el set los valores maximos y minimos para que el usuario no los pueda manipular
	
	// Asignación del ValorActual
	
	
	
	public void setNombre(String nom){
	    this.nombre=nom;
	   }
	
	public String getNombre(){
		return this.nombre;
	   }
	
	public String getUnidades(){
		return this.unidades;
	   }
	
	
	public void setValorActual(double VA) {
	    this.valorActual=VA;

	}

	public double getMaximo() {
		return this.valorMaximo;
	}

	public double getMinimo() {
		return this.valorMinimo;
	}
	public double getValorActual(){
	     return this.valorActual;
	     }

	// metodo mostrar 
	
	   

	public void mostrarValorActual() {
		  System.out.println("El valor actual es : "+ this.getValorActual());
		
	}  
	       

	  
	       
	
	// metodo incrementarValorActual 
	
	public void incrementar(double cantidadSumada){
				
			if(valorActual+cantidadSumada>valorMaximo){
				    valorActual=valorMaximo;
				}
				    
				else{
					    valorActual = valorActual +cantidadSumada;
					}
				
		}//VOID 

		
	       
	// metodo reducir ValorActual    
	


	public void disminuir(double cantidadRetirada){
		
		if(valorActual-cantidadRetirada<valorMinimo){
			    valorActual=valorMinimo;
			}
			    
			else{
				    valorActual = valorActual - cantidadRetirada;
				}
			
	}//VOID 
	



	}// class
	

	
	
	 


