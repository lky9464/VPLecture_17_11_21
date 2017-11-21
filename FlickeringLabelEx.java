import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while(true) {
			if(n == 0) 
				setBackground(Color.YELLOW);
			else 
				setBackground(Color.GREEN);
			
			if(n == 0) n = 1;
			else n = 0;
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e){
				return;
			}
		}
	}
	
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("안깜박");
		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300);
		FlickeringLabel fLabel3 = new FlickeringLabel("저기도 깜박", 600);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		c.add(fLabel3);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx();
	}

}
