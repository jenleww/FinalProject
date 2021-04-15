
abstract public class Book implements BookAction {
	private String Title, Author, Genre, Subject;
	private double Price;
	private long ID;
	private int Year, Length, Level, Grade;
	private boolean PicBook;
	
	public Book (String bTitle,String bAuthor, int bYear, String bGenre, double bPrice, long bID)
	{
		Title = bTitle;
		Price = bPrice; 
		Author = bAuthor;
		ID = bID;
		Year = bYear;
		Genre = bGenre;
		
	}

	public String toString() {
		String result = "Title: " + Title + "\n";
		result += "Author: " + Author + "\n";
		result += "Genre: " + Genre + "\n";
		result += "Price: $" + Price + "\n";
		result += "ID: " + ID + "\n";
		result += "Publication Year: " + Year + "\n";
		return result;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
	public void Read()
	{
		System.out.println("Just read this book!");
	}
}