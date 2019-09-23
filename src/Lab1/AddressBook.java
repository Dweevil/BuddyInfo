package Lab1;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			this.buddyInfo.add(buddy);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		else {
			return null;
		}
	}
	
	public static void main(String args[]) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613-123-123");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
	}
}
