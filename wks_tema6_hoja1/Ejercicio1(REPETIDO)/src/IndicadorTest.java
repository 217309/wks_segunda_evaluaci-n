import java.util.Scanner;

public class IndicadorTest {


	public static void main (String []args){
		Scanner teclado=new Scanner(System.in);
		double max;
		String uni;
		String nom;
		double min;
		double valorActual;
		valorActual=0;
		double sumarCantidad;
		double restarCantidad;
		
		
		// 1º Creamos la varibale indicadores que guarda la direccion de un array de objetos de la clase Indicador 
		// El array de objetos tiene todos sus campos con valor null
		// Más tarde lo llenaremos con direcciones de objetos
		Indicador indicadores []=new Indicador[5];
		
		System.out.println("Introduce los datos de los indicadores");
		System.out.println("1:Combustible");
		System.out.println("2:Aceite");
		System.out.println("3:Temperatura");
		System.out.println("4:velocidad");
		System.out.println("5:Revoluciones");
		
		// Cremaos un string que contendrá todos los indicadores. 
				String S [] = {"Combustible", "Aceite", "Temperatura", "Velocidad", "Revoluciones"}; 
				/*
				 String S [] = new String [5];
				S[0]="Combustible";
				S[1]="Aceite";
				S[2]="Temperatura";
				S[3]="Velocidad";
				S[4]="Revoluciones";
				*/

		// 2º Hay que rellenar el array new Indicador [5] que esta vacío, con direcciones de objetos de clase Indicador
		
		for(int i=0;i<indicadores.length;i++){
			System.out.println("/////////////////////");
			System.out.println("Indicador >>>> "+S[i]);

			// Introducimos cada uno de los parametros de nuestro objeto. 
			
			System.out.print("Unidades");
			uni=teclado.next();
			
			System.out.print("Maximo");
			max=teclado.nextDouble();
			
			System.out.print("Minimo");
			min=teclado.nextDouble();
			
			//3º Se asigna a cada posición del array una dirección de objeto. 
			
			// Los parametrsos que se pasana a Indicador tienen que estar en el mismo orden de tipos que el constructor Strin, String, double, double
			// 	Indicador(String uni,String nom, double max, double min)
			
			/* 4º Hay que crear el indicador antes de llamar a  los métodos sumarCantidad y restar Cantidad, porque si lo creamos despúes no hemos asignado ninguna
			dirección de objeto a la posicion i=0*/
			
			
			indicadores[i]=new Indicador(uni, S[i], max, min); // se crea un indicador
			
			//indicadores.incrementar(sumarCantidad); // si lo pongo así estaría actuando sobre el array en conjunto que no tiene metodos.
			System.out.print("Añadir");
			sumarCantidad=teclado.nextDouble();
			indicadores[i].incrementar(sumarCantidad);//En cambio queremos actuar sobre cada una de las posiciones del array que contienen direcciones de objeto de la clase indicador.
			
			System.out.print("Quitar");
			restarCantidad=teclado.nextDouble();
			indicadores[i].disminuir(restarCantidad);//Vamos a pasar a cada una de las posiciones del array una dirección de objeto 
			
			
			/* INDICADOR MAL CREADO!! indicadores[i]=new Indicador(uni, S[i], max, min); 
			
			Porque cuando los metodos sumarCantidad y restarCantidad van a hacer uso de la direccion de objeto indicadores[i], está VACÍA!!
			No le hemos asignado NINGUNA todavía. 
			
			
			
		 	
			*/
			
			
		
			
			// Preguntar al hacer este procedimiento Indicador1.setValorActual(valorActual); se modificaría el valorActual
			//Indicador1.setValorActual(valorActual);
		}
		
		mostrar(indicadores); 
	} // main   

	public static String darNombre(int posicion){
		String nombres[] = {"Uno", "Dos", "Tres", "Cuatro"};		
		return nombres[posicion];
	}
	
	
	
	
	public static void mostrar(Indicador [] indicadores){
		System.out.println("=============RESUMEN===================");
		for(int i=0;i<=4;i++){
			System.out.println("Nombre : "+indicadores[i].getNombre());
			System.out.println("Unidades : "+indicadores[i].getUnidades());
			System.out.println("Ninel maximo : "+indicadores[i].getMaximo());
			System.out.println("Ninel minimo : "+indicadores[i].getMinimo());
			indicadores[i].mostrarValorActual();
			if(indicadores[i].getValorActual()==indicadores[i].getMinimo()){
				System.out.print("Repostar. Nivel Critico");}
		}
		System.out.println(); // Para separar un indicador cada vez que creemos uno.
	}
	

	
	
	
}// clase