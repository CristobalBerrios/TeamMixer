package TeamMixer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JugadoresSave {
	private RandomAccessFile archivo= null;
	private String jugadoresSave[]= new String[10];
	
	public JugadoresSave(){
		ingresarJugadoresSaves();
	}
	
	public void saveJugador(String jugador){
		try{
			archivo = new RandomAccessFile("D:/jugadores.txt","rw");
			archivo.seek(archivo.length());
			archivo.writeBytes(jugador+";");
			
		}catch (FileNotFoundException ex){
			
		}catch(IOException ex){
			
		}finally{
			try{
				if(archivo!=null){
					archivo.close();
				}
			}catch(IOException e){
				
			}
		}
	}
	
	public String getTexto(){
		String nombre="";
		try {
			archivo = new RandomAccessFile("D:/jugadores.txt","rw");
			archivo.seek(0);
			nombre=archivo.readLine();
			archivo.seek(archivo.length());
			
		} catch (FileNotFoundException ex) {
			
		}catch (IOException ex){
			
		}
		
		return nombre;
	}
	
	public void ingresarJugadoresSaves(){
		String nombre = "";
		int cont =0;
		
		
		try {
			archivo = new RandomAccessFile("D:/jugadores.txt","rw");
			if(archivo.length()!=0){
				for(int i=0;i<getTexto().length();i++){
					if(getTexto().substring(i,i+1).equals(";")){
						jugadoresSave[cont]=nombre;
						nombre="";
						cont++;
					}
					else{
						nombre=nombre+getTexto().substring(i,i+1);
					}
				}
				
			}
		} catch (IOException e) {
		}
		
		
		
		
	}
	
	public void borrarJugadoresSave(){
		try{
			archivo = new RandomAccessFile("D:/jugadores.txt","rw");
			archivo.setLength(0);
			
		}catch (FileNotFoundException ex){
			
		}catch(IOException ex){
			
		}finally{
			try{
				if(archivo!=null){
					archivo.close();
				}
			}catch(IOException e){
				
			}
		}
		
		
	}
	
	public String getJugadorSave(int i){
		return jugadoresSave[i];
	}
	
	
	
	
}
