package final_part2;
/*
 * Ritesh Thapa
 * CS 250
 * 
 * Finals part 2 
 * 
 */

public class driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myGui mygui = new myGui();
		listener myListener = new listener();
		mygui.setListener(myListener);
		myListener.setgui(mygui);
	}
}
