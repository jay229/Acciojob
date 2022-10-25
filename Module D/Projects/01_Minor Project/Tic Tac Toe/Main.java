//import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class TicTacToe implements ActionListener{
	Random rnd=new Random();
	JFrame frame=new JFrame();
	JPanel title=new JPanel();
	JPanel btn_panel=new JPanel();
	JLabel txtfield=new JLabel();
	JButton[] btns=new JButton[9];
	boolean player1;
	
//	Constructor
	TicTacToe() {
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(60,70,80));
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		
		txtfield.setBackground(new Color(25,25,25));
		txtfield.setForeground(new Color(150,150,150));
		txtfield.setHorizontalAlignment(JLabel.CENTER);
		txtfield.setText("Tic Tac Toe game");
		txtfield.setOpaque(true);
		txtfield.setFont(new Font("Ink Free",Font.BOLD,75));
		txtfield.setForeground(new Color(25,255,0));
		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);
		
		btn_panel.setLayout(new GridLayout(3,3));
		btn_panel.setBackground(new Color(150,150,150));
		
		
		
		
		for(int i=0;i<9;i++) {
			btns[i]=new JButton();
			btn_panel.add(btns[i]);
			btns[i].setFont(new Font("MV Boli", Font.BOLD,120));
			btns[i].setFocusable(false);
			btns[i].addActionListener(this);
		}
		title.add(txtfield);
		frame.add(title,BorderLayout.NORTH);
		frame.add(btn_panel);
		startingTurn();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			if(e.getSource()==btns[i]) {
				if(player1) {
					if(btns[i].getText()=="") {
						btns[i].setForeground(new Color(255,0,0));
						btns[i].setText("X");
						player1=false;
						txtfield.setText("O turn");
						checkForWin();
					}
				}
				else {
					if(btns[i].getText()=="") {
						btns[i].setForeground(new Color(0,0,255));
						btns[i].setText("O");
						player1=true;
						txtfield.setText("X turn");
						checkForWin();
					}
				}
			}
			
		}
		
	}
	public void startingTurn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int p=rnd.nextInt(2);
		
		if(p==0) {
			player1=true;
			txtfield.setText(" X turn");
		}
		else {
			
			player1=false;
			txtfield.setText(" O turn");
		}
	}
	
	
	
	
//	Check for the win condition
	public void checkForWin() {
//		check for X win
		
//		condtion for first row
		if((btns[0].getText()=="X") && (btns[1].getText()=="X")&& (btns[2].getText()=="X")) {
			xWins(0,1,2);
		}
//		Condition for second row
		 if((btns[3].getText()=="X") && (btns[4].getText()=="X")&& (btns[5].getText()=="X")) {
			xWins(3,4,5);
		}
//		Condition for third row
		 if((btns[6].getText()=="X") && (btns[7].getText()=="X")&& (btns[8].getText()=="X")) {
			xWins(6,7,8);
		}
//		Condition for top-left to bottom-right(diagonal)
		 if((btns[0].getText()=="X") && (btns[4].getText()=="X")&& (btns[8].getText()=="X")) {
			xWins(0,4,8);
		}
//		Condition for top-right to bottom-left(diagonal)
		 if((btns[2].getText()=="X") && (btns[4].getText()=="X")&& (btns[6].getText()=="X")) {
			xWins(2,4,6);
		}
		 if((btns[0].getText()=="X") && (btns[3].getText()=="X")&& (btns[6].getText()=="X")) {
				xWins(0,3,6);
			}
		 if((btns[1].getText()=="X") && (btns[4].getText()=="X")&& (btns[7].getText()=="X")) {
				xWins(1,4,7);
			}
		 if((btns[2].getText()=="X") && (btns[5].getText()=="X")&& (btns[8].getText()=="X")) {
				xWins(2,5,8);
			}
		 
//		condition for O win
		
//			condtion for first row
			if((btns[0].getText()=="O") && (btns[1].getText()=="O")&& (btns[2].getText()=="O")) {
				oWins(0,1,2);
			}
//			Condition for second row
			 if((btns[3].getText()=="O") && (btns[4].getText()=="O")&& (btns[5].getText()=="O")) {
				oWins(3,4,5);
			}
//			Condition for third row
			 if((btns[6].getText()=="O") && (btns[7].getText()=="O")&& (btns[8].getText()=="O")) {
				oWins(6,7,8);
			}
//			Condition for top-left to bottom-right(diagonal)
			 if((btns[0].getText()=="O") && (btns[4].getText()=="O")&& (btns[8].getText()=="O")) {
				oWins(0,4,8);
			}
//			Condition for top-right to bottom-left(diagonal)
			 if((btns[2].getText()=="O") && (btns[4].getText()=="O")&& (btns[6].getText()=="O")) {
				oWins(2,4,6);
			}
			 if((btns[0].getText()=="O") && (btns[3].getText()=="O")&& (btns[6].getText()=="O")) {
					oWins(0,3,6);
				}
			 if((btns[1].getText()=="O") && (btns[4].getText()=="O")&& (btns[7].getText()=="O")) {
					oWins(1,4,7);
				}
			 if((btns[2].getText()=="O") && (btns[5].getText()=="O")&& (btns[8].getText()=="O")) {
					oWins(2,5,8);
				}
				
		
		}
		
	public void xWins(int a,int b,int c) {
		btns[a].setBackground(Color.GREEN);
		btns[b].setBackground(Color.GREEN);
		btns[c].setBackground(Color.GREEN);
		for(int i=0;i<9;i++) {
			btns[i].setEnabled(false);
		}
		txtfield.setText("X wins");
	}
	public void oWins(int a,int b,int c) {
		btns[a].setBackground(Color.GREEN);
		btns[b].setBackground(Color.GREEN);
		btns[c].setBackground(Color.GREEN);
		for(int i=0;i<9;i++) {
			btns[i].setEnabled(false);
		}
		txtfield.setText("O wins");
	}
			
	
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe t=new TicTacToe();
	}

}
