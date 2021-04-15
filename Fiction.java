import java.util.Scanner;

public class Fiction extends Book{
	private int Level;
	private boolean PicBook;
	public Fiction(String bTitle, String bAuthor, int bYear, String bGenre, double bPrice, long bID, int bLevel, boolean bPicBook) {
		super(bTitle, bAuthor, bYear, bGenre, bPrice, bID);
		// TODO Auto-generated constructor stub
		Level = bLevel;
		PicBook = bPicBook;
	}
	
	public String toString() {
		String result = super.toString();
		result += "Reading Level(1-5): " + Level + "\n";
		if (PicBook = true)
		{
			result += "This is a picture book" + "\n";
		}
		else 
		{
			result += "This is not a picture book" + "\n";
		}
		return result;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public boolean getPicBook() {
		return PicBook;
	}
	public void setPicBook(boolean picBook) {
		PicBook = picBook;
	}
	
	public void Read()
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("What level of book do you want to read?");
		int BookLevel = Scan.nextInt();
		if (BookLevel < Level)
		{
			System.out.println("The book you chose is too difficult for you! Please choose a different book.");
			System.out.println("Do you still want to read this book?");
			String Answer = Scan.next();
			if (Answer.equalsIgnoreCase("yes"))
					{
						System.out.println("Have fun reading! Would you like to know if this is a picture book?");
						String Ans = Scan.next();
						if (Ans.equalsIgnoreCase("yes"))
						{
							if (PicBook== true)
							{
								System.out.println("This is a picture book, you'll finish it fast!");
							}
							else if (PicBook==false)
							{
								System.out.println("This is not a picture book, you'll need some time to finish it");

				}
					}
				

		}
		else if (BookLevel == Level)
		{
			System.out.println("The book you chose is perfect for you! Have fun reading :)");
			System.out.println("Would you like to know if this is a picture book?");
			String Answer2 = Scan.next();
			if (Answer2.equalsIgnoreCase("yes"))
			{
				if (PicBook== true)
				{
					System.out.println("This is a picture book, you'll finish it fast!");
				}
				else if (PicBook==false)
				{
					System.out.println("This is not a picture book, you'll need some time to finish it");

			}
		}
		else if (BookLevel > Level)
		{
			System.out.println("The book you chose is easy difficult for you! Please choose a different book.");
			System.out.println("Do you still want to read this book?");
			String Answer1 = Scan.next();
			if (Answer.equalsIgnoreCase("yes"))
					{
				
						System.out.println("Have fun reading! Would you like to know if this is a picture book?");
						String Ans = Scan.next();
						if (Ans.equalsIgnoreCase("yes"))
						{
							if (PicBook== true)
							{
								System.out.println("This is a picture book, you'll finish it fast!");
							}
							else if (PicBook==false)
							{
								System.out.println("This is not a picture book, you'll need some time to finish it");

				}
					}
				
		
		}
		}
		}
		}
	}
}
	
