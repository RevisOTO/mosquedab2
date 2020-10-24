package Puzzle;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Ref;

public class Jueguito extends JFrame {

	private JPanel contentPane;
	private JButton btnIniciar;

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
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton2, 15, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton2, 80, SpringLayout.WEST, contentPane);
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
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton2, -6, SpringLayout.NORTH, btnButton6);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton6, 6, SpringLayout.SOUTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton6, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton6, -283, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton6, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton6);
		
		JButton btnButton7 = new JButton("7");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton7, 6, SpringLayout.SOUTH, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton7, 0, SpringLayout.WEST, btnButton2);
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
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton7, -6, SpringLayout.NORTH, btnButton11);
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
		JButton[] ArrayJButtons = {btnButton1,btnButton2,btnButton3,btnButton4,btnButton5,btnButton6,btnButton7,btnButton8,btnButton9,btnButton10,btnButton11,btnButton12,btnButton13,btnButton14,btnButton15,btnButton16,btnButton17,btnButton18,btnButton19,btnButton20,btnButton21,btnButton22,btnButton23,btnButton24,btnButton25};
		for (JButton b : ArrayJButtons) {
		    b.setEnabled(false);
		}
		btnIniciar = new JButton("Jugar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnIniciar, 6, SpringLayout.SOUTH, btnButton21);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnIniciar, 139, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnIniciar, -171, SpringLayout.EAST, contentPane);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(true);
				}
				for(int x = 0; x<=24; x++)
				{
					ArrayJButtons[x].setText("");
				}
				RandomNum();
				for(int y = 0; y<=23; y++)
				{
					ArrayJButtons[y].setText(Integer.toString(array[y]));
				}
				btnIniciar.setEnabled(false);
				JButton[] ArrayJButtons25 = {btnButton1,btnButton2,btnButton3,btnButton4,btnButton5,btnButton6,btnButton7,btnButton8,btnButton9,btnButton10,btnButton11,btnButton12,btnButton13,btnButton14,btnButton15,btnButton16,btnButton17,btnButton18,btnButton19,btnButton21,btnButton22,btnButton23,btnButton25};
				for (JButton b : ArrayJButtons25) {
				    b.setEnabled(false);}
			}
		});
		
		
		contentPane.add(btnIniciar);
		
		JButton btnSalir = new JButton("Salir");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnSalir, 160, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnSalir, -188, SpringLayout.EAST, contentPane);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int O = JOptionPane.showInternalConfirmDialog(null, "¿Estas seguro de que quieres salir?","¿Seguro?", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION);
				if(O == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnSalir, 6, SpringLayout.SOUTH, btnIniciar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnSalir, -6, SpringLayout.SOUTH, contentPane);
		contentPane.add(btnSalir);
		
		btnButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton2.setEnabled(true);
				btnButton6.setEnabled(true);
				if(btnButton2.getText() == "") 
				{
					btnButton2.setText(btnButton1.getText());
					btnButton1.setText("");
				}
				if(btnButton6.getText() == "")
				{
					btnButton6.setText(btnButton1.getText());
					btnButton1.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton3.setEnabled(true);
				btnButton7.setEnabled(true);
				btnButton1.setEnabled(true);
				if(btnButton3.getText() == "") 
				{
					btnButton3.setText(btnButton2.getText());
					btnButton2.setText("");
				}
				if(btnButton7.getText() == "")
				{
					btnButton7.setText(btnButton2.getText());
					btnButton2.setText("");
				}
				if(btnButton1.getText() == "")
				{
					btnButton1.setText(btnButton2.getText());
					btnButton2.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton4.setEnabled(true);
				btnButton8.setEnabled(true);
				btnButton2.setEnabled(true);
				if(btnButton4.getText() == "") 
				{
					btnButton4.setText(btnButton3.getText());
					btnButton3.setText("");
				}
				if(btnButton8.getText() == "")
				{
					btnButton8.setText(btnButton3.getText());
					btnButton3.setText("");
				}
				if(btnButton2.getText() == "")
				{
					btnButton2.setText(btnButton3.getText());
					btnButton3.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton5.setEnabled(true);
				btnButton9.setEnabled(true);
				btnButton3.setEnabled(true);
				if(btnButton5.getText() == "") 
				{
					btnButton5.setText(btnButton4.getText());
					btnButton4.setText("");
				}
				if(btnButton9.getText() == "")
				{
					btnButton9.setText(btnButton4.getText());
					btnButton4.setText("");
				}
				if(btnButton3.getText() == "")
				{
					btnButton3.setText(btnButton4.getText());
					btnButton4.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton10.setEnabled(true);
				btnButton4.setEnabled(true);
				if(btnButton10.getText() == "") 
				{
					btnButton10.setText(btnButton5.getText());
					btnButton5.setText("");
				}
				if(btnButton4.getText() == "")
				{
					btnButton4.setText(btnButton5.getText());
					btnButton5.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton7.setEnabled(true);
				btnButton11.setEnabled(true);
				btnButton1.setEnabled(true);
				if(btnButton7.getText() == "") 
				{
					btnButton7.setText(btnButton6.getText());
					btnButton6.setText("");
				}
				if(btnButton11.getText() == "")
				{
					btnButton11.setText(btnButton6.getText());
					btnButton6.setText("");
				}
				if(btnButton1.getText() == "")
				{
					btnButton1.setText(btnButton6.getText());
					btnButton6.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton8.setEnabled(true);
				btnButton12.setEnabled(true);
				btnButton6.setEnabled(true);
				btnButton2.setEnabled(true);
				if(btnButton8.getText() == "") 
				{
					btnButton8.setText(btnButton7.getText());
					btnButton7.setText("");
				}
				if(btnButton12.getText() == "")
				{
					btnButton12.setText(btnButton7.getText());
					btnButton7.setText("");
				}
				if(btnButton6.getText() == "")
				{
					btnButton6.setText(btnButton7.getText());
					btnButton7.setText("");
				}
				if(btnButton2.getText() == "")
				{
					btnButton2.setText(btnButton7.getText());
					btnButton7.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton9.setEnabled(true);
				btnButton13.setEnabled(true);
				btnButton7.setEnabled(true);
				btnButton3.setEnabled(true);
				if(btnButton9.getText() == "") 
				{
					btnButton9.setText(btnButton8.getText());
					btnButton8.setText("");
				}
				if(btnButton13.getText() == "")
				{
					btnButton13.setText(btnButton8.getText());
					btnButton8.setText("");
				}
				if(btnButton7.getText() == "")
				{
					btnButton7.setText(btnButton8.getText());
					btnButton8.setText("");
				}
				if(btnButton3.getText() == "")
				{
					btnButton3.setText(btnButton8.getText());
					btnButton8.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
			});
		btnButton9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton10.setEnabled(true);
				btnButton14.setEnabled(true);
				btnButton8.setEnabled(true);
				btnButton4.setEnabled(true);
				if(btnButton10.getText() == "") 
				{
					btnButton10.setText(btnButton9.getText());
					btnButton9.setText("");
				}
				if(btnButton14.getText() == "")
				{
					btnButton14.setText(btnButton9.getText());
					btnButton9.setText("");
				}
				if(btnButton8.getText() == "")
				{
					btnButton8.setText(btnButton9.getText());
					btnButton9.setText("");
				}
				if(btnButton4.getText() == "")
				{
					btnButton4.setText(btnButton9.getText());
					btnButton9.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton15.setEnabled(true);
				btnButton9.setEnabled(true);
				btnButton5.setEnabled(true);
				if(btnButton15.getText() == "") 
				{
					btnButton15.setText(btnButton10.getText());
					btnButton10.setText("");
				}
				if(btnButton9.getText() == "")
				{
					btnButton9.setText(btnButton10.getText());
					btnButton10.setText("");
				}
				if(btnButton5.getText() == "")
				{
					btnButton5.setText(btnButton10.getText());
					btnButton10.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton12.setEnabled(true);
				btnButton16.setEnabled(true);
				btnButton6.setEnabled(true);
				if(btnButton12.getText() == "") 
				{
					btnButton12.setText(btnButton11.getText());
					btnButton11.setText("");
				}
				if(btnButton6.getText() == "")
				{
					btnButton6.setText(btnButton11.getText());
					btnButton11.setText("");
				}
				if(btnButton16.getText() == "")
				{
					btnButton16.setText(btnButton11.getText());
					btnButton11.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton13.setEnabled(true);
				btnButton17.setEnabled(true);
				btnButton11.setEnabled(true);
				btnButton7.setEnabled(true);
				if(btnButton13.getText() == "") 
				{
					btnButton13.setText(btnButton12.getText());
					btnButton12.setText("");
				}
				if(btnButton17.getText() == "")
				{
					btnButton17.setText(btnButton12.getText());
					btnButton12.setText("");
				}
				if(btnButton11.getText() == "")
				{
					btnButton11.setText(btnButton12.getText());
					btnButton12.setText("");
				}
				if(btnButton7.getText() == "")
				{
					btnButton7.setText(btnButton12.getText());
					btnButton12.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton14.setEnabled(true);
				btnButton18.setEnabled(true);
				btnButton12.setEnabled(true);
				btnButton8.setEnabled(true);
				if(btnButton14.getText() == "") 
				{
					btnButton14.setText(btnButton13.getText());
					btnButton13.setText("");
				}
				if(btnButton18.getText() == "")
				{
					btnButton18.setText(btnButton13.getText());
					btnButton13.setText("");
				}
				if(btnButton12.getText() == "")
				{
					btnButton12.setText(btnButton13.getText());
					btnButton13.setText("");
				}
				if(btnButton8.getText() == "")
				{
					btnButton8.setText(btnButton13.getText());
					btnButton13.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton15.setEnabled(true);
				btnButton19.setEnabled(true);
				btnButton13.setEnabled(true);
				btnButton9.setEnabled(true);
				if(btnButton15.getText() == "") 
				{
					btnButton15.setText(btnButton14.getText());
					btnButton14.setText("");
				}
				if(btnButton19.getText() == "")
				{
					btnButton19.setText(btnButton14.getText());
					btnButton14.setText("");
				}
				if(btnButton13.getText() == "")
				{
					btnButton13.setText(btnButton14.getText());
					btnButton14.setText("");
				}
				if(btnButton9.getText() == "")
				{
					btnButton9.setText(btnButton14.getText());
					btnButton14.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton20.setEnabled(true);
				btnButton14.setEnabled(true);
				btnButton10.setEnabled(true);
				if(btnButton20.getText() == "") 
				{
					btnButton20.setText(btnButton15.getText());
					btnButton15.setText("");
				}
				if(btnButton14.getText() == "")
				{
					btnButton14.setText(btnButton15.getText());
					btnButton15.setText("");
				}
				if(btnButton10.getText() == "")
				{
					btnButton10.setText(btnButton15.getText());
					btnButton15.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton17.setEnabled(true);
				btnButton21.setEnabled(true);
				btnButton11.setEnabled(true);
				if(btnButton17.getText() == "") 
				{
					btnButton17.setText(btnButton16.getText());
					btnButton16.setText("");
				}
				if(btnButton21.getText() == "")
				{
					btnButton21.setText(btnButton16.getText());
					btnButton16.setText("");
				}
				if(btnButton11.getText() == "")
				{
					btnButton11.setText(btnButton16.getText());
					btnButton16.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton18.setEnabled(true);
				btnButton22.setEnabled(true);
				btnButton16.setEnabled(true);
				btnButton12.setEnabled(true);
				if(btnButton18.getText() == "") 
				{
					btnButton18.setText(btnButton17.getText());
					btnButton17.setText("");
				}
				if(btnButton22.getText() == "")
				{
					btnButton22.setText(btnButton17.getText());
					btnButton17.setText("");
				}
				if(btnButton16.getText() == "")
				{
					btnButton16.setText(btnButton17.getText());
					btnButton17.setText("");
				}
				if(btnButton12.getText() == "")
				{
					btnButton12.setText(btnButton17.getText());
					btnButton17.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton19.setEnabled(true);
				btnButton23.setEnabled(true);
				btnButton17.setEnabled(true);
				btnButton13.setEnabled(true);
				if(btnButton19.getText() == "") 
				{
					btnButton19.setText(btnButton18.getText());
					btnButton18.setText("");
				}
				if(btnButton23.getText() == "")
				{
					btnButton23.setText(btnButton18.getText());
					btnButton18.setText("");
				}
				if(btnButton17.getText() == "")
				{
					btnButton17.setText(btnButton18.getText());
					btnButton18.setText("");
				}
				if(btnButton13.getText() == "")
				{
					btnButton13.setText(btnButton18.getText());
					btnButton18.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton19.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton24.setEnabled(true);
				btnButton20.setEnabled(true);
				btnButton14.setEnabled(true);
				btnButton18.setEnabled(true);
				if(btnButton24.getText() == "") 
				{
					btnButton24.setText(btnButton19.getText());
					btnButton19.setText("");
				}
				if(btnButton20.getText() == "")
				{
					btnButton20.setText(btnButton19.getText());
					btnButton19.setText("");
				}
				if(btnButton14.getText() == "")
				{
					btnButton14.setText(btnButton19.getText());
					btnButton19.setText("");
				}
				if(btnButton18.getText() == "")
				{
					btnButton18.setText(btnButton19.getText());
					btnButton19.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton20.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton25.setEnabled(true);
				btnButton19.setEnabled(true);
				btnButton15.setEnabled(true);
				if(btnButton25.getText() == "") 
				{
					btnButton25.setText(btnButton20.getText());
					btnButton20.setText("");
				}
				if(btnButton19.getText() == "")
				{
					btnButton19.setText(btnButton20.getText());
					btnButton20.setText("");
				}
				if(btnButton15.getText() == "")
				{
					btnButton15.setText(btnButton20.getText());
					btnButton20.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton22.setEnabled(true);
				btnButton16.setEnabled(true);
				if(btnButton22.getText() == "") 
				{
					btnButton22.setText(btnButton21.getText());
					btnButton21.setText("");
				}
				if(btnButton16.getText() == "")
				{
					btnButton16.setText(btnButton21.getText());
					btnButton21.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton23.setEnabled(true);
				btnButton17.setEnabled(true);
				btnButton21.setEnabled(true);
				if(btnButton23.getText() == "") 
				{
					btnButton23.setText(btnButton22.getText());
					btnButton22.setText("");
				}
				if(btnButton17.getText() == "")
				{
					btnButton17.setText(btnButton22.getText());
					btnButton22.setText("");
				}
				if(btnButton21.getText() == "")
				{
					btnButton21.setText(btnButton22.getText());
					btnButton22.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton24.setEnabled(true);
				btnButton18.setEnabled(true);
				btnButton22.setEnabled(true);
				if(btnButton24.getText() == "") 
				{
					btnButton24.setText(btnButton23.getText());
					btnButton23.setText("");
				}
				if(btnButton18.getText() == "")
				{
					btnButton18.setText(btnButton23.getText());
					btnButton23.setText("");
				}
				if(btnButton22.getText() == "")
				{
					btnButton22.setText(btnButton23.getText());
					btnButton23.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton25.setEnabled(true);
				btnButton23.setEnabled(true);
				btnButton19.setEnabled(true);
				if(btnButton25.getText() == "") 
				{
					btnButton25.setText(btnButton24.getText());
					btnButton24.setText("");
				}
				if(btnButton23.getText() == "")
				{
					btnButton23.setText(btnButton24.getText());
					btnButton24.setText("");
				}
				if(btnButton19.getText() == "")
				{
					btnButton19.setText(btnButton24.getText());
					btnButton24.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
		btnButton25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JButton b : ArrayJButtons) {
				    b.setEnabled(false);}
				btnButton24.setEnabled(true);
				btnButton20.setEnabled(true);
				if(btnButton24.getText() == "") 
				{
					btnButton24.setText(btnButton25.getText());
					btnButton25.setText("");
				}
				if(btnButton20.getText() == "")
				{
					btnButton20.setText(btnButton25.getText());
					btnButton25.setText("");
				}
				if(btnButton1.getText().equals("1") && btnButton2.getText().equals("2") && btnButton3.getText().equals("3") && btnButton4.getText().equals("4") && btnButton5.getText().equals("5") && btnButton6.getText().equals("6") && btnButton7.getText().equals("7") && btnButton8.getText().equals("8") && btnButton9.getText().equals("9") && btnButton10.getText().equals("10") && btnButton11.getText().equals("11") && btnButton12.getText().equals("12") && btnButton13.getText().equals("13") && btnButton14.getText().equals("14") && btnButton15.getText().equals("15") && btnButton16.getText().equals("16") && btnButton17.getText().equals("17") && btnButton18.getText().equals("18") && btnButton19.getText().equals("19") && btnButton20.getText().equals("20") && btnButton21.getText().equals("21") && btnButton22.getText().equals("22") && btnButton23.getText().equals("23") && btnButton24.getText().equals("24"))
				{
					JOptionPane.showMessageDialog(null, "GANASTEEEEEEEEEEEEE WUUUUUUUUUUU " + btnButton1.getText(),"Felicidades", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			});
	}
	
	
	int[] array = new int[24];
	
	public void RandomNum()
	{
		
		int[] random = new int[24];
		
		for(int x = 0; x < random.length; x++) 
		{
		random[x] = x;
		}
			int rand;
			for(int x = 0; x < random.length; x++) 
		{
		rand = (int)(Math.random()*24);
		
			while(random[rand] == -1) 
			{
				rand = (int)(Math.random()*24);
			}
				
			if(random[rand] != -1) 
			{
				array[x] = random[rand]; 
			}			
			random[rand] = -1; 
		}

		for(int x = 0; x < array.length; x++) 
		{
			array[x] = array[x] + 1;
		}
	}
}