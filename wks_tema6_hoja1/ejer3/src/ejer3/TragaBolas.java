package ejer3;

import java.util.Scanner;


// NO CUENTA LAS BOLAS COMIDAS

public class TragaBolas
{   
    //Propiedades
    String Color;
    int BolasComidas;
    int maxBolas;
    
   // Constructor por defecto
    public TragaBolas(String C,int m)
    {
        this.Color=C;
        this.BolasComidas=0;
        this.maxBolas=m;
        
    }
    // Constructor de usuario
    public TragaBolas(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el nombre del color");
        this.Color=teclado.next();
        this.BolasComidas=0;
         System.out.println("Introduce el numero maximo de bolas");
         this.maxBolas=teclado.nextInt();
         while(this.maxBolas<=0){
             System.out.println("Numero de bolas incorrecto.Introduce el numero maximo de bolas");
             this.maxBolas=teclado.nextInt();
              }
       
      }
      // Visualiza la informacion
   public void mostrar(){
      System.out.println("Color:                    "+this.Color);
      System.out.println("Bolas Comidas:            "+this.BolasComidas);
      System.out.println("Numero maximo de bolas: : "+this.maxBolas);
      }   
      
 public void comer(){
      
      if(this.BolasComidas<this.maxBolas){
           this.BolasComidas++;
           System.out.println("Me he comido una bola");
        
      }
     else{
          System.out.println("No me he comido ninguna Bola");
        }  
        
}
    public void trotar(){
        if(this.BolasComidas>=1){
            this.BolasComidas--;
        System.out.println("Estoy trotando");}
        else{System.out.println("No tengo Bolas ");}
        
     }
  public void dormir(){
     if(this.BolasComidas==this.maxBolas){
          this.BolasComidas=(int)(this.BolasComidas/2);
          System.out.println("Tripa llena.ZZZZZZZZZZZZZ");
           }
        else{System.out.println("No quiero dormir");}
    } 
    
    // Metodo principal
    
    public static void main(String[]args){
     Scanner teclado=new Scanner(System.in);
     // Creamos tragabolas
     int s=1;
      TragaBolas T=new TragaBolas();
      while(s==1){
    System.out.println("Introducir opcion de menu deseada");
    System.out.println("1: Darle de Comer");
    System.out.println("2: Hacerle dormir");
    System.out.println("3: Trotar");
    System.out.println("4: Ver estado");
    System.out.println("0: Salir");
    int n=teclado.nextInt(); 
      while((n<0)||(n>4)){
     System.out.println("Opcion incorrecta. Vuelva a introducir una opcion correcta:[0,4]");
     n=teclado.nextInt(); 
       }
       if(n==1){
          T.comer();}
       if(n==2){
        T.dormir();}
      if(n==3){
         T.trotar();}
      if(n==4){
         T.mostrar();}
      if(n==0){
          System.out.println("Bye");} 
          
          
      System.out.println("Desea continuar: Si(1):N0(0)"); 
      s=teclado.nextInt();
         
        }
     
    }
     
}