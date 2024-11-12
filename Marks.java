import java.util.Scanner;
public class Marks 
{

	public static void main(String[] args) 
	{
		// variable declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int a = sc.nextInt();
		
		//Conditional Statements
		if(a>=80)
		{
			System.out.println("Grade : Distinction");
		}
		else if(a>=70)
		{
			System.out.println("Grade : First Class");
		}
		else
		{
			System.out.println("Grade : Fail");
		}
		

	}

}
