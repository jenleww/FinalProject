import java.util.Scanner;

public class Textbook extends NonFiction{
	private int Grade;
	private String Subject;


	public Textbook(String bTitle, String bAuthor, int bYear, String bGenre, double bPrice, long bID, int bGrade, String bSubject, int blength) {
		super(bTitle, bAuthor, bYear, bGenre, bPrice, bID, blength);
		// TODO Auto-generated constructor stub
		Grade = bGrade;
		Subject = bSubject;
		
	}
	public String toString() {
		String result = super.toString();
		result += "Grade: " + Grade + "\n";
		result += "Subject: " + Subject + "\n";
		return result;
	}
	
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	public void Read()
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("What kind of textbook is this?" + "\n" + "1. non-STEM" + "\n" + "2. STEM");
		int Ans = Scan.nextInt(); 
		if (Ans==2)
		{
			System.out.println("For a STEM book, you will need to do problems to practice your skills! Type " +" \"Done\" " + " when you have finished practicing.");
			String Done = Scan.next();
				if (Done.equalsIgnoreCase("done"))
				{
					System.out.println("Congratulations! You finished doing your work! What did you learn?");
					String Work = Scan.next();
					System.out.println("Nice!");
	
				}
		}
		else if (Ans==1)
		{
			System.out.println("For a non-STEM book, you can just read the textbook!");
			System.out.println("How many pages do you want to read?");
			int Pages = Scan.nextInt(); 
			if (Pages > super.getLength())
			{
				System.out.println("Sorry, there are only " + super.getLength() + " pages in this book.");
			}
			else 
			{
				Double pages = Double.valueOf(Pages);
				Double length = Double.valueOf(super.getLength());
			   	double percent =100*(pages/super.getLength());
			   	double Percentage = Math.round(percent);
				System.out.println("You just read " + Percentage + "% of this book!");
			}
		}
		

	}
}
