package fiboforma;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.naming.CompositeName;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.Window.Type;

public class Fibonacci extends JFrame {
	int x,y,z,v3;
	int v1 = 0;
	int v2 = 1;
	String Texto = "";
	private JPanel contentPane;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
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
	public Fibonacci() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(new Rectangle(89, 256, 249, 21));
		contentPane.add(btnCalcular);
		
		textField = new JTextField();
		textField.setBounds(new Rectangle(100, 68, 213, 143));
		contentPane.add(textField);
		textField.setColumns(10);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText() != "")
				{
					x = Integer.parseInt(textField.getText());
					JOptionPane.showMessageDialog(null, "Valores iniciales 0,1","Resultado", JOptionPane.INFORMATION_MESSAGE);
					do
			        {
			        y = y+1;
			        v3 = v1 + v2;
			        JOptionPane.showMessageDialog(null, "Iteracion "+ y +" Valor "+ v3, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			        v1=v2;
			        v2=v3;
			        
			        }
			        while(y < x);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios", "Error", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

	}

}
