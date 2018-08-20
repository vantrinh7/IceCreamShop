import javax.swing.JFrame;

public class IceCreamManagerApplication {
	// The height of frame
	public static int FRAME_WIDTH = 500;
	// The width of frame
	public static int FRAME_HEIGHT = 600;

	/**
	 * Create JFrame for the ice cream line
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// A new GUI frame
		JFrame guiFrame;

		// Create a new frame for the ice cream maker
		guiFrame = new JFrame("IceCreamManager");

		// Set size of the frame
		guiFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		// Add the IceCreamMaker controller
		guiFrame.add(new IceCreamLineManager());

		// Exit normally on closing the window
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Show the frame
		guiFrame.setVisible(true);
	}
}
