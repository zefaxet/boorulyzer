package com.boorulyzer;

import javax.swing.*;
import java.awt.event.*;

public class AppWindow extends JFrame
{

    int clicks;

    public AppWindow()
    {

        clicks = 0;

        JButton b = new JButton(new ImageIcon("C:/Users/Mr. Looks Delicious/Desktop/junk repo/memes/bait/justapole.png"));
        b.setBounds(130,100,100,40);
        add(b);

        JLabel l = new JLabel();
        l.setBounds(130, 150, 50, 20);
        add(l);

        JTextField t = new JTextField("test", 3);
        t.setBounds(130,50,50,20);
        add(t);

        setSize(400,400);
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {

                t.setText(String.valueOf(++clicks));

            }

        });

        t.addKeyListener(new KeyListener(){

            public void keyPressed(KeyEvent e)
            {

                t.add(new JLabel("boi"));

            }

            public void keyReleased(KeyEvent e)
            {

                l.setText(t.getText());

            }

            public void keyTyped(KeyEvent e)
            {

                l.setText(t.getText());

            }

        });

    }

}
