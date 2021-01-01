package publicTransport;
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;


public class SignIn implements ActionListener{

	JFrame window = new JFrame();
	private JButton signin = new JButton("Sign-In");
	private JButton cancel = new JButton("Cancel");
	
	private JButton register = new JButton("Create a new profile");
	private JTextField  userfield = new JTextField();
	private JPasswordField passwordfield = new JPasswordField();
	private Info sendInfo;
	
	public SignIn()
	{
		
	}
	
	public JTextField getUserField() {
		return userfield;
	}

	public JPasswordField getPasswordField() {
		return passwordfield;
	}
	public Info getSendInfo() {
		return sendInfo;
}
	
	public void setSendInfo(Info sendInfo) {
		this.sendInfo = sendInfo;
	}
	
public void showWindow(){
		
		JLabel userLabel = new JLabel("Name");
		JLabel passwordLabel = new JLabel("Password");
		GridLayout gl = new GridLayout(7,1,0,1);
		
		window.setLayout(gl);
		
		window.add(userLabel);
		window.add(userfield);
		
		window.add(passwordLabel);
		window.add(passwordfield);
		
		window.add(signin);
		window.add(register);
		window.add(cancel);
		window.setTitle("Log In");
		window.setSize(500,250);
		window.setLocation(450,200);
		window.setVisible(true);
		
		signin.addActionListener(this);
		cancel.addActionListener(this);
		register.addActionListener(this);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	



public boolean checkInfo(String name,String pass){
	
	Info b=new Info();
	Info[] ic=new Info[1000];
	
	ic=b.getFileInfo();
	int n = b.getCount();

	
	for(int i=0;i<n;i++){
	String password=ic[i].getPassword();
		String username=ic[i].getName();
		
		
		if(name.equals(username) && pass.equals(password) ){
			setSendInfo(new Info(ic[i].getName(),ic[i].getPassword(),ic[i].getEmail(), ic[i].getCountry(),ic[i].getPhone())) ; 
			return true;
			
		}
			
	}
	
	return false;	
	
}



public void actionPerformed(ActionEvent e){
	String name=userfield.getText();
	String pass=passwordfield.getText();
	if(e.getSource()==signin){	

		boolean b=checkInfo(name,pass);
		if(b){
			
			//Destination de= new Destination(sendInfo);
		//	de.showWindow();
			
			window.dispose();
		}
			
		else {
			
			JOptionPane.showMessageDialog(null, "Wrong Username or Password");
		}
		
	}
	
	 if(e.getSource() == cancel){
		
		System.exit(0);	
	}
	else if(e.getSource()==register){
		window.dispose();
		Registration  r = new Registration();
		r.showWindow();
		
	}

}


}
