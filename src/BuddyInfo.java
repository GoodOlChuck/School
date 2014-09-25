
public class BuddyInfo {
	
	String name,address,phonenumber; 
	
	
	public BuddyInfo(String name, String address, String phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getInfo(){
		String info="";
		info= "Name: "+getName()+"\n"+"Address: "+getAddress()+"\n" +"Phone Number: "+getPhonenumber()+"\n";
		return info;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo("Jim", "123 Maple Street","613-123-1234");
		System.out.println(buddy.getInfo());
		
	}

}
