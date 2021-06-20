 package com.BusOwnerDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Bus.Bus;
import com.owner.owner;



public class BusOwnerDB {


	//Validate user name or password correct or incorrect
	public static String validate(String userName, String password) {
		String result = "fale";
		
		
		try {
			
			//validate user name and password
			Connection connect = BusOwnerDBConnection.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "select username,password from owner_details where username = '"+userName+"' and Password = '"+password+"'";
			ResultSet res = stm.executeQuery(sql);
			
			if(res.next()) {
				result = userName;
			}
			else {
				result = "fale";
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}//End Of the validate function..
	
	

	
	
	
	//Add new User
	public static boolean addBusOwner(String fname,String lname,String email,String phone,String address,String city,String zipCode,String userName,String password ) {
		boolean result = false;
		
		try {
			
			
			//add new user details
			Connection connect = BusOwnerDBConnection.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "insert into owner_details values(0,'"+userName+"','"+fname+"','"+lname+"','"+phone+"','"+email+"','"+address+"','"+city+"','"+zipCode+"','"+password+"')";
			int res = stm.executeUpdate(sql);
			
			if(res>0) {
				result = true;
			}
			else {
				result = false;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		//return state of user registration
		return result;
			
	}//End Of the addBusOwner method...
	
	
	
	
	
	
	
	//view user profile
	public static List<owner> details(String uName){
		//create array list to store the relevant user details
		ArrayList<owner> ow = new ArrayList<owner>();
		
		try {
			
			//get user details
			Connection connect = BusOwnerDBConnection.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "select * from owner_details where username = '"+uName+"'";
			ResultSet re = stm.executeQuery(sql);
			
			if(re.next()) {
				int id = re.getInt(1);
				String uname = re.getString(2);
				String fname = re.getString(3);
				String lname = re.getString(4);
				String phone = re.getString(5);
				String email = re.getString(6);
				String address = re.getString(7);
				String city = re.getString(8);
				String zipCode = re.getString(9);
			
				System.out.println(id);
			owner own = new owner(id,uname, fname, lname, phone, email, address, city, zipCode);
			ow.add(own);
			}
			
		}catch (Exception e) {
			e.getMessage();
		}
		//return user details
		return ow;
		
	}//End of The details method
	
	
	
	
	
	

	//update bus owner details
	public static boolean updateDetails(String id,String uname,String fname,String lname,String phone,String mail,String address,String city, String zipcode) {
		boolean rezult = false; 
		
		
		try {
		
			//validate user name and password
			Connection connect = BusOwnerDBConnection.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "update owner_details set username ='"+uname+"', fname='"+fname+"', lname='"+lname+"', phone='"+phone+"', email='"+mail+"', address='"+address+"',city='"+city+"', zipCode='"+zipcode+"' where id ='"+id+"' ";
			int res = stm.executeUpdate(sql);
			
			if(res>0) {
				rezult = true;
			}
			else {
				rezult = false;
			}
			
		}catch (Exception e) {
			e.getMessage();
		}
		
		//return state of update
		return rezult;
	}//End Of the updateDetails method..
	
	
	
	
	
	
	//add new bus
	public static boolean addBus(String id,String start, String end, String stTime, String endTime, String type, float fare,int seat,String name ) {
		boolean rezult = false;
		System.out.println(name);
		
		try {
			
			//insert new bus to the system
			Connection con = BusOwnerDBConnection.getConnection();
			Statement stm = con.createStatement();
			String sql = "insert into bus_details.bus_details values('"+id+"','"+start+"','"+end+"','"+stTime+"','"+endTime+"','"+type+"','"+seat+"','"+fare+"','"+name+"')";
			int rs = stm.executeUpdate(sql);
			
			if(rs>0) {
				rezult = true;
				System.out.println(rezult);
			}
			else {
				rezult = false;
				System.out.println(rezult);
			}
		}catch (Exception e) {
			e.getMessage();
		}
		
		return rezult;
	}//End Of The addBus method
	
	
	
	
	
	//view bus details
	public static List<Bus> viewBusDetails(String uname){
		//create array list to store the relevant user details
		ArrayList<Bus> details = new ArrayList<Bus>();
		
		try {
			
			//write SQL quarry retrieve bus details
			Connection connect = BusOwnerDBConnection.getConnection();
			Statement stm = connect.createStatement();
			String sql = "select b.* from bus_details.bus_details b, owner_details o where b.userName=o.username and b.userName = '"+uname+"'";
			ResultSet re = stm.executeQuery(sql);
			
			System.out.println(uname);
			//if Quarry execute correct assign relevant table value to designed variable
			while(re.next()) {
				String id = re.getString(1);
				String from = re.getString(2);
				String to = re.getString(3);
				String departure = re.getString(4);
				String arrival = re.getString(5);
				String type = re.getString(6);
				int seats = re.getInt(7);
				float far = re.getFloat(8);
				String unames = re.getString(9);
				
				
				
				Bus bDetails = new Bus(id, from, to, departure, arrival, type, seats, far,unames);
				details.add(bDetails);
				
				System.out.println(details);
			}
			
		}catch (Exception e) {
			e.getMessage();
		}
		
		
		return details;
	}
	
	
	
	//Delete Bus Details
	public static boolean deleteDetails(String busId) {
		boolean rezult = false;
		
		try {
			
			//Delete bus Details
			Connection connect = BusOwnerDBConnection.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "delete from bus_details.bus_details where busID = '"+busId+"' ";
			int res = stm.executeUpdate(sql);
			
			if(res>0) {
				rezult = true;
			}
			else {
				rezult = false;
			}
			
			
		}catch (Exception e) {
			e.getMessage();
		}
		
		return rezult;
	}

}//End Of The BusOwnerDB Class
