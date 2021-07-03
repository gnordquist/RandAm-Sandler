import java.util.ArrayList;
import java.util.Scanner;

public class RecursiveRandAmSandlerMovieGenerator {

	public static void main(String[] args) {
		
		ArrayList<String> movieList = new ArrayList<String>();
		movieList.add("Billy Madison");
		movieList.add("50 First Dates");
		movieList.add("Happy Gilmore");
		movieList.add("The Waterboy");
		movieList.add("Big Daddy");
		movieList.add("Little Nicky");
		movieList.add("The Wedding Singer");
		movieList.add("The Longest Yard");
		movieList.add("Anger Management");
		movieList.add("Spanglish");
		movieList.add("The Hot Chick");
		movieList.add("Click");
		movieList.add("Going Overboard");
		movieList.add("Funny People");
		movieList.add("Mr. Deeds");
		movieList.add("You Don't Mess with the Zohan");
		
		getMovie(movieList, true);
		
	}
		
	@SuppressWarnings("resource")
	
	public static void getMovie(ArrayList<String> movieList, boolean firstRecursion) {
		
		if (movieList.size() == 0) {
			System.out.println("Oops! There are no more movies left. You are either not a Adam Sandlar fan or you are simply too picky.\n\n"
					+ "Please restart RandAm Sandler when you become more resonable.");
			return;
		}
		
		int movie = (int)(Math.random()* movieList.size());
		String response = "YES";
		
		if (firstRecursion) {
			System.out.println("Would you like to watch a classic Adam Sandler movie today? Enter: YES or NO" + "\n");
			Scanner scan = new Scanner(System.in);
			response = scan.nextLine();
		}
		
		if(response.equalsIgnoreCase("YES")) {
			System.out.println("Your chosen RandAm Sandler movie is: '" + movieList.get(movie) + "'\n");
			System.out.println("Are you happy with this RandAm selection? Enter: YES or NO" + "\n");
			Scanner scanAgain = new Scanner(System.in);
		    String newResponse = scanAgain.nextLine();
		    
		    if(newResponse.equalsIgnoreCase("YES")) {
		    	System.out.println("Great! I hope you enjoy watching '" + movieList.get(movie) + "'!\n");
		    }
		    else if(newResponse.equalsIgnoreCase("NO")) {
		    	System.out.println("No problem. Let me procure you another RandAm selection." + "\n");
		    	movieList.remove(movie);
		    	getMovie(movieList, false);
		    }
		    else {
		    	System.out.println("Sorry, I do not recognize your response. Let me procure another RandAm Sandlar selection for you." + "\n");
				getMovie(movieList, false);
		    }
		}
		
		else if(response.equalsIgnoreCase("NO")) {
			System.out.println("Well what are you doing here then??" + "\nRestart RandAm Sandlar when you are ready to watch a great movie.");
		}
		else {
			System.out.println("Sorry, I do not recognize your response. Try again." + "\n");
			getMovie(movieList, true);
		}
	}
}
