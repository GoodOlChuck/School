import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook(){
		this.buddyInfo = new ArrayList<BuddyInfo>();
		
	}
	public void addBuddy(BuddyInfo buddy){
		this.buddyInfo.add(buddy);
	}
	
	public BuddyInfo removeBuddy(int index){
		if(index >= 0 && index < this.buddyInfo.size()){
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo buddy = new BuddyInfo("Jim", "123 Maple Street","613-123-1234");
		AddressBook addressbook = new AddressBook();
		addressbook.addBuddy(buddy);
		addressbook.removeBuddy(0);
		System.out.println("Hello? You There?");
		
	}
}
