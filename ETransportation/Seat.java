package publicTransport;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Seat implements ActionListener{

	private JFrame window = new JFrame();
	
	private  JToggleButton A1 = new JToggleButton("A1");
	private  JToggleButton A2 = new JToggleButton("A2");
	
	private  JToggleButton B1 = new JToggleButton("B1");
	private  JToggleButton B2 = new JToggleButton("B2");
	
	private  JToggleButton A3 = new JToggleButton("A3");
	private  JToggleButton A4 = new JToggleButton("A4");
	
	private  JToggleButton B3 = new JToggleButton("B3");
	private  JToggleButton B4 = new JToggleButton("B4");
	
	private  JToggleButton A5 = new JToggleButton("A5");
	private  JToggleButton A6 = new JToggleButton("A6");
	
	private  JToggleButton B5 = new JToggleButton("B5");
	private  JToggleButton B6 = new JToggleButton("B6");
	
	private  JToggleButton A7 = new JToggleButton("A7");
	private  JToggleButton A8 = new JToggleButton("A8");
	
	private  JToggleButton B7 = new JToggleButton("B7");
	private  JToggleButton B8 = new JToggleButton("B8");
	
	private  JToggleButton A9 = new JToggleButton("A9");
	private  JToggleButton A10 = new JToggleButton("A10");
	
	private  JToggleButton B9 = new JToggleButton("B9");
	private  JToggleButton B10 = new JToggleButton("B10");
	
	private JToggleButton [] buttons = new JToggleButton [20];
	private JButton next = new JButton("Next");
	private String fare;
	private String name;
	
	
	public Seat(String fare,String name){
		
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new JToggleButton("A" + (i + 1));
			buttons[i].addActionListener(this);
		}
		this.fare  = fare;
		this.name = name;
		next.addActionListener(this);
	}
	
	public void initWindow(){
		
		GridLayout gl = new GridLayout(5,5,5,5);
		window.setLayout(gl);
		
		
		
//		window.add(A1);
//		window.add(A2);
//		window.add(A3);
//		window.add(A4);
//		
//		window.add(B1);
//		window.add(B2);
//		window.add(B3);
//		window.add(B4);
//		
//		window.add(A5);
//		window.add(A6);
//		window.add(A7);
//		window.add(A8);
//		
//		window.add(B5);
//		window.add(B6);
//		window.add(B7);
//		window.add(B8);
//		
//		window.add(A9);
//		window.add(A10);
//		
//		window.add(B9);
//		window.add(B10);
		
		for(int i = 0; i < buttons.length; i++){
			window.add(buttons[i]);
		
		
		}
		window.add(next);
		
	}
	
	
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Seats");
		window.setSize(350, 600);
		window.setLocation(500,80);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == next)
		{
			int count = 0;
			String s = "";
			
			for(int i = 0; i < buttons.length; i++){
				if(buttons[i].isSelected()){
					count++;
					s = s + buttons[i].getText() + ",";
				}
				
				
			}
			//System.out.println(fare);
			Booking b=new Booking(count,s,fare,name);
			b.showWindow();
			window.dispose();
			
			
		}
		
	}
	
}
