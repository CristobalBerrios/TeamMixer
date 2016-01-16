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

public class VentanaLiga extends JFrame {

	private JPanel contentPane;

	public VentanaLiga() {
		setTitle("TeamMixer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 784, 494);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Principal", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Partidos", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tabla", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Tabla de Posiciones.jpg"));
		label.setBounds(0, 0, 779, 498);
		panel_2.add(label);
		
	}
}
