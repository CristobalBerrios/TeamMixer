package TeamMixer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Imagen Salir.jpg"));
		btnSalir.setBounds(662, 438, 112, 33);
		contentPane.add(btnSalir);
		
		final Ventana02 ventana02 = new Ventana02();
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Imagen comenzar.jpg"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				ventana02.setVisible(true);
				
			}
		});
		button.setBounds(323, 234, 150, 40);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenPrincipal.jpg"));
		label.setBounds(0, 0, 784, 515);
		contentPane.add(label);
		
		
		
	}
}
