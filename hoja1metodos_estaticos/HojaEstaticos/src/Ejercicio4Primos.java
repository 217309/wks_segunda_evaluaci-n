
import java.util.Scanner;


public class Ejercicio4Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner teclado = new Scanner(System.in);
		int contadorPrimos;
		int contadorNoPrimos;
		int K;
		
		
		N = Estaticos.pideNumeroPositivo("Introduce numero positivo");
		
		for(K=N;K<=1;K--){
		
		
			if(Estaticos.esPrimo(K)){	
			
				System.out.println(N+ " tiene por debajo estos numeros primos ");
			
			}
			else{
				
				System.out.println(K + "no es primo" );
			}
		}//for 
		System.out.println(N+ " tiene por debajo estos numeros primos ");
	}//MAIN

}// CLASS





public void fechasiguiente(){
   
    if(this.dia!=this.getDiasMes()){this.dia=this.dia+1;}
    else{
       this.dia=1;
        if(this.mes!=12){
           this.mes=this.mes+1;}
         else{
              this.mes=1;
              this.año=this.año+1;}
            } 
  
    } 
    
    
 public Fecha sumadias(int num){
      Fecha F=new Fecha(this.getdia(),this.getmes(),this.getaño());
      for(int i=1;i<=num;i++){
          F.fechasiguiente();}
        return F;}





