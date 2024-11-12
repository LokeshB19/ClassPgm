
public class Login 
{

	public static void main(String[] args) 
	{
		String User_id = "Lokesh";
		int password = 1234;
		
		if(User_id.equals ("Lokesh"))
		{
			System.out.print("User Name is Valid\n");
			if(password == 1234)
			{
				System.out.println("Vaild Password \nLogin Successful ");
			}
			else
			{
				System.out.println("Invaild Password \nLogin Unsuccessful");
			}
		}
		else
		{
			System.out.println("User Name is Invaild \nLogin Unsuccessful");
		}
	}

}
