package publicTransport;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;





public class FirstWindow  implements ActionListener {

	private JFrame window = new JFrame();
	
	private JButton signIn = new JButton("Sign In");
	private JButton createNewProfile  = new JButton("Create a new profile");
	private JButton cancel = new JButton("Cancel");
	
	public void initWindow(){
		
		GridLayout gl=new GridLayout(3,0,0,5);
		window.setLayout(gl);
		
		window.add(signIn);
		window.add(createNewProfile);
		window.add(cancel);
		
		signIn.addActionListener(this);
		createNewProfile.addActionListener(this);
		cancel.addActionListener(this);
		
	}
	
	
	public void showWindow(){
		
		initWindow();
		
		window.setSize(300,300);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e){
				
		if(e.getSource() == signIn){
			
			SignIn LC =new SignIn();
			LC.showWindow();
			window.dispose();
		}
		
		else if(e.getSource() == createNewProfile){
			
			Registration RC =new Registration();
			RC.showWindow();
			window.dispose();
		}
		
		if(e.getSource() == cancel){
			System.exit(0);
		}
	}
}
   
