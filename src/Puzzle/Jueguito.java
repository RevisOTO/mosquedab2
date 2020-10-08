package Puzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

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
		
		JButton btnButton1_1 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1_1, 6, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1_1, 0, SpringLayout.WEST, btnButton1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1_1, 72, SpringLayout.SOUTH, btnButton11);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1_1, 0, SpringLayout.EAST, btnButton1);
		contentPane.add(btnButton1_1);
		
		JButton btnButton1_2 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1_2, 6, SpringLayout.SOUTH, btnButton12);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1_2, 0, SpringLayout.WEST, btnButton2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1_2, 0, SpringLayout.SOUTH, btnButton1_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1_2, 0, SpringLayout.EAST, btnButton2);
		contentPane.add(btnButton1_2);
		
		JButton btnButton1_3 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1_3, 6, SpringLayout.SOUTH, btnButton13);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1_3, 0, SpringLayout.WEST, btnButton3);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1_3, 0, SpringLayout.SOUTH, btnButton1_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1_3, 0, SpringLayout.EAST, btnButton3);
		contentPane.add(btnButton1_3);
		
		JButton btnButton1_4 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1_4, 6, SpringLayout.SOUTH, btnButton14);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1_4, 0, SpringLayout.WEST, btnButton4);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1_4, 0, SpringLayout.SOUTH, btnButton1_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1_4, 0, SpringLayout.EAST, btnButton4);
		contentPane.add(btnButton1_4);
		
		JButton btnButton1_5 = new JButton("1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnButton1_5, 6, SpringLayout.SOUTH, btnButton15);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnButton1_5, 0, SpringLayout.WEST, btnButton5);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnButton1_5, 72, SpringLayout.SOUTH, btnButton15);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnButton1_5, 0, SpringLayout.EAST, btnButton5);
		contentPane.add(btnButton1_5);
	}
}
