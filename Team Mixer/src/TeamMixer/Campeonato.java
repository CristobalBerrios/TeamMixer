package TeamMixer;

public class Campeonato {
	protected Jugador jugador[] = new Jugador[64];
	protected int cont;
	
	public Campeonato(){
		cont=0;
	}
	
	public void agregarJugador(String nombre){
		if(cont<64){
			jugador[cont]=new Jugador(nombre);
		}
		cont++;
	}
	
	public int getCont(){
		return cont;
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
	
	public 	String getJugador(int i){
		return jugador[i].getNombre();
	}

}
