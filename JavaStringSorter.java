import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		System.out.println("Enter the string that you would like to sort");
		Scanner reader = new Scanner(System.in); 
		String sortstring = reader.nextLine().toLowerCase();
		reader.close();
		
		char[] converter = sortstring.toCharArray();
		
		Arrays.sort(converter);
		
		for(char output : converter) {
			System.out.print(output + " ");
		}
		
	}
}