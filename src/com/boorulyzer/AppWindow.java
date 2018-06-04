package com.boorulyzer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppWindow extends JFrame
{

	public static MenuBar menuBar;
	public static int WIDTH;
	public static int HEIGHT;

    public AppWindow()
    {

        super("BOORULYZER");
    	WIDTH = 1200;
    	HEIGHT = 800;
	
	
		menuBar = new MenuBar();
        
        add(menuBar);

		setSize(WIDTH,HEIGHT);
        setLayout(null);
        setVisible(true);

    }

}
