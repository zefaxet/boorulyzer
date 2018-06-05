package widgets;

import boorulyzer.AppWindow;
import widgets.menu_items.*;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar
{
	
	private JMenu[] menus;
	
	public MenuBar()
	{
	
		super();
		setBounds(0, 0, AppWindow.WIDTH, 30);
		setBackground(Color.GRAY);
		
		menus = new JMenu[] {new FileMenu()};
		for (JMenu menu : menus)
		{
			
			add(menu);
			
		}
	
	}
	
}
