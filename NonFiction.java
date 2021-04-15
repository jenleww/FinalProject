import java.util.Scanner;

public class NonFiction extends Book {
	private int Length;
	private String Genre;
	Scanner Scan = new Scanner(System.in);

	public NonFiction(String bTitle, String bAuthor, int bYear, String bGenre, double bPrice, long bID, int blength) {
		super(bTitle, bAuthor, bYear, bGenre, bPrice, bID);
		Length = blength;
		Genre = bGenre;
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	
	public String toString() {
		String result = super.toString();
		result += "Length: " + Length + "\n";
		
		return result;
	}
	public void Read()
	{
		System.out.println("How many pages do you want to read?");
		int Pages = Scan.nextInt(); 
		if (Pages > Length)
		{
			System.out.println("Sorry, there are only " + Length + " pages in this book.");
		}
		else 
		{
			Double pages = Double.valueOf(Pages);
			Double length = Double.valueOf(Length);
		   	double percent =100*(pages/Length);
		   	double Percentage = Math.round(percent);
			System.out.println("You just read " + Percentage + "% of this book!");
		}
	}
}
	

