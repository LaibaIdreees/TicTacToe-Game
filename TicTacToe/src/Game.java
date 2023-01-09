import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Game extends JFrame {
boolean player_turn_one=false, flag;
static String player1;
String player2;
JLabel lblPlayer;
StartGame g=new StartGame();
JButton btnNewButton0,btnNewButton1,btnNewButton2,btnNewButton3,btnNewButton6,btnNewButton4,btnNewButton7,btnNewButton8,btnNewButton5;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;

	
	
	public Game(String a, String b) {
		flag=false;
		if(a=="")
			player1="player1";
		if(b=="")
			player2="player2";
		
		player1=a;
		player2=b;
		player_turn_one=true;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 501, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TIC TAC TOE");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD, 30f));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(141, 0, 257, 76);
		contentPane.add(lblNewLabel);
		
		
		
		 btnNewButton0 = new JButton("");
		btnNewButton0.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton0.getText()=="") {
					if(player_turn_one) {
						btnNewButton0.setForeground(new Color(255,0,0));
						btnNewButton0.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton0.setForeground(new Color(0,0,255));
						btnNewButton0.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
				}
			
		
		});
		btnNewButton0.setBackground(new Color(192, 192, 192));
		btnNewButton0.setBounds(21, 86, 148, 111);
		contentPane.add(btnNewButton0);
		
		 btnNewButton1 = new JButton("");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton1.getText()=="") {
					if(player_turn_one) {
						btnNewButton1.setForeground(new Color(255,0,0));
						btnNewButton1.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton1.setForeground(new Color(0,0,255));
						btnNewButton1.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
				}
				
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton1.setBackground(Color.LIGHT_GRAY);
		btnNewButton1.setBounds(168, 86, 148, 111);
		contentPane.add(btnNewButton1);
		
		 btnNewButton2 = new JButton("");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton2.getText()=="") {
					if(player_turn_one) {
						btnNewButton2.setForeground(new Color(255,0,0));
						btnNewButton2.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton2.setForeground(new Color(0,0,255));
						btnNewButton2.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			} 
				checkWinner();
			}
			
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton2.setBackground(Color.LIGHT_GRAY);
		btnNewButton2.setBounds(316, 86, 148, 111);
		contentPane.add(btnNewButton2);
		
		 btnNewButton3 = new JButton("");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton3.getText()=="") {
					if(player_turn_one) {
						btnNewButton3.setForeground(new Color(255,0,0));
						btnNewButton3.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton3.setForeground(new Color(0,0,255));
						btnNewButton3.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
				}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton3.setBackground(Color.LIGHT_GRAY);
		btnNewButton3.setBounds(21, 196, 148, 111);
		contentPane.add(btnNewButton3);
		
		 btnNewButton6 = new JButton("");
		btnNewButton6.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton6.getText()=="") {
					if(player_turn_one) {
						btnNewButton6.setForeground(new Color(255,0,0));
						btnNewButton6.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton6.setForeground(new Color(0,0,255));
						btnNewButton6.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
			}
		});
		btnNewButton6.setBackground(Color.LIGHT_GRAY);
		btnNewButton6.setBounds(21, 306, 148, 111);
		contentPane.add(btnNewButton6);
		
		 btnNewButton4 = new JButton("");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton4.getText()=="") {
					if(player_turn_one) {
						btnNewButton4.setForeground(new Color(255,0,0));
						btnNewButton4.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton4.setForeground(new Color(0,0,255));
						btnNewButton4.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton4.setBackground(Color.LIGHT_GRAY);
		btnNewButton4.setBounds(168, 196, 148, 111);
		contentPane.add(btnNewButton4);
		
		 btnNewButton7 = new JButton("");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton7.getText()=="") {
					if(player_turn_one) {
						btnNewButton7.setForeground(new Color(255,0,0));
						btnNewButton7.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton7.setForeground(new Color(0,0,255));
						btnNewButton7.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton7.setBackground(Color.LIGHT_GRAY);
		btnNewButton7.setBounds(168, 306, 148, 111);
		contentPane.add(btnNewButton7);
		
		 btnNewButton8 = new JButton("");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton8.getText()=="") {
					if(player_turn_one) {
						btnNewButton8.setForeground(new Color(255,0,0));
						btnNewButton8.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton8.setForeground(new Color(0,0,255));
						btnNewButton8.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
				}
			
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton8.setBackground(Color.LIGHT_GRAY);
		btnNewButton8.setBounds(316, 306, 148, 111);
		contentPane.add(btnNewButton8);
		
		 btnNewButton5 = new JButton("");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton5.getText()=="") {
					if(player_turn_one) {
						btnNewButton5.setForeground(new Color(255,0,0));
						btnNewButton5.setText("X");
						player_turn_one=false;
						lblNewLabel_1.setText(player2 + "'s Turn");
					}
					else {
						btnNewButton5.setForeground(new Color(0,0,255));
						btnNewButton5.setText("O");
						player_turn_one=true;
						lblNewLabel_1.setText(player1 + "'s Turn");
					}
			}
				checkWinner();
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.PLAIN, 60));
		btnNewButton5.setBackground(Color.LIGHT_GRAY);
		btnNewButton5.setBounds(316, 196, 148, 111);
		contentPane.add(btnNewButton5);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setBounds(299, 439, 165, 13);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText(player1 + "'s Turn");
		
	
	}
	
	
	public void checkWinner() {
	if(btnNewButton0.getText()=="X" && btnNewButton1.getText()=="X" && btnNewButton2.getText()=="X") {
		btnNewButton0.setBackground(Color.green);
		btnNewButton1.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton3.getText()=="X" && btnNewButton4.getText()=="X" && btnNewButton5.getText()=="X"){
		btnNewButton3.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton5.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton6.getText()=="X" && btnNewButton7.getText()=="X" && btnNewButton8.getText()=="X"){
		btnNewButton6.setBackground(Color.green);
		btnNewButton7.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton0.getText()=="X" && btnNewButton3.getText()=="X" && btnNewButton6.getText()=="X"){
		btnNewButton0.setBackground(Color.green);
		btnNewButton3.setBackground(Color.green);
		btnNewButton6.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton1.getText()=="X" && btnNewButton4.getText()=="X" && btnNewButton7.getText()=="X"){
		btnNewButton1.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton7.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton2.getText()=="X" && btnNewButton5.getText()=="X" && btnNewButton8.getText()=="X"){
		btnNewButton5.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton0.getText()=="X" && btnNewButton4.getText()=="X" && btnNewButton8.getText()=="X"){
		btnNewButton0.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		PlayerWin(true);
	}
	else if(btnNewButton2.getText()=="X" && btnNewButton4.getText()=="X" && btnNewButton6.getText()=="X"){
		btnNewButton4.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		btnNewButton6.setBackground(Color.green);
		PlayerWin(true);
	}
		
	/////////////////////////////////
	
	if(btnNewButton0.getText()=="O" && btnNewButton1.getText()=="O" && btnNewButton2.getText()=="O") {
		btnNewButton0.setBackground(Color.green);
		btnNewButton1.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton3.getText()=="O" && btnNewButton4.getText()=="O" && btnNewButton5.getText()=="O"){
		btnNewButton3.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton5.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton6.getText()=="O" && btnNewButton7.getText()=="O" && btnNewButton8.getText()=="O"){
		btnNewButton6.setBackground(Color.green);
		btnNewButton7.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton0.getText()=="O" && btnNewButton3.getText()=="O" && btnNewButton6.getText()=="O"){
		btnNewButton0.setBackground(Color.green);
		btnNewButton3.setBackground(Color.green);
		btnNewButton6.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton1.getText()=="O" && btnNewButton4.getText()=="O" && btnNewButton7.getText()=="O"){
		btnNewButton1.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton7.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton2.getText()=="O" && btnNewButton5.getText()=="O" && btnNewButton8.getText()=="O"){
		btnNewButton5.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton0.getText()=="O" && btnNewButton4.getText()=="O" && btnNewButton8.getText()=="O"){
		btnNewButton0.setBackground(Color.green);
		btnNewButton4.setBackground(Color.green);
		btnNewButton8.setBackground(Color.green);
		PlayerWin(false);
	}
	else if(btnNewButton2.getText()=="O" && btnNewButton4.getText()=="O" && btnNewButton6.getText()=="O"){
		btnNewButton4.setBackground(Color.green);
		btnNewButton2.setBackground(Color.green);
		btnNewButton6.setBackground(Color.green);
		PlayerWin(false);
	}
	
	else if(btnNewButton0.getText()!="" && btnNewButton1.getText()!="" && btnNewButton2.getText()!="" && btnNewButton3.getText()!="" && btnNewButton4.getText()!="" && btnNewButton5.getText()!="" &&btnNewButton6.getText()!="" &&btnNewButton7.getText()!="" &&btnNewButton8.getText()!=""){
		flag=true;
		WinningGame g= new WinningGame(player1,player2,false,flag);
		g.setVisible(true);
		    setVisible(false);
	
        }
	}
	
	public void PlayerWin(Boolean player) {
		btnNewButton0.setEnabled(false);
		btnNewButton1.setEnabled(false);
		btnNewButton2.setEnabled(false);
		btnNewButton3.setEnabled(false);
		btnNewButton4.setEnabled(false);
		btnNewButton5.setEnabled(false);
		btnNewButton6.setEnabled(false);
		btnNewButton7.setEnabled(false);
		
		if(player == true ) {
			WinningGame g= new WinningGame(player1,player2,player,flag);
			g.setVisible(true);
			setVisible(false);
	        
		}
		else {
			WinningGame g= new WinningGame(player1, player2, player,flag);
			g.setVisible(true);
			setVisible(false);
		
	        }
		}
		
		
	}
	
	


