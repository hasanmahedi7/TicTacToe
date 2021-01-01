package publicTransport;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Registration implements ActionListener {

	private JFrame window = new JFrame();
	
	private JButton register = new JButton("Continue");
	private JButton cancel = new JButton("Cancel");
	
	private JTextField nameField = new JTextField();
	private JTextField emailField = new JTextField();
	private JTextField phoneField = new JTextField();
	private JTextField countryField = new JTextField();
	private JPasswordField passField = new JPasswordField();
	
	private static int count;
	
	
	public Registration ()
	{
		
	}
	
	
   public void showWindow(){
	   
		JLabel name=new JLabel("Name");
		JLabel email=new JLabel("Email");
		JLabel phone=new JLabel("Phone Number");
		JLabel password=new JLabel("Password");
		JLabel country=new JLabel("Country");
		
		GridLayout gl = new GridLayout(12,0,0,0);
		window.setLayout(gl);
		
		window.add(name);
		window.add(nameField);
		
		window.add(email);
		window.add(emailField);
		
		window.add(password);
		window.add(passField);
		
		window.add(country);
		window.add(countryField);
		window.add(phone);
		window.add(phoneField);
		
		cancel.addActionListener(this);
		register.addActionListener(this);
		
		window.add(register);
		window.add(cancel);
		window.setTitle("Register Form");
		window.setSize(400,500);
		window.setLocation(400,100);
		window.setVisible(true);
		
	}

	public static int getCount()
	{
	return count;
	}
	
	public void fileWrite(){
		
		File file=new File("info.txt");
		Info[] ic=new Info[1000];
		Info b=new Info();
		try{
			ic=b.getFileInfo();
			
			FileWriter fw = new FileWriter(file,true);
			
			if(b.getCount()>=1){
				
				fw.write("\n");
			}

			fw.write(nameField.getText()+"\n");
			fw.write(passField.getText()+"\n");
			fw.write(emailField.getText()+"\n");
			fw.write(phoneField.getText()+"\n");
			fw.write(countryField.getText());
			
			
			fw.close();
			count++;
			
		}
			catch(Exception x){
				System.out.println("Problem with registration");
			}
		
	}
	
public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==register){	
			fileWrite();
			SignIn ln=new SignIn();
			ln.showWindow();
			window.dispose();
		}
		else if(e.getSource() == cancel){
			System.exit(0);	
		}
		
	
	}
}

