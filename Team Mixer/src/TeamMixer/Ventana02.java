package TeamMixer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Window.Type;
import java.io.IOException;

public class Ventana02 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	public Ventana02() {
		setFont(new Font("Courier New", Font.PLAIN, 14));
		setTitle("Team Mixer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setForeground(Color.BLACK);
		textNombre.setFont(new Font("Consolas", Font.PLAIN, 15));
		textNombre.setBounds(316, 32, 121, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		
		//Creoo una lista y le agrego una barra
		
		final JList listJugadores = new JList();
		final DefaultListModel lista = new DefaultListModel();
		
		
		final JLabel lblContJugadores = new JLabel(Integer.toString(lista.getSize()));
		lblContJugadores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContJugadores.setBounds(374, 129, 63, 20);
		contentPane.add(lblContJugadores);
		
		listJugadores.setFont(new Font("Consolas", Font.PLAIN, 20));
		JScrollPane barra = new JScrollPane(listJugadores);
		barra.setBounds(36, 130, 157, 323);
		contentPane.add(barra);
		
		
		//Agrego los jugadore a la lista y al arreglo
		JButton btnAgregar = new JButton("");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//compruebo que no agregue mas jugadores a la lista que superen la cantidad
				if(lista.getSize()<16){
					if(textNombre.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Ingrese el nombre del Jugador por favor");
					}
					else{
						lista.addElement(textNombre.getText());
						listJugadores.setModel(lista);
						lblContJugadores.setText(Integer.toString(lista.getSize()));
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Lista de jugadores llena");
				}
				textNombre.setText("");	
			}
		});
		btnAgregar.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Imagen Agregar.jpg"));
		btnAgregar.setBounds(468, 31, 89, 23);
		contentPane.add(btnAgregar);
		
		final JComboBox seleccionCampeonato = new JComboBox();
		seleccionCampeonato.setModel(new DefaultComboBoxModel(new String[] {"Liga\t", "Eliminacion Directa"}));
		seleccionCampeonato.setBounds(340, 63, 121, 24);
		contentPane.add(seleccionCampeonato);
		
		final VentanaLiga ventanaLiga = new VentanaLiga();
		
		final EliminacionDirecta eliminacion = new EliminacionDirecta(lista.getSize());
		final VentanaEliminacionDirecta venEliminacion = new VentanaEliminacionDirecta();
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lista.getSize()%2==0){
					if(seleccionCampeonato.getSelectedIndex()==0){
						final Liga liga = new Liga(lista.getSize());
						for(int i=0;i<lista.getSize();i++){
							liga.agregarJugador(String.valueOf(lista.get(i)));
						}
						liga.generarDuelos();
						ventanaLiga.agregarLiga(liga);
						ventanaLiga.agregarComBoxResultado(lista.getSize());
						ventanaLiga.agregarPosicion();
						for(int i=0;i<lista.getSize()/2;i++){
							ventanaLiga.agregarDuelo(i,liga.getPartido(i,0),liga.getPartido(i, 1));
						}
						setVisible(false);
						ventanaLiga.setVisible(true);
					}
					if(seleccionCampeonato.getSelectedIndex()==1){
						if(lista.getSize()==2 || lista.getSize()==4 || lista.getSize()==8 || lista.getSize()==16){
							for(int i=0;i<lista.getSize();i++){
								eliminacion.agregarJugador(String.valueOf(lista.get(i))); 
							}
							setVisible(false);
							venEliminacion.setVisible(true);
							venEliminacion.mostrarBotones(lista.getSize());
							//Ingreso lo jugadores a la tabla dependiendo de la cantidad de cuantos sean
							if(lista.getSize()==16){
								for(int i=0;i<16;i++){
									venEliminacion.setJugador(i,eliminacion.getJugador(i).getNombre());
								}
							}
							if(lista.getSize()==8){
								int j=0;
								for(int i=16;i<24;i++){
									venEliminacion.setJugador(i,eliminacion.getJugador(j).getNombre());
									j++;
								}
							}
							if(lista.getSize()==4){
								int j=0;
								for(int i=24;i<28;i++){
									venEliminacion.setJugador(i,eliminacion.getJugador(j).getNombre());
									j++;
								}
							}
							if(lista.getSize()==2){
								int j =0;
								for(int i=28;i<30;i++){
									venEliminacion.setJugador(i,eliminacion.getJugador(j).getNombre());
									j++;
								}
							}
							
						}
						else{
							JOptionPane.showMessageDialog(null,"La cantidad de jugadores para este torneo debe ser de 2,4,8,16");
						}
						
					}
						
				}
				else{
					JOptionPane.showMessageDialog(null,"La cantidad de jugadores debe ser par");
				}
			}
		});
		button.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Imagen Continuarr.jpg"));
		button.setBounds(642, 420, 114, 33);
		contentPane.add(button);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenEliminar.jpg"));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lista.remove(listJugadores.getSelectedIndex());
				lblContJugadores.setText(Integer.toString(lista.getSize()));
				
			}
		});
		btnEliminar.setBounds(203, 155, 89, 24);
		contentPane.add(btnEliminar);
		
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 784, 494);
		contentPane.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenMenu02.jpg"));
	}
}
