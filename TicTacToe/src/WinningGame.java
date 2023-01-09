import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinningGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public WinningGame(String player, String player2, Boolean p,Boolean tie) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel;
		if(tie==true)
			lblNewLabel = new JLabel("GAME IS A TIE!!! ");
		else if(p==true)
		 lblNewLabel = new JLabel(player.toUpperCase()+" WINS!!!");
		else
			 lblNewLabel = new JLabel(player2.toUpperCase()+" WINS!!!");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(107, 25, 263, 155);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EndGame game = new EndGame(player,player2);
	        	game.setVisible (true);
			  
				setVisible(false);
			}
		});
		btnNewButton.setBounds(173, 213, 85, 21);
		contentPane.add(btnNewButton);
	}

}
