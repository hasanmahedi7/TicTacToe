package publicTransport;
import java.io.*;
import java.util.*;


public class Info {

	private  String name;
	private String password;
	private String email;
	
	
	private String country;
	
	private String phone;

	private int count;
	
	public Info(){
		
	}
	
	public Info(String name,  String password,String email, String country, String phone){

		this.name = name;
		this.password = password;
		this.email = email;
		this.country = country;
		this.phone = phone;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	public Info[] getFileInfo(){
		
		File file=new File("info.txt");
		Info[] IC=new Info[1000];
		int i=0;
		try{
				Scanner scan=new Scanner(file);
				while(scan.hasNextLine()==true){
					name=scan.nextLine();
					
					password=scan.nextLine();
					
					
					email=scan.nextLine();
					
					phone=scan.nextLine();
					
					country=scan.nextLine();
					
					
					
					IC[i]= new Info(name,password,email,country,phone);
					i++;			
				}
				count=i;
				
				scan.close();	
			
		}
		catch(Exception e){
			System.out.println("Problem while getting info from file");
		}
	
		return IC;
		
	}
	
	
	public void fileWrite(Info[] info,int count){
		File file=new File("info.txt");
		Info b=new Info();
		try{
			
			
			FileWriter fw = new FileWriter(file,false);
			
			
			for(int i=0;i<count;i++){
				if(i>0){
					
					fw.write("\n");
				}
				fw.write(info[i].getName()+"\n");
				fw.write(info[i].getPassword()+"\n");
				
				fw.write(info[i].getEmail()+"\n");
				fw.write(info[i].getPhone()+"\n");
				fw.write(info[i].getCountry()+"\n");
				
			}
			
			fw.close();
		}
			catch(Exception x){
				System.out.println("Problem with writing into file");
			}
		
	}
	
	
}
