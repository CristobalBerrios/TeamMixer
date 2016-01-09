package TeamMixer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VentanaEliminacionDirecta extends JFrame {

	private JPanel contentPane;
	private JLabel jugador[] = new JLabel[30];

	public VentanaEliminacionDirecta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		for(int i =0;i<30;i++){
			jugador[i]=new JLabel("");
			contentPane.add(jugador[i]);
		}
		
		jugador[0].setBounds(11, 17, 85, 26);
		jugador[1].setBounds(11, 87, 85, 26);
		jugador[2].setBounds(11, 150, 85, 26);
		jugador[3].setBounds(11, 217, 85, 26);
		jugador[4].setBounds(11, 284, 85, 26);
		jugador[5].setBounds(11, 351, 85, 26);
		jugador[6].setBounds(11, 420, 85, 26);
		jugador[7].setBounds(11, 484, 85, 26);
		jugador[8].setBounds(706, 16, 85, 26);
		jugador[9].setBounds(706, 87, 85, 26);
		jugador[10].setBounds(706, 150, 85, 26);
		jugador[11].setBounds(706, 217, 85, 26);
		jugador[12].setBounds(706, 284, 85, 26);
		jugador[13].setBounds(706, 351, 85, 26);
		jugador[14].setBounds(706, 420, 85, 26);
		jugador[15].setBounds(706, 485, 85, 26);
		jugador[16].setBounds(121, 57, 85, 26);
		jugador[17].setBounds(121, 188, 85, 26);
		jugador[18].setBounds(121, 321, 85, 26);
		jugador[19].setBounds(121, 455, 85, 26);
		jugador[20].setBounds(599, 57, 85, 26);
		jugador[21].setBounds(599, 188, 85, 26);
		jugador[22].setBounds(599, 321, 85, 26);
		jugador[23].setBounds(599, 455, 85, 26);
		jugador[24].setBounds(221, 123, 85, 26);
		jugador[25].setBounds(221, 393, 85, 26);
		jugador[26].setBounds(500, 123, 85, 26);
		jugador[27].setBounds(500, 393, 85, 26);
		jugador[28].setBounds(272, 261, 85, 26);
		jugador[29].setBounds(444, 258, 85, 26);
		
		JLabel lblGanador = new JLabel("");
		lblGanador.setBounds(359, 201, 85, 26);
		contentPane.add(lblGanador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenEliminacionDirecta Tabla.jpg"));
		label.setBounds(0, 0, 800, 527);
		contentPane.add(label);
	}
	
	public void setJugador(int i,String nombre){
		jugador[i].setText(nombre);
	}
	
	
}
