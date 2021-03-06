

	import java.util.Scanner;
	public class Indicador {

		// el maximo y el minimo van a ser iguales para todos los bidones de gasolina 
		// Los atributos se van a declarar privados por lo general. 
		private  double maximo;
		private  double minimo;
		private double valorActual;
		private String Un;
		private String Nombre;

		
		// El constructor y la clase tienen que llamarse igual
		Indicador(double max, double min, String unidades,String N){
			this.maximo=max;
			this.minimo=min;
			this.Un=unidades;
			this.Nombre=N;
			
		}

		
	// Tenemos que fijar en el set los valores maximos y minimos para que el usuario no los pueda manipular
		
		// Asignación del ValorActual
		
		public void setNombre(String N){
		    this.Nombre=N;
		   }
		public void setValorActual(double VA) {
		    this.valorActual=VA;

		}

		public double getMaximo() {
			return this.maximo;
		}

		public double getMinimo() {
			return this.minimo;
		}
		public double getactual(){
		     return this.valorActual;}

		// ¿Se podría incluir este if dentro del SetValorActual y hacer la clase main hacer referencia al Set? 
		
		public void mostrarVA(){
		     System.out.println("El valor actual es : "+ this.getactual());}
		 
		public void incrementar(double g){
		    if(g+this.getactual()>getMaximo()){
		        this.setValorActual(getMaximo()); 
		          }
		       else{
		           this.setValorActual(g+this.getactual()); 
		          }
		       } 
		       
		   
		public void decrementar(double d){
		    if(this.getactual()-d<getMinimo()){
		        this.setValorActual(getMinimo()); 
		          }
		       else{
		           this.setValorActual(this.getactual()-d); 
		          }
		       }  
		       
		  public static void mostrar(Indicador [] I){
		      System.out.println("=============RESUMEN===================");
		     for(int i=0;i<=4;i++){
		         System.out.println("Nombre : "+I[i].Nombre);
		         System.out.println("Unidades : "+I[i].Un);
		         System.out.println("Ninel maximo : "+I[i].getMaximo());
		         System.out.println("Ninel minimo : "+I[i].getMinimo());
		         I[i].mostrarVA();
		         if(I[i].getactual()==I[i].getMinimo()){
		             System.out.print("Repostar. Nivel Critico");}
		          }}     
		       
		       
		  public static void main (String []args){
		      Scanner teclado=new Scanner(System.in);
		    Indicador I []=new Indicador[5];
		    System.out.println("Introduce los datos de los indicadores");
		    System.out.println("1:Combustible");
		    System.out.println("2:Aceite");
		    System.out.println("3:Temperatura");
		     System.out.println("4:velocidad");
		      System.out.println("5:Revoluciones");
		      String [] S=new String [5]; 
		      S[0]="Combustible";
		      S[1]="Aceite";
		      S[2]="Temperatura";
		      S[3]="Velocidad";
		      S[4]="Revoluciones";
		    
		    for(int i=0;i<=4;i++){
		        System.out.println("Indicador : "+S[i]);
		       
		        
		        System.out.print("Unidades");
		        String u=teclado.next();
		         System.out.print("Nivel maximo");
		        double max=teclado.nextDouble();
		         System.out.print("Nivel minimo");
		        double min=teclado.nextDouble();
		       double va=min;
		       Indicador J=new Indicador(max,min,u,S[i]);
		        J.setValorActual(va);
		        I[i]=J;
		        
		        
		        
		        
		         }
		         
		     mostrar(I);    
		         
		         
		 }     


		}
		

		
		