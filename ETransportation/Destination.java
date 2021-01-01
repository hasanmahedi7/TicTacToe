package publicTransport;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Destination implements ActionListener {
	JFrame window = new JFrame();

    String[] frm = {"From", "Dhaka"};
	 JComboBox from= new JComboBox(frm);
	 
	 String[] t={"To", "Dhaka", "Rajshahi", "Khulna", "Sylhet", "Chittagong", "Barisal", "Rangpur"};
	 JComboBox to= new JComboBox(t);
	 
	 String[] dt={"Available Dates", "01-01-2021"};
	 JComboBox date=new JComboBox(dt);
	
	 
	// JButton con=new JButton("Confirm");
	 JButton can=new JButton("Cancel");
	 JButton find = new JButton("find");
	 
	 public Destination(){
		 
		 
	 }
	
	
	public void initWindow(){
		
		GridLayout gl = new GridLayout(5,0,5,5);
		window.setLayout(gl);
		
		window.add(from);
		window.add(to);
		window.add(date);
		//window.add(transport);
		window.add(find);
		//window.add(con);
		window.add(can);
		find.addActionListener(this);
		can.addActionListener(this);
		
		//con.addActionListener(this);
		
		
	}
		
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Destinations");
		window.setSize(500, 250);
		window.setLocation(500,150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
				
	}
	
	Info ic=new Info();
	
	public Destination(Info info){
		ic=info;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	/*	if (e.getSource() == con)
		{
			String fare="0 BDT";
			ADString name = transport.getSelectedItem().toString();
			String FROM = from.getActionCommand().toString();
			String TO = to.getSelectedItem().toString();
			
			
			try{
				File f = new File("Bus.txt");
				Bus [] b = new Bus [20];
				
				
				int index = 0;
				Scanner s = new Scanner(f);
				while(s.hasNextLine()){
				
					b[index] = new Bus(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()));
					//System.out.println(b[index]);
					index++;
				}
				
				for(int i = 0;i<b.length;i++){
					if(b[i]!=null && b[i].getName().equals(name) && b[i].getFrom().equals(FROM) && b[i].getTo().equals(TO)){
						fare = ( b[i].getFare());
						
						
					}
					
					
				}

				
				
			}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			
			
		

			Seat s=new Seat(fare,name);
			s.showWindow();
			window.dispose();
		}  */
		
		 if(e.getSource()==can){
			
			System.exit(0);
		}
		else if(e.getSource()==find){
			
			String FROM = from.getSelectedItem().toString();
			String TO = to.getSelectedItem().toString();
			Find f = new Find (FROM,TO);
			f.showWindow();
			window.dispose();
			//if(FROM.equals("Dhaka")&&TO.equals("Sylhet")){
			//	String[] t = {"Kalni","Ena"};
				
				//transport = new JComboBox(t);
				//window.add(transport);
				
			//}
			/*String tran = "";
			int count = 0;
			
			//System.out.println("Hee");
			try{
			File f = new File("Bus.txt");
			Bus [] b = new Bus [20];
			int index = 0;
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
			
				b[index] = new Bus(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()));
				//System.out.println(b[index]);
				index++;
			}
			for(int i = 0; i < b.length; i++)
			{
				if(b[i].getFrom().equals(FROM)&& b[i].getTo().equals(TO)){
					//transport.addItem(b[i].getName());
					transport.setSelectedItem(b[i].getName());
					window.repaint();
					window.getContentPane().revalidate();
					count++;
			
					
				}
			} */
			
			
			
			
			
	//	for(int i = 0; i < b.length; i++){
		//		if(b[i] != null/* && b[i].equals(from.getSelectedItem().toString())*/){
			//		transport.addItem(b[i].getName());
					//System.out.println(b[i].getName());
				
			//	}
			//}
			
			
			//window.getContentPane().revalidate();
			//window.repaint();
			// modification will come here
			}
		//	catch(Exception ex){
			//	System.out.println(ex.getMessage());
		//	}
			
		//}
	}
}
