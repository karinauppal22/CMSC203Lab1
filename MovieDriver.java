import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner beef = new Scanner(System.in);
	
	Movie boris = new Movie();
	
	String title;
	int tickets;
	String rating;
	
	
	System.out.println("Enter a movie: "); 
	title = beef.nextLine();
	boris.setTitle(title);
	
	System.out.println("Enter the rating of the movie:");
	rating = beef.nextLine();
	boris.setRating(rating);
	
	System.out.println("Enter the number of tickets sold for this movie: ");
	tickets = beef.nextInt();
	boris.setSoldTickets(tickets);
	
	System.out.println(boris.toString());
	System.out.println();
	
	String input;
	System.out.println("Do you want to enter another movie? y or n");
	beef.nextLine();
	char info;
	input=beef.nextLine();
	info = input.charAt(0);
	
	while (info == 'y') {
		System.out.println("Enter a movie: "); 
		title = beef.nextLine();
		boris.setTitle(title);
		
		System.out.println("Enter the rating of the movie:");
		rating = beef.nextLine();
		boris.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		tickets = beef.nextInt();
		boris.setSoldTickets(tickets);
		
		System.out.println(boris.toString());
		System.out.println();
		
		
		System.out.println("Do you want to enter another movie? y or n");
		beef.nextLine();
		input=beef.nextLine();
		info = input.charAt(0);
	}
	
}
	
}

