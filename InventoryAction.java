import java.util.ArrayList;
import java.util.Scanner;

public class InventoryAction {
	Scanner Scan = new Scanner(System.in);
	//NewInventory Newbooks = new NewInventory();
	Inventory BookStore = new Inventory();
	ArrayList <Book> booklist = BookStore.getList();

public void SeeInventory()
{
	BookStore.displaytest();
	
}

public void NumBooks()
{
	BookStore.calculatenum();
}

public void TotalPrice()
{
	BookStore.getTotalPrice();
}


public void AddBook()
{
	ArrayList <Book> booklist = BookStore.getList();

	System.out.println("What type of book would you like to add?" + "\n" + "NonFiction"+"\n" + "Fiction"+ "\n" + "Textbook");
	String Add = Scan.nextLine(); 
	if (Add.toUpperCase().equals("NONFICTION")||Add.toUpperCase().equals("NON-FICTION")||Add.toUpperCase().equals("NON FICTION"))
	{
		BookStore.NewNonFiction();
	}
	
	if (Add.toUpperCase().equals("FICTION"))
	{
		BookStore.NewFiction();
	}
	
	if (Add.toUpperCase().equals("TEXTBOOK"))
	{
		BookStore.NewTextbook();
	}

	System.out.println("Would you like to add anymore books?");
	String NewBookQuestion = Scan.nextLine(); 
	while (NewBookQuestion.toUpperCase().equals("YES"))
	{
		System.out.println("What type of book would you like to add?" + "\n" + "NonFiction"+"\n" + "Fiction"+ "\n" + "Textbook");
		String NAdd = Scan.nextLine(); 
		if (NAdd.toUpperCase().equals("NONFICTION")||NAdd.toUpperCase().equals("NON-FICTION")||NAdd.toUpperCase().equals("NON FICTION"))
		{
			BookStore.NewNonFiction();
		}
		
		if (NAdd.toUpperCase().equals("FICTION"))
		{
			BookStore.NewFiction();
		}
		
		if (NAdd.toUpperCase().equals("TEXTBOOK"))
		{
			BookStore.NewTextbook();
		}
		BookStore.displaytest();
		System.out.println("Total number of books: " + (booklist.size()) + "\n" + "Total price of books: $" + BookStore.getPrice());


		System.out.println("Would you like to add anymore books?");
		NewBookQuestion = Scan.nextLine(); 
	}
}
	public void Remove()
	{
		System.out.println("Please choose the book you want to remove");
		Scanner Scan = new Scanner(System.in);
		String Book1 = Scan.nextLine(); 
	for (int i=0;i<booklist.size();i++)
		{
		if (Book1.equalsIgnoreCase((booklist.get(i).getTitle())))	
			{
				booklist.remove(i);
				System.out.println("The book " + Book1+ " was removed!");
				}
		
			}
		}
	
	public void Read()
	{
		System.out.println("Please enter the type of book you want to read");
		Scanner Scan = new Scanner(System.in);
		String Type = Scan.nextLine(); 
		if (Type.equalsIgnoreCase("Textbook"))
			{
			System.out.println("Please choose the book you want to read");
			
			String Book1 = Scan.nextLine(); 
			
				for (int i=0;i<booklist.size();i++)
				{

					if (Book1.equalsIgnoreCase(booklist.get(i).getTitle()))
					{
						booklist.get(i).Read();
					}
					
				}
			}
		if (Type.equalsIgnoreCase("Nonfiction"))
		{
			System.out.println("Please choose the book you want to read");
			
			String Book1 = Scan.nextLine(); 
			
				for (int i=0;i<booklist.size();i++)
				{

					if (Book1.equalsIgnoreCase(booklist.get(i).getTitle()))
					{
						booklist.get(i).Read();
					}
					
				}
		}
		
		if (Type.equalsIgnoreCase("Fiction"))
		{
			System.out.println("Please choose the book you want to read");
			
			String Book1 = Scan.nextLine(); 
			
				for (int i=0;i<booklist.size();i++)
				{

					if (Book1.equalsIgnoreCase(booklist.get(i).getTitle()))
					{
						booklist.get(i).Read();	
					}
					
				}
		}
	}
	
	public void ReadNonFic()
	{
		System.out.println("How many pages do you want to read?");
		int Pages = Scan.nextInt(); 
	}
	
	public void Change() {
		System.out.println("Please enter the type of book you want to change");
		Scanner Scan = new Scanner(System.in);
		String Type = Scan.nextLine(); 
		if (Type.equalsIgnoreCase("Textbook"))
			{
			System.out.println("Please choose the book you want to change");
			
			String Book1 = Scan.nextLine(); 
			
				for (int i=0;i<booklist.size();i++)
				{

					if (Book1.equalsIgnoreCase(booklist.get(i).getTitle()))
					{
					
					System.out.println(booklist.get(i));
					System.out.println("Found your book! What would you like to change?");
					System.out.println("1. Title " + "\n"+ "2. Author"+ "\n"+ "3. Year"+ "\n"+ "4. Genre"+ "\n"+ "5. Price"+ "\n"+ "6. ID"+ "\n"+ "7. Grade"+ "\n"+ "8. Subject"+ "\n"+ "9. Length" );
					String Answer = Scan.nextLine(); 
						if (Answer.equalsIgnoreCase("Title"))
						{
							System.out.println("Enter the new title");
							String newTitle = Scan.nextLine(); 
							booklist.get(i).setTitle(newTitle);
							Textbook text = (Textbook) booklist.get(i);
							text.setTitle(newTitle);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Author"))
						{
							System.out.println("Enter the new author");
							String newAuthor = Scan.nextLine(); 
							booklist.get(i).setAuthor(newAuthor);
							Textbook text = (Textbook) booklist.get(i);
							text.setAuthor(newAuthor);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Year"))
						{
							System.out.println("Enter the new year");
							int newYear= Scan.nextInt(); 
							booklist.get(i).setYear(newYear);
							Textbook text = (Textbook) booklist.get(i);
							text.setYear(newYear);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Genre"))
						{
							System.out.println("Enter the new genre");
							String newGenre = Scan.nextLine(); 
							booklist.get(i).setGenre(newGenre);
							Textbook text = (Textbook) booklist.get(i);
							text.setGenre(newGenre);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("Price"))
						{
							System.out.println("Enter the new price");
							double newPrice = Scan.nextDouble(); 
							booklist.get(i).setPrice(newPrice);
							Textbook text = (Textbook) booklist.get(i);
							text.setPrice(newPrice);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("ID"))
						{
							System.out.println("Enter the new ID");
							long newID = Scan.nextLong(); 
							Textbook text = (Textbook) booklist.get(i);
							text.setID(newID);
							System.out.println(booklist.get(i));
						}
						
						if (Answer.equalsIgnoreCase("Grade"))
						{
							System.out.println("Enter the new grade");
							int newGrade = Scan.nextInt(); 
							Textbook text = (Textbook) booklist.get(i);
							text.setGrade(newGrade);
							System.out.println(booklist.get(i));
						}
						
						if (Answer.equalsIgnoreCase("Subject"))
						{
							System.out.println("Enter the new subject");
							String newSubject = Scan.nextLine(); 
							Textbook text = (Textbook) booklist.get(i);
							text.setSubject(newSubject);
							System.out.println(booklist.get(i));
						}
						
						if (Answer.equalsIgnoreCase("Length"))
						{
							System.out.println("Enter the new length");
							int newLength = Scan.nextInt(); 
							Textbook text = (Textbook) booklist.get(i);
							text.setLength(newLength);
							System.out.println(booklist.get(i));
						}
						
						
				}
				}
				}
		if (Type.equalsIgnoreCase("Nonfiction"))
		{
				System.out.println("Please choose the book you want to change");
			
				String Book = Scan.nextLine(); 
				for (int i=0;i<booklist.size();i++)
				{
					if (Book.equalsIgnoreCase((booklist.get(i).getTitle())))
					{
					
						System.out.println(booklist.get(i));
						System.out.println("Found your book! What would you like to change?");
						System.out.println("1. Title " + "\n"+ "2. Author"+ "\n"+ "3. Year"+ "\n"+ "4. Genre"+ "\n"+ "5. Price"+ "\n"+ "6. ID"+ "\n"+  "7. Length" );
						String Answer = Scan.nextLine(); 
						if (Answer.equalsIgnoreCase("Title"))
						{
							System.out.println("Enter the new title");
							String newTitle = Scan.nextLine(); 
							booklist.get(i).setTitle(newTitle);
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setTitle(newTitle);
							System.out.println(booklist.get(i));	
						}
						if (Answer.equalsIgnoreCase("Author"))
						{
							System.out.println("Enter the new author");
							String newAuthor = Scan.nextLine(); 
							booklist.get(i).setAuthor(newAuthor);
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setAuthor(newAuthor);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Year"))
						{
							System.out.println("Enter the new year");
							int newYear= Scan.nextInt(); 
							booklist.get(i).setYear(newYear);
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setYear(newYear);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Genre"))
						{
							System.out.println("Enter the new genre");
							String newGenre = Scan.nextLine(); 
							booklist.get(i).setGenre(newGenre);
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setGenre(newGenre);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("Price"))
						{
							System.out.println("Enter the new price");
							double newPrice = Scan.nextDouble(); 
							booklist.get(i).setPrice(newPrice);
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setPrice(newPrice);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("ID"))
						{
							System.out.println("Enter the new ID");
							long newID = Scan.nextLong(); 
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setID(newID);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("Length"))
						{
							System.out.println("Enter the new length");
							int newLength = Scan.nextInt(); 
							NonFiction nonfiction = (NonFiction) booklist.get(i);
							nonfiction.setLength(newLength);
							System.out.println(booklist.get(i));
						}
					}
				}
		}
		if (Type.equalsIgnoreCase("fiction"))
		{
				System.out.println("Please choose the fiction book you want to change");
			
				String Book = Scan.nextLine(); 
				for (int i=0;i<booklist.size();i++)
				{
					if (Book.equalsIgnoreCase((booklist.get(i).getTitle())))
					{
					System.out.println(booklist.get(i));
					System.out.println("Found your book! What would you like to change?");
					System.out.println("1. Title " + "\n"+ "2. Author"+ "\n"+ "3. Year"+ "\n"+ "4. Genre"+ "\n"+ "5. Price"+ "\n"+ "6. ID"+ "\n"+ "7. Picture Book"+ "\n"+ "8. Level" );
					String Answer = Scan.nextLine(); 
						if (Answer.equalsIgnoreCase("Title"))
						{
							System.out.println("Enter the new title");
							String newTitle = Scan.nextLine(); 
							booklist.get(i).setTitle(newTitle);
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setTitle(newTitle);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("Author"))
						{
							System.out.println("Enter the new author");
							String newAuthor = Scan.nextLine(); 
							booklist.get(i).setAuthor(newAuthor);
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setAuthor(newAuthor);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Year"))
						{
							System.out.println("Enter the new year");
							int newYear= Scan.nextInt(); 
							booklist.get(i).setYear(newYear);
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setYear(newYear);
							System.out.println(booklist.get(i));						}
						if (Answer.equalsIgnoreCase("Genre"))
						{
							System.out.println("Enter the new genre");
							String newGenre = Scan.nextLine(); 
							booklist.get(i).setGenre(newGenre);
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setGenre(newGenre);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("Price"))
						{
							System.out.println("Enter the new price");
							double newPrice = Scan.nextDouble(); 
							booklist.get(i).setPrice(newPrice);
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setPrice(newPrice);
							System.out.println(booklist.get(i));
						}
						if (Answer.equalsIgnoreCase("ID"))
						{
							System.out.println("Enter the new ID");
							long newID = Scan.nextLong(); 
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setID(newID);
							System.out.println(booklist.get(i));
						}
						
						if (Answer.equalsIgnoreCase("Level"))
						{
							System.out.println("Enter the new level");
							int newLevel = Scan.nextInt(); 
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setLevel(newLevel);
							System.out.println(booklist.get(i));
							}
					
						if (Answer.equalsIgnoreCase("Picture Book"))
						{
							System.out.println("Enter true or false for picture book");
							boolean newPicBook = Scan.nextBoolean(); 
							Fiction fiction = (Fiction) booklist.get(i);
							fiction.setPicBook(newPicBook);
							System.out.println(booklist.get(i));
						}
						
						
					}
				}
		}
		}
}
	






