
import java.util.Scanner;
public class Ideone {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year:");
		
		a=s.nextInt();
		if(a%4  == 0 ){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is a non Leap year");
		
		}
	}

}