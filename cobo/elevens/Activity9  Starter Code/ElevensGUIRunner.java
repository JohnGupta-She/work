/*
TNPG: BrainForked (Gloria Lee, John Gupta-She, Jack Chen)
APCS pd 08
HW -- lab07
2022-03-19
time spent: 3 h 
*/
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
