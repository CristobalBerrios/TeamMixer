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
		listJugadores.setFont(new Font("Consolas", Font.PLAIN, 20));
		JScrollPane barra = new JScrollPane(listJugadores);
		barra.setBounds(36, 130, 157, 323);
		contentPane.add(barra);
		
		
		//Agrego los jugadore a la lista y al arreglo
		JButton btnAgregar = new JButton("");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//compruebo que no agregue mas jugadores a la lista que superen la cantidad
				if(lista.getSize()<64){
					if(textNombre.getText().equals("")){
						JOptionPane.showMessageDialog(null,"Ingrese el nombre del Jugador por favor");
					}
					else{
						lista.addElement(textNombre.getText());
						listJugadores.setModel(lista);
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
							if(lista.getSize()==16){
								for(int i=0;i<16;i++){
									venEliminacion.setJugador(i,eliminacion.getJugador(i));
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
		
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 784, 494);
		contentPane.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenMenu02.jpg"));
	}
}
