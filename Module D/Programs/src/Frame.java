import java.awt.Color;
import javax.swing.*;
public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setTitle("Java GUI");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		ImageIcon image=new ImageIcon("gui.jpg");
		frame.setIconImage(image.getImage());
		//frame. getContentPane(). setBackground(Color.green);
		frame.getContentPane().setBackground(new Color(255,0,255));
	}

}
