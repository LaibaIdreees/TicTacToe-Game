import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGame extends JFrame {
	 String  playerName1, playerName2;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGame frame = new StartGame();
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
	public StartGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("TIC TAC TOE");
		lblNewLabel.setBounds(37, -35, 389, 145);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 60));
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBackground(new Color(139, 0, 0));
		
		textField = new JTextField();
		textField.setBackground(new Color(211, 211, 211));
		textField.setBounds(225, 140, 96, 19);
		textField.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(211, 211, 211));
		textField_1.setColumns(10);
		textField_1.setBounds(225, 182, 96, 19);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playerName1 =  textField.getText();
				playerName2= textField_1.getText();
				Game test = new Game(playerName1,playerName2);
			      test.setVisible (true);
			      setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setBounds(88, 221, 245, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("PLAYER ONE:");
		lblNewLabel_1.setForeground(new Color(211, 211, 211));
		lblNewLabel_1.setBounds(88, 143, 76, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PLAYER TWO:");
		lblNewLabel_1_1.setForeground(new Color(211, 211, 211));
		lblNewLabel_1_1.setBounds(88, 185, 107, 13);
		contentPane.add(lblNewLabel_1_1);
	}
}
