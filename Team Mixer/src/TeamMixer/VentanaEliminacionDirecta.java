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

	public VentanaEliminacionDirecta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJugador01 = new JLabel("");
		lblJugador01.setBounds(10, 17, 85, 26);
		contentPane.add(lblJugador01);
		
		JLabel lblJugador02 = new JLabel("");
		lblJugador02.setBounds(10, 87, 85, 26);
		contentPane.add(lblJugador02);
		
		JLabel lblJugador03 = new JLabel("");
		lblJugador03.setBounds(10, 150, 85, 26);
		contentPane.add(lblJugador03);
		
		JLabel lblJugador04 = new JLabel("");
		lblJugador04.setBounds(10, 217, 85, 26);
		contentPane.add(lblJugador04);
		
		JLabel lblJugador05 = new JLabel("");
		lblJugador05.setBounds(10, 284, 85, 26);
		contentPane.add(lblJugador05);
		
		JLabel lblJugador06 = new JLabel("");
		lblJugador06.setBounds(10, 351, 85, 26);
		contentPane.add(lblJugador06);
		
		JLabel lblJugador07 = new JLabel("");
		lblJugador07.setBounds(10, 420, 85, 26);
		contentPane.add(lblJugador07);
		
		JLabel lblJugador08 = new JLabel("");
		lblJugador08.setBounds(10, 484, 85, 26);
		contentPane.add(lblJugador08);
		
		JLabel lblJugador09 = new JLabel("");
		lblJugador09.setBounds(705, 16, 85, 26);
		contentPane.add(lblJugador09);
		
		JLabel lblJugador10 = new JLabel("");
		lblJugador10.setBounds(705, 87, 85, 26);
		contentPane.add(lblJugador10);
		
		JLabel lblJugador11 = new JLabel("");
		lblJugador11.setBounds(705, 150, 85, 26);
		contentPane.add(lblJugador11);
		
		JLabel lblJugador12 = new JLabel("");
		lblJugador12.setBounds(705, 217, 85, 26);
		contentPane.add(lblJugador12);
		
		JLabel lblJugador13 = new JLabel("");
		lblJugador13.setBounds(705, 284, 85, 26);
		contentPane.add(lblJugador13);
		
		JLabel lblJugador14 = new JLabel("");
		lblJugador14.setBounds(705, 351, 85, 26);
		contentPane.add(lblJugador14);
		
		JLabel lblJugador15 = new JLabel("");
		lblJugador15.setBounds(705, 420, 85, 26);
		contentPane.add(lblJugador15);
		
		JLabel lblJugador16 = new JLabel("");
		lblJugador16.setBounds(705, 485, 85, 26);
		contentPane.add(lblJugador16);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenEliminacionDirecta Tabla.jpg"));
		label.setBounds(0, 0, 800, 527);
		contentPane.add(label);
	}
}
