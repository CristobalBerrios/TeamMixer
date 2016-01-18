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

public class VentanaEliminacionDirecta extends JFrame {

	private JPanel contentPane;
	private JLabel jugador[] = new JLabel[30];
	private JButton btn01 = new JButton("");
	private JButton btn02 = new JButton("");
	private JButton btn03 = new JButton("");
	private JButton btn04 = new JButton("");
	private JButton btn05 = new JButton("");
	private JButton btn06 = new JButton("");
	private JButton btn07 = new JButton("");
	private JButton btn08 = new JButton("");
	private JButton btn09 = new JButton("");
	private JButton btn10 = new JButton("");
	private JButton btn11 = new JButton("");
	private JButton btn12 = new JButton("");
	private JButton btn13 = new JButton("");
	private JButton btn14 = new JButton("");
    private JButton btn15 = new JButton("");
    private JButton btn16 = new JButton("");
    private JButton btn17 = new JButton("");
    private JButton btn18 = new JButton("");
    private JButton btn19 = new JButton("");
    private JButton btn20 = new JButton("");
    private JButton btn21 = new JButton("");
    private JButton btn22 = new JButton("");
    private JButton btn23 = new JButton("");
    private JButton btn24 = new JButton("");
    private JButton btn25 = new JButton("");
    private JButton btn26 = new JButton("");
    private JButton btn27 = new JButton("");
    private JButton btn28 = new JButton("");
    private JButton btn29 = new JButton("");
    private JButton btn30 = new JButton("");
	private JLabel lblGanador = new JLabel("");
	private JButton button;
	
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
		jugador[8].setBounds(707, 16, 85, 26);
		jugador[9].setBounds(707, 87, 85, 26);
		jugador[10].setBounds(707, 150, 85, 26);
		jugador[11].setBounds(707, 217, 85, 26);
		jugador[12].setBounds(707, 284, 85, 26);
		jugador[13].setBounds(707, 351, 85, 26);
		jugador[14].setBounds(707, 420, 85, 26);
		jugador[15].setBounds(707, 485, 85, 26);
		jugador[16].setBounds(121, 57, 85, 26);
		jugador[17].setBounds(121, 188, 85, 26);
		jugador[18].setBounds(121, 321, 85, 26);
		jugador[19].setBounds(121, 455, 85, 26);
		jugador[20].setBounds(600, 57, 85, 26);
		jugador[21].setBounds(600, 188, 85, 26);
		jugador[22].setBounds(600, 321, 85, 26);
		jugador[23].setBounds(600, 455, 85, 26);
		jugador[24].setBounds(222, 123, 85, 26);
		jugador[25].setBounds(222, 393, 85, 26);
		jugador[26].setBounds(501, 123, 85, 26);
		jugador[27].setBounds(501, 393, 85, 26);
		jugador[28].setBounds(274, 261, 85, 26);
		jugador[29].setBounds(445, 258, 85, 26);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal principal = new VentanaPrincipal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		button.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\Boton finalizar campeonato2.jpg"));
		button.setBounds(333, 460, 152, 37);
		contentPane.add(button);
		
		
		
		lblGanador.setBounds(362, 201, 85, 26);
		contentPane.add(lblGanador);
		
		
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[16].setText(jugador[0].getText());
				btn01.setVisible(false);
				btn02.setVisible(false);
				if(jugador[17].getText().equals("")){
			
				}
				else{
					contentPane.add(btn17);
					contentPane.add(btn18);
				}
				
			}
		});
		btn01.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn01.setBounds(80, 16, 14, 14);
		
		
		
		btn02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[16].setText(jugador[1].getText());
				btn02.setVisible(false);
				btn01.setVisible(false);
				if(jugador[17].getText().equals("")){
					
				}
				else{
					contentPane.add(btn17);
					contentPane.add(btn18);
				}
				
			}
		});
		btn02.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn02.setBounds(80, 87, 14, 14);
		
		
		
		btn03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[16].setText(jugador[2].getText());
				btn03.setVisible(false);
				btn04.setVisible(false);
				if(jugador[18].getText().equals("")){
					
				}
				else{
					contentPane.add(btn17);
					contentPane.add(btn18);
				}
			}
		});
		btn03.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn03.setBounds(80, 150, 14, 14);
		
		
		
		btn04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[16].setText(jugador[3].getText());
				btn03.setVisible(false);
				btn04.setVisible(false);
				
				if(jugador[18].getText().equals("")){
					
				}
				else{
					contentPane.add(btn17);
					contentPane.add(btn18);
				}
			}
		});
		btn04.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn04.setBounds(80, 219, 14, 14);
		
		
		
		btn05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[18].setText(jugador[4].getText());
				btn05.setVisible(false);
				btn06.setVisible(false);
				if(jugador[19].getText().equals("")){
					
				}
				else{
					contentPane.add(btn19);
					contentPane.add(btn20);
				}
			}
		});
		btn05.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn05.setBounds(80, 284, 14, 14);
		
		
		
		btn06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[18].setText(jugador[5].getText());
				btn05.setVisible(false);
				btn06.setVisible(false);
                if(jugador[19].getText().equals("")){
					
				}
				else{
					contentPane.add(btn19);
					contentPane.add(btn20);
				}
			}
		});
		btn06.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn06.setBounds(80, 351, 14, 14);
		
		
		
		btn07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[19].setText(jugador[6].getText());
				btn07.setVisible(false);
				btn08.setVisible(false);
                if(jugador[18].getText().equals("")){
					
				}
				else{
					contentPane.add(btn19);
					contentPane.add(btn20);
				}
			}
		});
		btn07.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn07.setBounds(80, 419, 14, 14);
		
		
		
		btn08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[19].setText(jugador[7].getText());
				btn07.setVisible(false);
				btn08.setVisible(false);
                if(jugador[18].getText().equals("")){
					
				}
				else{
					contentPane.add(btn19);
					contentPane.add(btn20);
				}
			}
		});
		btn08.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn08.setBounds(80, 487, 14, 14);
		
		
		
		btn09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[20].setText(jugador[8].getText());
				btn09.setVisible(false);
				btn10.setVisible(false);
                if(jugador[21].getText().equals("")){
					
				}
				else{
					contentPane.add(btn21);
					contentPane.add(btn22);
				}
			}
		});
		btn09.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn09.setBounds(776, 15, 14, 14);
		
		
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[20].setText(jugador[9].getText());
				btn09.setVisible(false);
				btn10.setVisible(false);
                if(jugador[21].getText().equals("")){
					
				}
				else{
					contentPane.add(btn21);
					contentPane.add(btn22);
				}
			}
		});
		btn10.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn10.setBounds(775, 86, 14, 14);
		
		
		
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[21].setText(jugador[10].getText());
				btn11.setVisible(false);
				btn12.setVisible(false);
                if(jugador[20].getText().equals("")){
					
				}
				else{
					contentPane.add(btn21);
					contentPane.add(btn22);
				}
			}
		});
		btn11.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn11.setBounds(775, 149, 14, 14);
		
		
		
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[21].setText(jugador[11].getText());
				btn11.setVisible(false);
				btn12.setVisible(false);
                if(jugador[20].getText().equals("")){
					
				}
				else{
					contentPane.add(btn21);
					contentPane.add(btn22);
				}
			}
		});
		btn12.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn12.setBounds(775, 218, 14, 14);
		
		
		
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[22].setText(jugador[12].getText());
				btn13.setVisible(false);
				btn14.setVisible(false);
                if(jugador[23].getText().equals("")){
					
				}
				else{
					contentPane.add(btn23);
					contentPane.add(btn24);
				}
			}
		});
		btn13.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn13.setBounds(775, 283, 14, 14);
		
		
		
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[22].setText(jugador[13].getText());
				btn13.setVisible(false);
				btn14.setVisible(false);
                if(jugador[23].getText().equals("")){
					
				}
				else{
					contentPane.add(btn23);
					contentPane.add(btn24);
				}
			}
		});
		btn14.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn14.setBounds(775, 350, 14, 14);
		
		
		
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[23].setText(jugador[14].getText());
				btn15.setVisible(false);
				btn16.setVisible(false);
                if(jugador[22].getText().equals("")){
					
				}
				else{
					contentPane.add(btn23);
					contentPane.add(btn24);
				}
			}
		});
		btn15.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn15.setBounds(775, 418, 14, 14);
		
		
		
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[23].setText(jugador[15].getText());
				btn15.setVisible(false);
				btn16.setVisible(false);
                if(jugador[22].getText().equals("")){
					
				}
				else{
					contentPane.add(btn23);
					contentPane.add(btn24);
				}
			}
		});
		btn16.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn16.setBounds(775, 486, 14, 14);
		
		
		
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[24].setText(jugador[16].getText());
				btn17.setVisible(false);
				btn18.setVisible(false);
                if(jugador[25].getText().equals("")){
					
				}
				else{
					contentPane.add(btn25);
					contentPane.add(btn26);
				}
				
			}
		});
		btn17.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn17.setBounds(189, 57, 14, 14);
		
		
		
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[24].setText(jugador[17].getText());
				btn17.setVisible(false);
				btn18.setVisible(false);
                if(jugador[25].getText().equals("")){
					
				}
				else{
					contentPane.add(btn25);
					contentPane.add(btn26);
				}
			}
		});
		btn18.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn18.setBounds(189, 188, 14, 14);
		
		
		
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[25].setText(jugador[18].getText());
				btn19.setVisible(false);
				btn20.setVisible(false);
                if(jugador[24].getText().equals("")){
					
				}
				else{
					contentPane.add(btn25);
					contentPane.add(btn26);
				}
			}
		});
		btn19.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn19.setBounds(189, 321, 14, 14);
		
		
		
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[25].setText(jugador[19].getText());
				btn19.setVisible(false);
				btn20.setVisible(false);
                if(jugador[24].getText().equals("")){
					
				}
				else{
					contentPane.add(btn25);
					contentPane.add(btn26);
				}
			}
		});
		btn20.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn20.setBounds(189, 455, 14, 14);
		
		
		
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[26].setText(jugador[20].getText());
				btn21.setVisible(false);
				btn22.setVisible(false);
                if(jugador[27].getText().equals("")){
					
				}
				else{
					contentPane.add(btn27);
					contentPane.add(btn28);
				}
			}
		});
		btn21.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn21.setBounds(668, 57, 14, 14);
		
		
		
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[26].setText(jugador[21].getText());
				btn21.setVisible(false);
				btn22.setVisible(false);
                if(jugador[27].getText().equals("")){
					
				}
				else{
					contentPane.add(btn27);
					contentPane.add(btn28);
				}
			}
		});
		btn22.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn22.setBounds(668, 188, 14, 14);
		
		
		
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[27].setText(jugador[22].getText());
				btn23.setVisible(false);
				btn24.setVisible(false);
                if(jugador[26].getText().equals("")){
					
				}
				else{
					contentPane.add(btn27);
					contentPane.add(btn28);
				}
			}
		});
		btn23.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn23.setBounds(668, 321, 14, 14);
		
		
		
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[27].setText(jugador[23].getText());
				btn23.setVisible(false);
				btn24.setVisible(false);
                if(jugador[26].getText().equals("")){
					
				}
				else{
					contentPane.add(btn27);
					contentPane.add(btn28);
				}
			}
		});
		btn24.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn24.setBounds(668, 455, 14, 14);
		
		
		
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[28].setText(jugador[24].getText());
				btn25.setVisible(false);
				btn26.setVisible(false);
                if(jugador[29].getText().equals("")){
					
				}
				else{
					contentPane.add(btn29);
					contentPane.add(btn30);
				}
			}
		});
		btn25.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn25.setBounds(289, 123, 14, 14);
		
		
		
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[28].setText(jugador[25].getText());
				btn25.setVisible(false);
				btn26.setVisible(false);
                if(jugador[29].getText().equals("")){
					
				}
				else{
					contentPane.add(btn29);
					contentPane.add(btn30);
				}
			}
		});
		btn26.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn26.setBounds(289, 393, 14, 14);
		
		
		
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[29].setText(jugador[26].getText());
				btn27.setVisible(false);
				btn28.setVisible(false);
                if(jugador[28].getText().equals("")){
					
				}
				else{
					contentPane.add(btn29);
					contentPane.add(btn30);
				}
			}
		});
		btn27.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn27.setBounds(568, 123, 14, 14);
		
		
		
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador[29].setText(jugador[27].getText());
				btn27.setVisible(false);
				btn28.setVisible(false);
                if(jugador[28].getText().equals("")){
					
				}
				else{
					contentPane.add(btn29);
					contentPane.add(btn30);
				}
			}
		});
		btn28.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn28.setBounds(568, 393, 14, 14);
		
		
		
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblGanador.setText(jugador[28].getText());
				btn29.setVisible(false);
				btn30.setVisible(false);
			}
		});
		btn29.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn29.setBounds(341, 260, 14, 14);
		
		
		
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblGanador.setText(jugador[29].getText());
				btn29.setVisible(false);
				btn30.setVisible(false);
			}
		});
		btn30.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\boton Ganador.jpg"));
		btn30.setBounds(512, 258, 14, 14);
		
		
		
		
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\Respaldo\\TeamMixer\\Imagenes\\ImagenEliminacionDirecta Tabla.jpg"));
		label.setBounds(0, 0, 800, 527);
		contentPane.add(label);
	}
	
	public void setJugador(int i,String nombre){
		jugador[i].setText(nombre);
	}
	
	public void mostrarBotones(int i){
		if(i==16){
			contentPane.add(btn01);
			contentPane.add(btn02);
			contentPane.add(btn03);
			contentPane.add(btn04);
			contentPane.add(btn05);
			contentPane.add(btn06);
			contentPane.add(btn07);
			contentPane.add(btn08);
			contentPane.add(btn09);
			contentPane.add(btn10);
			contentPane.add(btn11);
			contentPane.add(btn12);
			contentPane.add(btn13);
			contentPane.add(btn14);
			contentPane.add(btn15);
			contentPane.add(btn16);
		}
		
		if(i==8){
			contentPane.add(btn17);
			contentPane.add(btn18);
			contentPane.add(btn19);
			contentPane.add(btn20);
			contentPane.add(btn21);
			contentPane.add(btn22);
			contentPane.add(btn23);
			contentPane.add(btn24);
		}
		
		if(i==4){
			contentPane.add(btn25);
			contentPane.add(btn26);
			contentPane.add(btn27);
			contentPane.add(btn28);
		}
		
		if(i==2){
			contentPane.add(btn29);
			contentPane.add(btn30);
		}
	}
}
