package TeamMixer;

public class Campeonato {
	protected Jugador jugador[] = new Jugador[16];
	private int cont;
	
	public Campeonato(){
		cont=0;
	}
	
	public void agregarJugador(String nombre){
		if(cont<64){
			jugador[cont]=new Jugador(nombre);
			jugador[cont].setPtj(0);
		}
		cont++;
	}
	
	public int cantidadJugadores(){
		int i=0;
		for(i=0;i<64;i++){
			if(jugador[i]==null){
				break;
			}
		}
		return i;
	}
	
	public 	Jugador getJugador(int i){
		return jugador[i];
	}
	
	
	
	

}
