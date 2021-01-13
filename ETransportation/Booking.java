package publicTransport;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Booking  implements ActionListener {
	
	private JFrame window=new JFrame();
	
	private JTextField nameF=new JTextField();
	private JTextField emailF=new JTextField();
	private JTextField addressF = new JTextField();
	private JTextField mobileF = new JTextField();
	private JTextField seatF = new JTextField();
	
	
	private String[] gen={"Gender", "Male", "Female"};
	private JComboBox gender=new JComboBox(gen);
	
	private JButton pay=new JButton("Pay");
	private JButton can=new JButton("Cancel");
	private String fare;
	private String seat;
	private int count;
	private String name;
	
	public Booking(int count,String s,String fare, String name){
		//int f;
		//int n;
		this.count = count;
		this.seat = s;
		this.fare = fare;
		this.name= name;
		
		
	}
	
	public void initWindow(){
		
	     JLabel name = new JLabel("Name");
		 JLabel email = new JLabel("Email");
		 JLabel address = new JLabel("Address");
		 JLabel mobile=new JLabel("Mobile Number");
		 JLabel seat = new JLabel("Choosen Seat");
		
		GridLayout gl=new GridLayout(13,0);			
		window.setLayout(gl);
		
		window.add(name);
		window.add(nameF);
		
		window.add(email);		
		window.add(emailF);
		
		window.add(address);		
		window.add(addressF);
		
		window.add(mobile);
		window.add(mobileF);
		window.add(seat);
		window.add(seatF);
		
		window.add(gender);
		window.add(pay);
		window.add(can);
		seatF.setEditable(false);
		
	
		
		
		
		pay.addActionListener(this);
		can.addActionListener(this);

		
	}


	public void showWindow() {
		
		initWindow();
		
		window.setTitle("Booking");
		window.setSize(300, 500);
		window.setLocation(500, 150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		seatF.setText(seat);
		window.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pay){
			double fare = Double.parseDouble(this.fare);
			//System.out.println("from booking Double ="+fare);
			fare= fare*count;
			//System.out.println("from booking after count "+fare+count);
			
			
			//Payment p=new Payment(fare,name);
			//p.showWindow();
			window.dispose();
		}
		
		else if(e.getSource()==can){
			
			System.exit(0);
		}
	}

}
