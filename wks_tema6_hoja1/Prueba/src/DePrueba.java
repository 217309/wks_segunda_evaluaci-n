
public class DePrueba {
	private String nombre;
	private Integer capacidadMax;
	
	
	
	public DePrueba(String nombre, Integer capacidadMax) {
		this.nombre = nombre;
		this.capacidadMax = capacidadMax;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCapacidadMax() {
		return capacidadMax;
	}
	public void setCapacidadMax(Integer capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	 public String toString(){
		 return getNombre() + " *** " + getCapacidadMax();
	 }
	
}
