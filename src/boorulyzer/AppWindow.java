package boorulyzer;

import widgets.MenuBar;

import javax.swing.*;

public class AppWindow extends JFrame
{

	public static MenuBar menuBar;
	public static int WIDTH;
	public static int HEIGHT;

    public AppWindow()
    {

    	/*INITIALIZE WINDOW*/
        super("BOORULYZER");
    	WIDTH = 1200;
    	HEIGHT = 800;
	
		/*INITIALIZE WIDGETS*/
		menuBar = new MenuBar();
  
		/*ADD WIDGETS*/
        add(menuBar);

		setSize(WIDTH,HEIGHT);
        setLayout(null);
        setVisible(true);

    }

}
