import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Inventory{
//	Book[] booklist;
	 ArrayList<Book> booklist = new ArrayList<Book>();
	public int Total;
	public double totalprice;
	public Inventory()
	{
//		booklist = new Book[25];
		booklist.add(new Fiction("Frankenstein", "Mary Shelley", 1818, "Horror", 6.99, 317357184, 3, false));
		booklist.add(new Fiction("Gothic Tales", "Elizabeth Gaskell", 1851, "Horro",16.70, 317287184, 4, false));
		booklist.add(new Fiction("Lenny & Lucy","Philip C. Stead", 2015, "Horro", 13.39, 312457184, 1, true));
		booklist.add(new Fiction("Dracula", "Bram Stoker", 1897, "Horro", 11.99, 312415184, 4, false));
		booklist.add(new Fiction("In a Dark, Dark Room", "Alvin Schwartz", 1985, "Horror", 6.84, 312457924, 1, true));
		booklist.add(new Fiction("And Then There Were None", "Agatha Christie", 2009 , "Mystery", 6.99, 312057924, 5, false));
		booklist.add(new Fiction("The Beast Must Die", "Nicholas Blake", 2012 , "Mystery", 8.59, 312057614, 3, false));
		booklist.add(new Fiction("The High Rise Private Eyes", "Cynthia Rylant", 2000 , "Mystery", 9.99, 302057924, 1, true));
		booklist.add(new Fiction("Sandrine's Case", "Thomas H. Cook", 2013 , "Mystery", 7.90, 312052924, 3, false));
		booklist.add(new Fiction("Who Pushed Humpty Dumpty?", "David Levinthal", 2012 , "Mystery", 8.79, 312000924, 2, true));		
		booklist.add(new Fiction("The Notebook", "Nicholas Sparks", 1996 , "Romance", 9.75, 312057884, 4, false));
		booklist.add(new Fiction("The Thorn Birds", "Colleen McCullough", 1977 , "Romance", 6.85, 311257884, 5, false));
		booklist.add(new Fiction("Frog in Love", "Max Velthuijs", 2005 , "Romance", 12.56, 355257884, 1, true));
		booklist.add(new Fiction("XO, OX: A Love Story", "Adam Rex", 2017 , "Romance", 11.83, 355227884, 1, true));
		booklist.add(new Fiction("Mr Darcy", "Alex Field ", 2011, "Romance", 8.24, 355907884, 2, true));
		
		booklist.add(new NonFiction("The Watcher: Jane Goodall’s Life With Chimps", "Jeanette Winter ", 2011, "Biography", 19.00, 355321884, 500));
		booklist.add(new NonFiction("Becoming", "Michelle Obama ", 2018, "Biography", 15.80, 355213098, 294));
		booklist.add(new NonFiction("Man's Search for Meaning", "Viktor Frankl ", 1946, "Biography", 14.85, 359999884, 524));
		booklist.add(new NonFiction("Steve Jobs", "Walter Isaacson ", 2011, "Biography", 12.98, 35332184, 124));
		booklist.add(new NonFiction("The Immortal Life of Henrietta Lacks", "Rebecca Skloot ", 2010, "Biography", 10.03, 35222524, 341));
		
		booklist.add(new Textbook("Calculus", "Ron Larson", 2017, "Education", 34.90, 435213098, 12, "Math", 321));
		booklist.add(new Textbook("US History", "Smithsonian Institution", 2015, "Education",44.99, 435234098, 11, "History", 145));
		booklist.add(new Textbook("Integrated Chinese", "Yuehua LIu", 2016, "Education", 39.20, 435773098, 10, "Foreign Language", 325));
		booklist.add(new Textbook("A History of the English Language", "Albert C. Baug", 2013, "Education", 29.00, 435213768, 9, "English", 611));	
		booklist.add(new Textbook("Physics for Scientists and Engineers", "Randall Knight", 2017,"Education", 56.99, 436613098, 12, "Science", 236));
		
	}
	
	public void calculatenum()
	{
		int numbooks = 0;
		for (Book b : booklist)
		{
			numbooks++;
		}
			System.out.println("There are a total of " + numbooks + " books.");		
	}
	
	public int getTotal()
	{
		return Total;
		
	}
	
	public double getPrice()
	{
		return totalprice;
		
	}
	public ArrayList<Book> getList()
	{
		return booklist;
	}
	Scanner newBook = new Scanner(System.in);

	public void NewNonFiction()
	{		
		System.out.println("Enter the Genre:");
        String Genre = newBook.nextLine();
        
        System.out.println("Enter the title of the new book:");
        String Title = newBook.nextLine();

        System.out.println("Enter the author of the new book:");
        String Author = newBook.nextLine();

        System.out.println("Enter the ID number of the new book:");
        long ID = newBook.nextLong();
        
        System.out.println("Enter the publish year of the new book:");
        int Year = newBook.nextInt();
        
        System.out.println("Enter the price of the new book:");
        double Price = newBook.nextDouble();
                
        System.out.println("Enter the length of the new book:");
        int Length = newBook.nextInt();
        
        
        booklist.add(new NonFiction(Title, Author, Year, Genre, Price, ID, Length));

	}
	
	public void NewFiction()
	{
		System.out.println("Enter the Genre:");
        String Genre = newBook.nextLine();
        
        System.out.println("Enter the title of the new book:");
        String Title = newBook.nextLine();

        System.out.println("Enter the author of the new book:");
        String Author = newBook.nextLine();

        System.out.println("Enter the ID number of the new book:");
        long ID = newBook.nextLong();
        
        System.out.println("Enter the publish year of the new book:");
        int Year = newBook.nextInt();
        
        System.out.println("Enter the price of the new book:");
        double Price = newBook.nextDouble();
        
        System.out.println("Enter the level of the new book(1-5):");
        int Level = newBook.nextInt();
        
        System.out.println("This is a picture book (true or false)");
        boolean PicBoolean= newBook.nextBoolean();
        
        booklist.add(new Fiction(Title, Author, Year, Genre, Price, ID, Level, PicBoolean));

	}
	
	public void NewTextbook()
	{
		System.out.println("Enter the Genre:");
        String Genre = newBook.nextLine();
        
        System.out.println("Enter the title of the new book:");
        String Title = newBook.nextLine();

        System.out.println("Enter the author of the new book:");
        String Author = newBook.nextLine();

        System.out.println("Enter the ID number of the new book:");
        long ID = newBook.nextLong();
        
        System.out.println("Enter the publish year of the new book:");
        int Year = newBook.nextInt();
        
        System.out.println("Enter the price of the new book:");
        double Price = newBook.nextDouble();
        
        System.out.println("Enter the length of the Textbook:");
        int Length = newBook.nextInt();
       
        System.out.println("Enter the subject of the Textbook:");
        String Subject = newBook.nextLine();
        
        System.out.println("Enter the grade level of the Textbook:");
        int Grade = newBook.nextInt();
        
  
        booklist.add(new Textbook(Title, Author, Year, Genre, Price, ID, Grade, Subject, Length));

	}
	
	public void displaytest()
	{
		Total =0;
		double totalprice = 0.0;
		Iterator it = booklist.iterator();
		while (it.hasNext())
        System.out.print("\n"+ it.next() + "--------------------------------------" + "\n");
		
	}

	
	public void getTotalPrice()
	{
		double totalprice = 0.0;
		for (Book b:booklist)
		{
			totalprice = totalprice + b.getPrice();
		}
		System.out.println("Total price of all books is $" +  totalprice);

	}
	

	}
	


