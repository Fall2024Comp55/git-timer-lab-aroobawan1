import acm.graphics.*;
import acm.program.*;
import javax.swing.*; 
import java.awt.event.*; 
public class MyFirstTimer extends GraphicsProgram implements ActionListener{
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
  private int numTimes =0; 
  private Timer timer = new Timer(1000, this);
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		timer.setInitialDelay(3);
		timer.start();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		numTimes++;
		myLabel.setLabel("times called? " + numTimes);
     if(numTimes == 10) {
    	 timer.stop(); 
     }
		myLabel.move(5, 0);
	}
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}