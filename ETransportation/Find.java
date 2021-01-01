package publicTransport;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Find implements ActionListener {
	private String from;
	private String to;
	private JComboBox b;
	private JFrame frame;
	private JButton con;
	
	public Find(String from,String to){
		this.from=from;
		this.to=to;
		
		
	}
	public void showWindow(){
		frame = new JFrame();
		if(to.equals("Sylhet")){
			String [] trans = {"Kalni","Ena"};
			b = new JComboBox(trans);
			}
		else if(to.equals("Rajshahi")){
			String [] trans = {"Silk","Padma"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Khulna")){
			String [] trans = {"Tisha","Shohag"};
			b = new JComboBox(trans);
			
		}
		
		else if(to.equals("Barisal")){
			String [] trans = {"Dhansiri","Shamoli"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Chittagong")){
			String [] trans = {"Agrabad","Kornofuli"};
			b = new JComboBox(trans);
			
		}
		else if(to.equals("Rangpur")){
			String [] trans = {"GreenLine","Hanif"};
			b = new JComboBox(trans);
			
		}
		con = new JButton("Confirm");
		
		frame.setLayout(new GridLayout(2,0));
		frame.add(b);
		frame.add(con);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 150);
		frame.setLocation(300, 300);
		con.addActionListener(this);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == con)
		{
			String fare="0";
			String name = b.getSelectedItem().toString();
			
			
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
					if(b[i]!=null && b[i].getName().equals(name)){
						fare = ( b[i].getFare());
						//System.out.println("from FInd "+name+ "= " +fare);
					}
					
				}

				
				
			}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			
			
		

			Seat s=new Seat(fare,name);
			s.showWindow();
			frame.dispose();
		} 
		
	}


}
