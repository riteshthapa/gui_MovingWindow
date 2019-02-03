package final_part2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class listener implements ActionListener {

	myGui gui;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		JButton clicked = (JButton) event.getSource();
		String text = clicked.getText();
		System.out.println("\""+text+"\" button is clicked.");
	            
		if (text.equals("topLeft"))
		{
			try {
				gui.topLeft(5, 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (text.equals("topRight"))
		{
			try {
				gui.topRight(5, 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (text.equals("bottomRight"))
		{
			try {
				gui.bottomRight(5, 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (text.equals("bottomLeft"))
		{
			try {
				gui.bottomLeft(5, 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setgui(myGui g) {
		// TODO Auto-generated method stub
		this.gui = g;
	}

}
