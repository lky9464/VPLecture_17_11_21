import javax.swing.*;
import java.awt.*;

public class ImagesEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public ImagesEx() {
		setTitle("untitled1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,500);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/flower.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,  20, 20, this);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImagesEx();
	}

}
