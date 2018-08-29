// https://www.codejava.net/java-se/file-io/3-ways-for-reading-input-from-the-user-in-the-console

import java.io.Console;
import java.util.Scanner;


public class login
{
	public static void main(String[] args)
	{
		int value;
		int x = 1;
		Console console = System.console();
		
		System.out.print("Enter your username: ");
		String username = console.readLine();
		
		System.out.print("Enter your password: ");
		char[] password = console.readPassword();
		
		System.out.println("Your username is " + username);
		System.out.println("Your password is " + String.valueOf(password));
		
		while(x == 1)
		{
			System.out.print("Stored Username?: ");
			String newuser = console.readLine();

			System.out.print("Stored Password?: ");
			char[] newpass = console.readPassword();
		
		/*	Scanner input1 = new Scanner(System.in);
			System.out.println("Stored Username: ");
			String newuser = input1.next();
			
			Scanner input2 = new Scanner(System.in);
			System.out.println("Stored Password: ");
			String newpass = input2.next();
		*/	
			if (newuser.equals(username) && (String.valueOf(newpass).equals(String.valueOf(password))))
			{
				System.out.println("Login Successful");
				x = 2;
			}
			else if (newuser.equals(username))
			{
				System.out.println("Incorrect Password");
			}
			else	
			{
				System.out.println("Invalid Username");
			}
		}	
	}
}
