package TeamMixer;
public class Jugador {

	private String nombre;
	private int ptj;
	
	Jugador(String nombre){
		this.nombre=nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPtj() {
		return this.ptj;
	}

	public void setPtj(int ptj) {
		this.ptj = ptj;
	}

}