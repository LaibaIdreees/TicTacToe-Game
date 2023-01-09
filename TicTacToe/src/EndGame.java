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

public class EndGame extends JFrame {
String a,b;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public EndGame(String a, String b) {
		this.a=a;
		this.b=b;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Do You Want To Quit?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBounds(66, 44, 321, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("NO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StartGame game = new StartGame();
				
				   game.setVisible (true);
				      setVisible(false);
				      
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(272, 157, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnYes = new JButton("Play Again");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Game game = new Game(a,b);
				   game.setVisible (true);
				setVisible(false);
			}
			
		});
		btnYes.setBackground(Color.WHITE);
		btnYes.setBounds(163, 207, 111, 21);
		contentPane.add(btnYes);
		
		JButton btnYes_1 = new JButton("YES");
		btnYes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnYes_1.setBackground(Color.WHITE);
		btnYes_1.setBounds(66, 157, 85, 21);
		contentPane.add(btnYes_1);
	}

}
