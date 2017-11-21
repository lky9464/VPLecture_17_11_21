import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600,600);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) { //g는 원래 있는 객체
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(130, 170, 50, 50);
			
			g.setColor(Color.MAGENTA);
			g.fillOval(30, 30, 50, 100);
			
			g.setColor(Color.GREEN);
			g.draw3DRect(90, 90, 60, 60, true);
			
			g.setColor(Color.BLUE);
			g.fillArc(100, 100, 50, 50, 0, 270);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawStringEx();
	}

}
