package publicTransport;


import java.awt.*;
import java.awt.event.*;

import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.io.*;



public class Background implements ActionListener {
	
	
	private JFrame window = new JFrame();

	private JButton Proceed = new JButton("PROCEED");
	private JButton cancel  = new JButton("CANCEL");
	
		
		public void showWindow()
		{
		

		Proceed.setBounds(450, 200, 10, 10);
		
		
		window.setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images//background 03.jpg"));
		window.add(background);
		background.setLayout(new FlowLayout());
		
		Proceed = new JButton("PROCEED");
		cancel  = new JButton("CANCEL");
		background.add(Proceed);
		background.add(cancel);
		
		Proceed.addActionListener(this);
		cancel.addActionListener(this);
		
		window.setTitle("WELCOME TO PUBLIC TRANSPORTATION");
		window.setSize(500,400);
		window.setLocation(500,250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
				
		
	}
	


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == cancel)
		{
			System.exit(0);
			
		}
		
		
	else if(e.getSource() == Proceed)
		{
			FirstWindow fw = new FirstWindow();
			fw.showWindow();
			window.dispose();
		}
		 
	}


}
