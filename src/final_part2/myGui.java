package final_part2;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class myGui extends JFrame {

	private listener l; 
	
	int sleeptime = 10;
	int xaxis = 750;
	int yaxis = 400;
	
	private JButton bottomleft = new JButton("bottomLeft");
	private JButton bottomright = new JButton("bottomRight");
	private JButton topleft = new JButton("topLeft");
	private JButton topright = new JButton("topRight");
	
	JPanel panel = new JPanel();
	
	// constructor 
	public myGui()
	{
		this.setTitle("Moving Window"); // sets up the title 
		
		Container canvas = this.getContentPane();
		panel.setPreferredSize(new Dimension(100,100));
		setLocation(750,400);
		
        panel.add(bottomleft);
        panel.add(bottomright);
        panel.add(topleft);
        panel.add(topright);
        
        canvas.add(panel);
		this.pack();
		setVisible(true);// without this no output 
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setListener(listener myListener) {
		// TODO Auto-generated method stub
	
		l = myListener;
		bottomleft.addActionListener(l); // button has a listener 
		bottomright.addActionListener(l);
		topleft.addActionListener(l);
		topright.addActionListener(l);
	}

	public void topLeft(int x, int y) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++){
			// need a pause here
			Thread.currentThread().sleep(sleeptime);  // sleeptime is an int and represents time in milliseconds
			xaxis -= x;
			yaxis -= y;
			setLocation(xaxis, yaxis);
		}
	}
	public void topRight(int x, int y) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++){
			// need a pause here
			Thread.currentThread().sleep(sleeptime);  // sleeptime is an int and represents time in milliseconds
			xaxis += x;
			yaxis -= y;
			setLocation(xaxis, yaxis);
		}
	}
	
	public void bottomRight(int x, int y) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++){
			// need a pause here
			Thread.currentThread().sleep(sleeptime);  // sleeptime is an int and represents time in milliseconds
			xaxis += x;
			yaxis += y;
			setLocation(xaxis, yaxis);
		}
	}
	
	public void bottomLeft(int x, int y) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 50; i++){
			// need a pause here
			Thread.currentThread().sleep(sleeptime);  // sleeptime is an int and represents time in milliseconds
			xaxis -= x;
			yaxis += y;
			setLocation(xaxis, yaxis);
		}
	}	
}