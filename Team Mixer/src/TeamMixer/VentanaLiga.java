package TeamMixer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Window.Type;

import javax.swing.JTabbedPane;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLiga extends JFrame {

	private JPanel contentPane;
	private JLabel equipos [][] = new JLabel[16][2];
	private JLabel duelos[]= new JLabel[8];
	private JComboBox resultado[] = new JComboBox[8];
	private Liga liga;
	private JPanel panel_1 = new JPanel();
	private int cont=0;
	private JLabel labelPrincipal = new JLabel("");
	private JLabel lblCampeonatoFinalizado = new JLabel("");
	private JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	

	public VentanaLiga() {
		setTitle("TeamMixer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		tabbedPane.setBounds(0, 0, 784, 494);
		contentPane.add(tabbedPane);
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Principal", null, panel, null);
		panel.setLayout(null);
		
		final JButton btnFinalizar = new JButton("");
		btnFinalizar.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Boton finalizar campeonato2.jpg"));
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnFinalizar.setBounds(327, 313, 152, 37);
		panel.add(btnFinalizar);
		
		final JButton btnContinuar = new JButton("");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnContinuar.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Imagen Continuarr.jpg"));
		btnContinuar.setBounds(606, 405, 114, 33);
		btnContinuar.setVisible(false);
		panel.add(btnContinuar);
		
		final JLabel lblPrincipal = new JLabel("");
		lblPrincipal.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\campeonato en juego.jpg"));
		lblPrincipal.setBounds(0, 0, 779, 466);
		panel.add(lblPrincipal);
		
		final JLabel lblNomCampeon = new JLabel("");
		lblNomCampeon.setForeground(Color.YELLOW);
		lblNomCampeon.setFont(new Font("Showcard Gothic", Font.PLAIN, 45));
		lblNomCampeon.setBounds(226, 131, 395, 113);
		lblNomCampeon.setVisible(false);
		panel.add(lblNomCampeon);
		
		final JLabel lblCampeon = new JLabel("");
		lblCampeon.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Campeon.jpg"));
		lblCampeon.setBounds(-12, 0, 811, 466);
		lblNomCampeon.setVisible(false);
		panel.add(lblCampeon);
		
		//panel de partidos
		tabbedPane.addTab("Partidos", null, panel_1, null);
		panel_1.setLayout(null);
		
		final JLabel lblNumFechas = new JLabel("1");
		lblNumFechas.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNumFechas.setBounds(111, 96, 56, 26);
		panel_1.add(lblNumFechas);
		
		//Agrego los JLabels de los duelos
		for(int i=0;i<8;i++){
			duelos[i]= new JLabel("");
			duelos[i].setForeground(Color.WHITE);
			duelos[i].setFont(new Font("Tahoma", Font.PLAIN, 19));
			panel_1.add(duelos[i]);
		}
		
		//Les doy ubicacion a los JLabels de los duelos
		duelos[0].setBounds(14, 149, 192, 34);
		duelos[1].setBounds(14, 205, 192, 34);
		duelos[2].setBounds(14, 261, 192, 34);	
		duelos[3].setBounds(14, 317, 192, 34);
		duelos[4].setBounds(412, 149, 192, 34);
		duelos[5].setBounds(412, 205, 192, 34);
		duelos[6].setBounds(412, 261, 192, 34);
		duelos[7].setBounds(412, 317, 192, 34);		
		
		for(int i=0;i<8;i++){
			resultado[i]=new JComboBox();
			resultado[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
			panel_1.add(resultado[i]);
			resultado[i].setVisible(false);
			resultado[i].addItem("");
		}
		
		//les doy ubicacion a los JcomBox de resultados
		
		resultado[0].setBounds(204, 155, 154, 26);
		resultado[1].setBounds(204, 211, 154, 26);
		resultado[2].setBounds(204, 267, 154, 26);
		resultado[3].setBounds(204, 323, 154, 26);
		resultado[4].setBounds(615, 155, 154, 26);
		resultado[5].setBounds(615, 211, 154, 26);
		resultado[6].setBounds(615, 267, 154, 26);
		resultado[7].setBounds(615, 323, 154, 26);
		
		
		
		final JButton btnAgregarResultado = new JButton("");
		btnAgregarResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean condicion=false;
				
				for(int i=0;i<liga.getNumEquipos()/2;i++){
					if(resultado[i].getSelectedIndex()==0){
						condicion=true;
						JOptionPane.showMessageDialog(null,"Ingrese todos los resultados");
						break;
					}
				}
				
				
				
				if(condicion==false){
					for(int i=0;i<liga.getNumEquipos()/2;i++){
						if(resultado[i].getSelectedIndex()==1){
							liga.getPartido(cont, 0).setPtj(liga.getPartido(cont, 0).getPtj()+3);
						}
						
						if(resultado[i].getSelectedIndex()==2){
							liga.getPartido(cont, 0).setPtj(liga.getPartido(cont, 0).getPtj()+1);
							liga.getPartido(cont, 1).setPtj(liga.getPartido(cont, 1).getPtj()+1);
						}
						if(resultado[i].getSelectedIndex()==3){
							liga.getPartido(cont, 1).setPtj(liga.getPartido(cont, 1).getPtj()+3);
						}
						cont++;
						
					}
					agregarPosicion();
					if(cont<liga.getNumEquipos()/2*(liga.getNumEquipos()-1)){
						int j=0;
						for(int i=cont;i<cont+liga.getNumEquipos()/2;i++){
							agregarDuelo(j, liga.getPartido(i, 0),liga.getPartido(i, 1));
							j++;
						}
						liga.setFecha(liga.getFecha()+1);
						lblNumFechas.setText(String.valueOf(liga.getFecha()));
					}
					else{
						JOptionPane.showMessageDialog(null,"El campeonato ha finalizado");
						btnAgregarResultado.setVisible(false);
						for(int i=0;i<liga.getNumEquipos()/2;i++){
							resultado[i].setVisible(false);
							duelos[i].setVisible(false);
							lblNumFechas.setVisible(false);
							labelPrincipal.setVisible(false);
							lblCampeonatoFinalizado.setVisible(true);
							lblPrincipal.setVisible(false);
							lblNomCampeon.setText(getPrimerLugar());
							lblNomCampeon.setVisible(true);
							lblCampeon.setVisible(true);
							btnFinalizar.setVisible(false);
							btnContinuar.setVisible(true);
							tabbedPane.setSelectedIndex(0);
							
							
						}
					}
					
					
				}
				
			}
		});
		btnAgregarResultado.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Boton Agregar Resultado.jpg"));
		btnAgregarResultado.setBounds(342, 405, 158, 39);
		panel_1.add(btnAgregarResultado);
		
		
		
		labelPrincipal.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenPartidos.jpg"));
		labelPrincipal.setBounds(0, 0, 779, 488);
		panel_1.add(labelPrincipal);
		
		
		lblCampeonatoFinalizado.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenCampeonato Finalizado.jpg"));
		lblCampeonatoFinalizado.setBounds(0, 0, 779, 466);
		lblCampeonatoFinalizado.setVisible(false);
		panel_1.add(lblCampeonatoFinalizado);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tabla", null, panel_2, null);
		panel_2.setLayout(null);
		
		//agrego los JLabels a cada posicion
		
		for(int i=0;i<16;i++){
			for(int j=0;j<2;j++){
				equipos[i][j]= new JLabel("");
				equipos[i][j].setFont(new Font("Tahoma", Font.PLAIN, 19));
				equipos[i][j].setForeground(new Color(255, 215, 0));
				panel_2.add(equipos[i][j]);
				
			}
			
		}
		
		//a cada JLabel de jugadores le doy su posicion
		
		equipos[0][0].setBounds(133, 136, 151, 26);
		equipos[1][0].setBounds(132, 166, 151, 26);
		equipos[2][0].setBounds(132, 193, 151, 26);
		equipos[3][0].setBounds(133, 221, 151, 26);
		equipos[4][0].setBounds(133, 250, 151, 26);		
		equipos[5][0].setBounds(133, 280, 151, 26);		
		equipos[6][0].setBounds(133, 309, 151, 26);
		equipos[7][0].setBounds(133, 338, 151, 26);		
		equipos[8][0].setBounds(133, 367, 151, 26);		
		equipos[9][0].setBounds(133, 394, 151, 26);
		equipos[10][0].setBounds(419, 106, 151, 26);
		equipos[11][0].setBounds(419, 136, 151, 26);		
		equipos[12][0].setBounds(419, 166, 151, 26);
		equipos[13][0].setBounds(419, 193, 151, 26);		
		equipos[14][0].setBounds(419, 221, 151, 26);		
		equipos[15][0].setBounds(419, 250, 151, 26);
		
		//a cada JLabel de PTJ le doy su posicion
		
		equipos[0][1].setBounds(297, 136, 38, 25);
		equipos[1][1].setBounds(297, 164, 38, 25);
		equipos[2][1].setBounds(297, 192, 38, 25);
		equipos[3][1].setBounds(297, 223, 38, 25);
		equipos[4][1].setBounds(297, 252, 38, 25);	
		equipos[5][1].setBounds(297, 282, 38, 25);	
		equipos[6][1].setBounds(297, 310, 38, 25);
		equipos[7][1].setBounds(297, 338, 38, 25);
		equipos[8][1].setBounds(297, 366, 38, 25);
		equipos[9][1].setBounds(297, 395, 38, 25);
		equipos[10][1].setBounds(580, 108, 38, 25);
		equipos[11][1].setBounds(580, 136, 38, 25);
		equipos[12][1].setBounds(580, 164, 38, 25);
		equipos[13][1].setBounds(580, 192, 38, 25);	
		equipos[14][1].setBounds(580, 223, 38, 25);	
		equipos[15][1].setBounds(580, 252, 38, 25);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Tabla de Posiciones.jpg"));
		label.setBounds(0, 0, 779, 503);
		panel_2.add(label);
		
	}
	
	public void agregarLiga(Liga liga){
		this.liga=liga;
	}
	
	public void agregarComBoxResultado(int i){
		
		for(int j=0;j<i/2;j++){
			resultado[j].setVisible(true);
		}
	}
	
	public void agregarDuelo(int i,Jugador equipo1,Jugador equipo2){
		
	
		duelos[i].setText(equipo1.getNombre()+" vs "+equipo2.getNombre());
		resultado[i].removeAllItems();
		resultado[i].addItem("");
		resultado[i].addItem(equipo1.getNombre()+" Ganador");
		resultado[i].addItem("Empate");
		resultado[i].addItem(equipo2.getNombre()+" Ganador");
		
	}
	
	public void agregarPosicion(){
		int cont = 8*3;
		int cont2=0;
		
		for(int i=cont;i>-1;i--){
			for(int j=0;j<liga.getNumEquipos();j++){
				if(i==liga.getJugador(j).getPtj()){
					equipos[cont2][0].setText(liga.getJugador(j).getNombre());
					equipos[cont2][1].setText(String.valueOf(liga.getJugador(j).getPtj()));
					cont2++;
				}
			}
		}
		
		for(int i=0;i<liga.getNumEquipos();i++){
			if(cont==liga.getJugador(i).getPtj()){
				
			}
			
		}
	}
	
	public String getPrimerLugar(){
		return equipos[0][0].getText();
	}
}
