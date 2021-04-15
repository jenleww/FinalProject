import java.util.Scanner;

public class Login {
	
	public void Login() {
	System.out.println("Welcome to the BookStore!");
	Scanner login = new Scanner(System.in);
	String Username = "user";
	Integer Password = 2020;
	System.out.println("Login to Access Bookstore");
	for (int i=0; i<3; i++) {
	System.out.println("Username: ");
	String UInput = login.nextLine();
	System.out.println("Password: ");
	int PInput = login.nextInt(); 
	if (Username.equals(UInput)&& Password.equals(PInput))
	{
		System.out.println("Login Successful!");
		break;
	}
	else 
	{
		if (i<2) {
		System.out.println("Incorrect username or password. Try Again. " + (2-i) + " Attempts left");
		}
		if (i==2) {
		System.out.println("Incorrect username or password. " + " 0 Attempts left");

		System.exit(1);
	}
	}
	}


}
}
