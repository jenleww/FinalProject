import java.util.Scanner;
public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login StoreLogin = new Login();
		InventoryAction InventoryAction = new InventoryAction();
		Inventory BookStore = new Inventory();
		StoreLogin.Login();
		Scanner Scan = new Scanner(System.in);
		System.out.println("Would you like to do something?");
		String Answer = Scan.nextLine(); 
while (Answer.toUpperCase().equals("YES")) {
		System.out.println("What would you like to do"+ "\n" + "A. See inventory" + "\n" + "B. Add a Book" + "\n" +"C. Change Book Information"+ "\n" +"D. Remove a book"+ "\n" + "E. See Total Price of Books"+ "\n" + "F. See Total Number of Books"+ "\n" + "G. Read a Book" + "\n" + "H. Logout");
		String Answer2 = Scan.nextLine(); 

			if (Answer2.toUpperCase().equals("A"))
			{
				InventoryAction.SeeInventory();
			}
			if (Answer2.toUpperCase().equals("B"))
			{
				InventoryAction.AddBook();
			}
			if (Answer2.toUpperCase().equals("C"))
			{
				InventoryAction.Change();
			}
			if (Answer2.toUpperCase().equals("D"))
			{
				InventoryAction.Remove();
			}
			if (Answer2.toUpperCase().equals("E"))
			{
				InventoryAction.TotalPrice();
			}
			if (Answer2.toUpperCase().equals("F"))
			{
				InventoryAction.NumBooks();
			}
			if (Answer2.toUpperCase().equals("G"))
			{
				InventoryAction.Read();
			}
			if (Answer2.toUpperCase().equals("H"))
			{
				System.out.println("You have logged out.");
				System. exit(0);
				StoreLogin.Login();
			}
			
		System.out.println("Would you like to do something?");
		Answer = Scan.nextLine(); 
}
	}

}
