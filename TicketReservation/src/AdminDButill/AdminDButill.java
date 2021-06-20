package AdminDButill;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Admin.*;

public class AdminDButill {
	
	public static ArrayList<Owners> getOwners(){
		
		ArrayList<Owners> owners = new ArrayList<>();

		try {
			Connection con  = getDBconnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "select * from owner_details";
			ResultSet result = stmt.executeQuery(sql);
			
			while(result.next()) {
				String username = result.getString(2);
				String firstname = result.getString(3);
				String lastname = result.getString(4);
				String contact = result.getString(5);
				String emailAddress = result.getString(6);
				String address = result.getString(7);
				String city = result.getString(8);
				String zipCode = result.getString(9);
			
				Owners h = new Owners(username, firstname, lastname, contact, emailAddress, address, city,zipCode);
				owners.add(h);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return owners;	
	}
	
	
	
	public  static boolean delete(String uid) {
		boolean ans = false;
		
		try {
			System.out.println(uid);
			Connection con  = getDBconnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "delete from owner_details where username = '"+uid+"'";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				ans=true;
				System.out.println(ans);
			}else {
				ans=false;
				System.out.println(ans);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return ans;
	}
	
	
	
	
	public static ArrayList<Buses> getBuses(){
		
		ArrayList<Buses> buses = new ArrayList<>();

		try {
			Connection con  = getDBconnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "select * from bus_details";
			ResultSet result = stmt.executeQuery(sql);
			
			while(result.next()) {
				String busID = result.getString(1);
				String startPlace = result.getString(2);
				String endPlace = result.getString(2);
				String departureTime = result.getString(4);
				String arrivalTime = result.getString(5);
				String type = result.getString(6);
				int numOfSeats = result.getInt(7);
				float fare = result.getFloat(7);
				String userName = result.getString(9);

				Buses h = new Buses(busID, startPlace, endPlace, departureTime, arrivalTime, type, numOfSeats, fare, userName);
				buses.add(h);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return buses;	
	}
	
	
	public  static boolean deleteBus(String bID) {
		boolean ans = false;
		
		try {
			System.out.println(bID);
			Connection con  = getDBconnection.getConnection();
			Statement stmt  = con.createStatement();
			String sql = "delete from bus_details where busID = '"+bID+"'";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				ans=true;
				System.out.println(ans);
			}else {
				ans=false;
				System.out.println(ans);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return ans;
	}
	
	
}
