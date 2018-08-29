import java.util.Scanner;

public class variable
{
	public static void main(String[] args)
	{
		int value;
		Scanner scan = new Scanner(System.in);
		
		value = 5;
		System.out.println("The value is " + value);
		System.out.println("Input a value to add:");
		int user = scan.nextInt();
		System.out.println("The new value is " + (value + user));
		scan.close();
	}
}