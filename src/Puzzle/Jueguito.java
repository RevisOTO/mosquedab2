package Puzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jueguito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jueguito frame = new Jueguito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jueguito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		 
		
		JButton btnButton1 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1, -360, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1, 74, SpringLayout.WEST, contentPane);
		contentPane.add(btnButton1);
		
		JButton btnButton2 = new JButton("2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton2, 0, SpringLayout.NORTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton2, 6, SpringLayout.EAST, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton2, 0, SpringLayout.SOUTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton2, -285, SpringLayout.EAST, contentPane);
		contentPane.add(btnButton2);
		
		JButton btnButton3 = new JButton("3");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton3, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton3, 6, SpringLayout.EAST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton3, -360, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton3, -200, SpringLayout.EAST, contentPane);
		contentPane.add(btnButton3);
		
		JButton btnButton4 = new JButton("4");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton4, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton4, 6, SpringLayout.EAST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton4, -360, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton4, -115, SpringLayout.EAST, contentPane);
		contentPane.add(btnButton4);
		
		JButton btnButton5 = new JButton("5");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton5, 0, SpringLayout.NORTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton5, 6, SpringLayout.EAST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton5, 0, SpringLayout.SOUTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton5, -35, SpringLayout.EAST, contentPane);
		contentPane.add(btnButton5);
		
		JButton btnButton6 = new JButton("6");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton6, 6, SpringLayout.SOUTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton6, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton6, -283, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton6, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton6);
		
		JButton btnButton7 = new JButton("7");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton7, 0, SpringLayout.NORTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton7, 0, SpringLayout.WEST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton7, 0, SpringLayout.SOUTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton7, 0, SpringLayout.EAST, btnButton2);
		contentPane.add(btnButton7);
		
		JButton btnButton8 = new JButton("8");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton8, 6, SpringLayout.SOUTH, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton8, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton8, 0, SpringLayout.SOUTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton8, 0, SpringLayout.EAST, btnButton3);
		contentPane.add(btnButton8);
		
		JButton btnButton9 = new JButton("9");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton9, 6, SpringLayout.SOUTH, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton9, 0, SpringLayout.WEST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton9, 0, SpringLayout.SOUTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton9, 0, SpringLayout.EAST, btnButton4);
		contentPane.add(btnButton9);
		
		JButton btnButton10 = new JButton("10");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton10, 6, SpringLayout.SOUTH, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton10, 0, SpringLayout.WEST, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton10, 0, SpringLayout.SOUTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton10, 0, SpringLayout.EAST, btnButton5);
		contentPane.add(btnButton10);
		
		JButton btnButton11 = new JButton("11");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton11, 6, SpringLayout.SOUTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton11, 0, SpringLayout.WEST, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton11, -211, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton11, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton11);
		
		JButton btnButton12 = new JButton("12");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton12, 6, SpringLayout.SOUTH, btnButton7);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton12, 0, SpringLayout.WEST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton12, -211, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton12, -285, SpringLayout.EAST, contentPane);
		contentPane.add(btnButton12);
		
		JButton btnButton13 = new JButton("13");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton13, 6, SpringLayout.SOUTH, btnButton7);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton13, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton13, -211, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton13, 165, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton13);
		
		JButton btnButton14 = new JButton("14");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton14, 6, SpringLayout.SOUTH, btnButton9);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton14, 0, SpringLayout.WEST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton14, 0, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton14, 0, SpringLayout.EAST, btnButton4);
		contentPane.add(btnButton14);
		
		JButton btnButton15 = new JButton("15");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton15, 6, SpringLayout.SOUTH, btnButton10);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton15, 0, SpringLayout.WEST, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton15, 0, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton15, 0, SpringLayout.EAST, btnButton5);
		contentPane.add(btnButton15);
		
		JButton btnButton16 = new JButton("16");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton16, 6, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton16, 0, SpringLayout.WEST, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton16, 72, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton16, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton16);
		
		JButton btnButton17 = new JButton("17");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton17, 6, SpringLayout.SOUTH, btnButton12);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton17, 0, SpringLayout.WEST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton17, 0, SpringLayout.SOUTH, btnButton16);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton17, 0, SpringLayout.EAST, btnButton2);
		contentPane.add(btnButton17);
		
		JButton btnButton18 = new JButton("18");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton18, 6, SpringLayout.SOUTH, btnButton13);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton18, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton18, 0, SpringLayout.SOUTH, btnButton16);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton18, 0, SpringLayout.EAST, btnButton3);
		contentPane.add(btnButton18);
		
		JButton btnButton19 = new JButton("19");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton19, 6, SpringLayout.SOUTH, btnButton14);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton19, 0, SpringLayout.WEST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton19, 0, SpringLayout.SOUTH, btnButton16);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton19, 0, SpringLayout.EAST, btnButton4);
		contentPane.add(btnButton19);
		
		JButton btnButton20 = new JButton("20");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton20, 6, SpringLayout.SOUTH, btnButton15);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton20, 0, SpringLayout.WEST, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton20, 72, SpringLayout.SOUTH, btnButton15);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton20, 0, SpringLayout.EAST, btnButton5);
		contentPane.add(btnButton20);
		
		JButton btnButton21 = new JButton("21");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton21, 6, SpringLayout.SOUTH, btnButton16);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton21, 0, SpringLayout.WEST, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton21, 72, SpringLayout.SOUTH, btnButton16);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton21, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton21);
		
		JButton btnButton22 = new JButton("22");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton22, 6, SpringLayout.SOUTH, btnButton17);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton22, 0, SpringLayout.WEST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton22, 0, SpringLayout.SOUTH, btnButton21);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton22, 0, SpringLayout.EAST, btnButton2);
		contentPane.add(btnButton22);
		
		JButton btnButton23 = new JButton("23");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton23, 6, SpringLayout.SOUTH, btnButton18);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton23, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton23, 0, SpringLayout.SOUTH, btnButton21);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton23, 0, SpringLayout.EAST, btnButton3);
		contentPane.add(btnButton23);
		
		JButton btnButton24 = new JButton("24");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton24, 6, SpringLayout.SOUTH, btnButton19);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton24, 0, SpringLayout.WEST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton24, 0, SpringLayout.SOUTH, btnButton21);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton24, 0, SpringLayout.EAST, btnButton4);
		contentPane.add(btnButton24);
		
		JButton btnButton25 = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton25, 6, SpringLayout.SOUTH, btnButton20);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton25, 0, SpringLayout.WEST, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton25, 0, SpringLayout.SOUTH, btnButton21);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton25, 0, SpringLayout.EAST, btnButton5);
		contentPane.add(btnButton25);
		
		JButton btnIniciar = new JButton("Jugar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int x = 0; x==24; x++)
				{
					JButton BotonAuxiliar = new JButton();
					ArrayJButtons[x] = BotonAuxiliar;
				}
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIniciar, 6, SpringLayout.SOUTH, btnButton22);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnIniciar, 139, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnIniciar, 29, SpringLayout.EAST, btnButton3);
		contentPane.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSalir, 6, SpringLayout.SOUTH, btnIniciar);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSalir, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSalir, -6, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSalir, -188, SpringLayout.EAST, contentPane);
		contentPane.add(btnSalir);
		public JButton[] ArrayJButtons = {btnButton1,btnButton2,btnButton3,btnButton4,btnButton5,btnButton6,btnButton7,btnButton8,btnButton9,btnButton10,btnButton11,btnButton12,btnButton13,btnButton14,btnButton15,btnButton16,btnButton17,btnButton18,btnButton19,btnButton20,btnButton21,btnButton22,btnButton23,btnButton24,btnButton25};
	}
	public int RandomNum()
	{
		Random Alazar = new Random();
		int upperbound = 25;
		return Alazar.nextInt(upperbound);
	}
	
}
