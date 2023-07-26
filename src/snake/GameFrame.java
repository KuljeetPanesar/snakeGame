package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	//JFrame builds GUIs (graphical user interfaces)
	//I.e. a window for graphic apps

	GameFrame(){
		
		//add game graphics and interactions from GamePanel class to the window
		this.add(new GamePanel());
		//window title - Snake
		this.setTitle("Snake");
		//when X is pressed, app terminates
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//cannot resize the window
		this.setResizable(false);
		//size adjusts automatically to fit all components inside
		this.pack();
		//makes window visible
		this.setVisible(true);
		//sets position of the window to the center of the screen
		this.setLocationRelativeTo(null);
	}
}
