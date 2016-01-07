package TeamMixer;

public class EliminacionDirecta extends Campeonato {
	
	private int numEquipos;
	private String duelos[][]= new String[64/2][2];
	
	public EliminacionDirecta(int numEquipos){
		this.numEquipos=numEquipos;
	}
	
	public void GenerarDuelos(){
		int i=0;
		int j=0;
		
		do{
			i=(int)Math.random()*numEquipos/2;
			if(duelos[i][0]==null){
				duelos[i][0]=jugador[j].getNombre();
				j++;
			}
			else if(duelos[i][1]==null){
				duelos[i][1]=jugador[j].getNombre();
				j++;
			}
		}while(j<numEquipos);
		
	}
	
	public void mostrarDuelos(){
		for(int i=0;i<numEquipos/2;i++){
			System.out.println(duelos[i][0]+" vs "+duelos[i][1]);
		}
	}
	
	public void Mostrar(){
		for(int i =0;i<cantidadJugadores();i++){
			System.out.println(jugador[i]);
		}
		
	}

}
