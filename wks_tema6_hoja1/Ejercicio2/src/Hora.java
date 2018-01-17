
	import java.util.Scanner;

	public class Hora{       
			int H; //Hora
	        int M; //Minuto
	        int S; //segundo
	  
	    public Hora()
	    { this.H=0;  
	        this.M=0;
	        this.S=0;
	    }

	   public Hora(int hora,int minuto,int segundo){
	    this.H=hora;
	    this.M=minuto;
	    this.S=segundo;}
	    // Getter
	    public int gethora(){
	       return this.H;}
	   public int getminuto(){
	        return this.M;}
	     public int getsegundo(){
	       return this.S;}
	       
	   //Setter
	   
	   public void sethora(int hora){
	       this.H=hora;}
	       
	    public void setminuto(int minuto){
	       this.M=minuto;}
	   
	   public void setsegundo(int segundo){
	       this.S=segundo;}
	       
	  public void suma(Hora T){
	      
	      int mellevo=0;// Las llevadas de la suma
	      
	      if(T.S+this.S>=60){
	           mellevo=1;
	        this.setsegundo(T.S+this.S-60);}
	        else{ this.setsegundo(T.S+this.S);}
	      if(T.M+this.M+mellevo>=60){
	          this.setminuto(T.M+this.M+mellevo-60);
	          mellevo=1;
	         }
	         else{this.setminuto(T.M+this.M+mellevo);
	            mellevo=0;}
	         
	      this.sethora(T.H+this.H+mellevo);   
	      
	      
	    } 
	    public int convertirasegundos(){
	      
	           int n=this.H*3600+this.M*60+this.S;
	          return n;}
	          
	    public void conversioninversa(int n){
	        this.S=n%60;
	        int k=(n-this.S)/60;
	        this.M=k%60;
	        this.H=(k-this.M)/60;
	     
	        }
	        
	    public boolean esmayor(Hora T){
	        int nt=T.convertirasegundos();
	        int nd=this.convertirasegundos();
	       boolean b=false;
	    if(nt>nd){b=true;}
	    
	    return b;
	    
	} 

	   public void resta(Hora T){
	       int diferencia=0;
	       boolean b=this.esmayor(T);
	         if(b==true){
	             diferencia=T.convertirasegundos()-this.convertirasegundos();
	             
	             
	              }
	          else{
	            
	             diferencia=this.convertirasegundos()-T.convertirasegundos();} 
	             
	         this.conversioninversa(diferencia);    
	             
	             
	            } 
	            
	            
	    public void imprimir(){
	        System.out.println(this.H+" : "+this.M+" : "+this.S);}
	        
	    public void leerhora(){
	        Scanner teclado=new Scanner(System.in);
	        System.out.println("Introduzca la hora");
	        this.H=teclado.nextInt();
	        int contador=1;
	        int s=3-contador;
	        while((contador<=3)&&((this.H<0)||(this.H>23))){
	         System.out.println("Hora incorrecta. Solo le quedan "+s+" intentos.Vuelva a intentarlo");
	         this.H=teclado.nextInt();
	         contador++;
	         s=3-contador;
	        }
	        if(contador==4){System.out.println("Bye");}
	        else{
	            
	        System.out.println("Introduzca el minuto");
	        this.H=teclado.nextInt();
	         contador=1;
	        while((contador<=3)&&((this.M<0)||(this.M>59))){
	         System.out.println("Minuto incorrecto. Solo le quedan "+s+" intentos.Vuelva a intentarlo");
	         this.H=teclado.nextInt();
	         contador++;
	         s=3-contador;
	        }
	        if(contador==4){System.out.println("Bye");}
	        
	         else{
	            
	        System.out.println("Introduzca el segundo");
	        this.H=teclado.nextInt();
	         contador=1;
	        while((contador<=3)&&((this.S<0)||(this.S>59))){
	         System.out.println("Segundo incorrecto. Solo le quedan "+s+" intentos.Vuelva a intentarlo");
	         this.H=teclado.nextInt();
	         contador++;
	         s=3-contador;
	        }
	        if(contador==4){System.out.println("Bye");}
	        
	        }
	     
	        
	        
	        
	        
	    }        
	      
	}
	}
