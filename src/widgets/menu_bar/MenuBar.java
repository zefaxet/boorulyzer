package widgets.menu_bar.menu_items;

import boorulyzer.AppWindow;
import widgets.menu_bar.menu_items.*;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar
{
	
	private JMenu[] menus;
	
	public MenuBar()
	{
	
		super();
		this.setBounds(new Rectangle(AppWindow.WIDTH, 30));
		setBackground(Color.GRAY);
		
		menus = new JMenu[] {new FileMenu()};
		for (JMenu menu : menus)
		{
			
			add(menu);
			
		}
	
	}
	
}
