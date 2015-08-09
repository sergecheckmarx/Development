import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Simple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Hello World");
		System.out.println("Enter confidential information:");
		String input = br.readLine();
		String [] s = args;
		
		displayMessages(s);
	}
	
	private static void displayMessages(String [] s)
	{
		System.out.println("What a wonderful day!");
		System.out.println("See you later!");
		System.out.println("Here we are!");
		System.out.println("Ready?");
		System.out.println("Go!");
		System.out.println("and Rego for the last time!");
		
		
	}

}
