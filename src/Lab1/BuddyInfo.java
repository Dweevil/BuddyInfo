package Lab1;

public class BuddyInfo {

	private String name = new String();
	private String phone = new String();
	private String address = new String();
	
	
	public BuddyInfo(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		if(name != null) {
			this.name = name;
		}
		
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		if(phone != null) {
			this.phone = phone;
		}
		
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		if(address != null) {
			this.address = address;
		}
		
	}
	
}
