package boorulyzer;

import widgets.menu_bar.menu_items.MenuBar;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame
{

	public static int WIDTH;
	public static int HEIGHT;
	
	private MenuBar menuBar;

    public AppWindow()
    {

    	/*INITIALIZE WINDOW*/
        super("BOORULYZER");
    	WIDTH = 1200;
    	HEIGHT = 800;
	
		/*INITIALIZE WIDGETS*/
		menuBar = new MenuBar();
  
		/*ADD WIDGETS*/
        add(menuBar, BorderLayout.NORTH);

		setSize(WIDTH,HEIGHT);
        setLayout(new BorderLayout());
        setVisible(true);

    }

}
