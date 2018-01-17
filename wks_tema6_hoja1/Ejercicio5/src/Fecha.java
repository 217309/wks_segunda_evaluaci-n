import java.util.Scanner;
public class Fecha
{
   int dia;
   int mes;
   int año;
    public Fecha(int D,int M,int A)
    { this.dia=D;
        this.mes=M;
        this.año=A;
      boolean correcto=this.Escorrecta();
      Scanner teclado=new Scanner(System.in);
         while(correcto==false){
            System.out.println("Fecha incorrecta");
            System.out.println("Introduce nueva fecha");
            System.out.println("Dia");
            this.dia=teclado.nextInt();
            System.out.println("Mes");
            this.mes=teclado.nextInt();
            System.out.println("Año");
            this.año=teclado.nextInt();
            correcto=this.Escorrecta();}
           
    }
    
    public boolean Escorrecta(){
       boolean b=this.Bisiesto();
        boolean correcto=(this.año>=1900);
        if(correcto=true){
            correcto=((this.mes>=1)&&(this.mes<=12));
           if(correcto==true){
               switch(this.mes){
                  case 1:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 3:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 5:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 7:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 8:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 10:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 12:correcto=((this.dia>=1)&&(this.dia<=31));
                  break;
                  case 4:correcto=((this.dia>=1)&&(this.dia<=30));
                   break;
                  case 6:correcto=((this.dia>=1)&&(this.dia<=30));
                   break;
                  case 9:correcto=((this.dia>=1)&&(this.dia<=30));
                   break; 
                  case 11:correcto=((this.dia>=1)&&(this.dia<=30));
                   break; 
                 case 2:if(b==true){correcto=((this.dia>=1)&&(this.dia<=29));}
                        else{correcto=((this.dia>=1)&&(this.dia<=28));}
                        break;
                    }
                }
            }
           return correcto; 
        }
    
    public boolean Bisiesto(){
      
       boolean b=false;
    if(this.año%4==0){
        b=true;
     }
    return b;}
    //Getter
    public int getdia(){
       return this.dia;} 
       
    public int getmes(){
       return this.mes;}
     public int getaño(){
       return this.año;}
       
       
       //Setter
     public void setdia(int D){
      this.dia=D;}
      
 public void setmes(int M){
      this.dia=M;}
      
 public void setaño(int A){
      this.dia=A;} 
      
  
 public String getCadenaMes(){
     String S="-1";
     
     switch(this.mes){
                  case 1:S="Enero";
                  break;
                  case 3:S="Marzo";
                  break;
                  case 5:S="Mayo";
                  break;
                  case 7:S="Julio";
                  break;
                  case 8:S="Agosto";
                  break;
                  case 10:S="Octubre";
                  break;
                  case 12:S="Diciembre";
                  break;
                  case 4:S="Abril";
                   break;
                  case 6:S="Junio";
                   break;
                  case 9:S="Septiembre";
                   break; 
                  case 11:S="Noviembre";
                   break; 
                   case 2:S="Febrero" ;
                        break;
                    }
     
     return S;
    
    }  
    
    public int getDiasMes(){
        int d=-1;
        boolean b=this.Bisiesto();
       switch(this.mes){
                  case 1:d=31;
                  break;
                  case 3:d=31;
                  break;
                  case 5:d=31;
                  break;
                  case 7:d=31;
                  break;
                  case 8:d=31;
                  break;
                  case 10:d=31;
                  break;
                  case 12:d=31;
                  break;
                  case 4:d=30;
                   break;
                  case 6:d=30;
                   break;
                  case 9:d=30;
                   break; 
                  case 11:d=30;
                   break; 
                 case 2:if(b==true){d=29;}
                        else{d=28;}
                        break;
                    }
                    return d;
                }
      public String getCadenaFecha1(){
         
          String S=this.dia+" - "+this.mes+" - "+this.año;
          return S;} 
          
      public String getCadenaFecha2(){
         
          String S=this.dia+" de "+getCadenaMes()+" de "+this.año;
          return S;}
          
        public int Ndias(){
           boolean b=this.Bisiesto();
            int d=(this.año-1900)*365;
            d=d+(int)(this.getaño()-1900)/4;//Añadimos los años bisiestos transcurridos
              switch(this.mes){
                  case 1:d=d+this.getdia();
                  break;
                  case 2:this.setmes(this.getmes()-1);
                      
                      d=d+this.getDiasMes()+this.dia;
                  break;
                  case 3:setmes(this.getmes()-1);
                        d=d+31+this.getDiasMes()+this.getdia();
                         
                      
                  break;
                  case 4:setmes(this.getmes()-1);
                  d=d+31+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                         
                  break;
                  case 5:
                  setmes(this.getmes()-1);
                  d=d+62+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                  break;
                  case 6:
                  setmes(this.getmes()-1);
                  d=d+92+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                  break;
                  case 7:
                     setmes(this.getmes()-1);
                  d=d+123+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                  break;
                  case 8:
                        setmes(this.getmes()-1);
                  d=d+153+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                   break;
                  case 9:
                     setmes(this.getmes()-1);
                  d=d+184+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;};
                   break;
                  case 10:
                   setmes(this.getmes()-1);
                  d=d+215+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                   break; 
                  case 11:
                     setmes(this.getmes()-1);
                  d=d+245+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                   break; 
                 case 12:
                    setmes(this.getmes()-1);
                  d=d+276+this.getdia()+this.getDiasMes();
                    if(b==true){d=d+29;}
                    else{d=d+28;}
                        break;
                    }
                    return d;
            
             } 
             
        public int diferenciaFecha(Fecha fecha2){
           int d1=this.Ndias();
           int d2=fecha2.Ndias();
           d1=Math.abs(d1-d2);
          return d1;}
          
          
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
                
        public static void main(String[]args){
          
         Scanner teclado=new Scanner(System.in);
         System.out.println("Introduce Fecha");
            System.out.println("Dia");
            int dia=teclado.nextInt();
            System.out.println("Mes");
            int mes=teclado.nextInt();
            System.out.println("Año");
            int año=teclado.nextInt();
            Fecha F=new Fecha(dia,mes,año);
            System.out.println("====================================");
            System.out.println("              Menu                 ");
            System.out.println("====================================");
            System.out.println("1: Mostrar Fecha");
            System.out.println("2: Fecha siguiente");
            System.out.println("3: Mostrar mes corriente");
            System.out.println("4: Diferencia de dias con otra fecha");
            System.out.println("5:  Fecha tras n dias");
            System.out.println("0: Salir");
            System.out.println("Introduzca la opcion de menu");
            int op=teclado.nextInt();
                 switch(op){
                  case 1:String S=F.getCadenaFecha2();
                         System.out.println(S);
                  break;
                  case 2:F.fechasiguiente();
                      
                        String S1=F.getCadenaFecha2();
                        System.out.println(S1);
                  break;
                  case 3:String S2 =F.getCadenaMes();
                         System.out.println(S2);
                         
                      
                  break;
                  case 4:System.out.println("Introduce la segunda fecha");
                  System.out.println("Dia");
                  dia=teclado.nextInt();
                  System.out.println("Mes");
                  mes=teclado.nextInt();
                  System.out.println("Año");
                  año=teclado.nextInt();
            Fecha G=new Fecha(dia,mes,año);
                   int diferencia=F.diferenciaFecha(G);
                   System.out.println(" La diferencia de dias es: "+diferencia);
                    
                         
                  break;
                  case 5:
                  System.out.println("Introduce el numero de dias trascurridos");
                  int num=teclado.nextInt();
                  while(num<=0){
                       System.out.println(" Numero de dias trascurridos incorrecto");
                       System.out.println("Introduce el numero de dias trascurridos");
                       num=teclado.nextInt();
                       }
                   Fecha H=F.sumadias(num);
                   String S3=H.getCadenaFecha2();
                   System.out.println(S3);
                  
                  break;
                  default:System.out.println("Bye");
             
             
            
              
        }        
          
              
          
              
          
                  }
             }
                   
                  
       
                     
                
    
    
  
  
     
  

