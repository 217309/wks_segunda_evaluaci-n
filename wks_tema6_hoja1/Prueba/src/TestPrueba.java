
public class TestPrueba {

	public static void main(String[] args) {
		DePrueba vecPruebas[]=new DePrueba[4];
		int indice;
		String nombre="";
		for(indice = 0; indice < vecPruebas.length; indice++){
			//System.out.println(nombre + " ** " + indice);
			vecPruebas[indice] = new DePrueba(darNombre(indice), darCapacidad(indice));
		}
		for(indice=0; indice < vecPruebas.length; indice++){
			System.out.println(vecPruebas[indice]);
		}
	}//main

	public static String darNombre(int posicion){
		String nombres[] = {"Uno", "Dos", "Tres", "Cuatro"};		
		return nombres[posicion];
	}
	
	public static int darCapacidad(int posicion){
		int capacidades [] = {10, 20, 30, 40};
		return capacidades[posicion];
	}
}//class
