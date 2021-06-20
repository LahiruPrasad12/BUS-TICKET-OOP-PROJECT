package Admin;

public class Owners {
	
	private String userName;
	private String fname;
	private String lname;
	private String phone;
	private String mail;
	private String address;
	private String city;
	private String zipcode;
	
	public Owners(String userName, String fname, String lname, String phone, String mail, String address, String city,String zipcode) {
		this.userName = userName;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.mail = mail;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public String getPhone() {
		return phone;
	}

	public String getMail() {
		return mail;
	}



	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}


	

}
