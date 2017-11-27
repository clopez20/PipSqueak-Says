import java.util.ArrayList;
import java.util.Scanner;
public class Movie{

    static ArrayList<Movie> movieList = new ArrayList<Movie>();

    String title;
    double avgRating = 0;
    int yearReleased;
    String summary;
    ArrayList<Review> reviews;
    
    public Movie(String title, int yearReleased, String summary){
	this.title = title;
	this.yearReleased = yearReleased;
	this.summary = summary;
	reviews = new ArrayList<Review>();
}

    public void addReview(double rating, String theReview){
	Review newReview = new Review(rating, theReview);
	reviews.add(newReview);
	updateAvgRating();
	
}
    public void printReviews(){
	for(int i = 0; i < reviews.size(); i++){
	    System.out.println(reviews.get(i).theReview);
	}
    }
    
    public void updateAvgRating(){
	double total = 0;
	for(int i = 0; i < reviews.size(); i++){
	   total += reviews.get(i).rating;
	}
	
	avgRating= (total / reviews.size());
	
    }
    
    public static void main(String[] args){
    
	Scanner keyboard = new Scanner(System.in);
	Scanner input;
	Scanner scanner;
   
	String title, summary;
	int date;
	Movie userMovie;

	System.out.println("Welcome to PipSqueak Says!");
	
	System.out.println("Type: 'movies', 'suggested film', or 'quiz'");
	Scanner newScan = new Scanner(System.in);
	if(newScan.nextLine().equals("movies")){
	   Scanner newScan2 = new Scanner(System.in);
	   System.out.println("What order would you like to see the list: 'alphabetical', 'most popular', or by 'date released'?");
	   if(newScan2.nextLine().equals("alphabetical")){
	       //call on a method that print the movie list in alphabetical
	   }
           if(newScan2.nextLine().equals("most popular")){
	       //call on a method that prints the movie list by highest rate
	   } 
	   if(newScan2.nextLine().equals("date released")){
	       //call on a method that prints the movie list by date released
	   }
	}
	else if(newScan.nextLine().equals("suggested film")){
	    //do some random function
	}
	else if(newScan.nextLine().equals("quiz")){
	    //create some other method that asks fun facts about movies. Perhaps make in another class
	}
    
	System.out.println("");
	System.out.println("Wanna add a movie we don't have? Type yes to add a movie");
	String answer = keyboard.nextLine();

	while(answer.equals("yes")){
	    input = new Scanner(System.in);
	    scanner = new Scanner(System.in);
	    System.out.println("Enter movie title");
	    title = input.nextLine();
	    System.out.println("Enter the year it was released");
	    date = input.nextInt();
	    System.out.println("Enter a summary of the movie: ");
	    summary = scanner.nextLine();
	    userMovie = new Movie(title, date, summary);
	    movieList.add(userMovie);
	    printMovieList();
	    System.out.println("Would you like to add another movie?");
	    answer = scanner.next();
	}
	System.out.println("Thanks for contributing to our movie list: ");
	printMovieList();
    
   
		
	    

    }
    
    public static void createMovieList(){
	Movie aladdin = new Movie("Aladdin", 1992, "A street rat finds a lamp and love.");
	Movie dalmations = new Movie("101 Dalmations", 1961, "101 puppies are born to two loving dogs.");
	Movie moana = new Movie("Moana", 2016, "A young girl goes on a journey to save her island.");
	Movie lion = new Movie("The Lion King", 1994, "A young lion Simba, heir of his father, must overcome his wicked uncle before he gets the throne.");
	Movie mermaid = new Movie("The Little Mermaid", 1989, "A mermaid princess makes a bargain with an evil sea witch to meet a human prince on land.");
	Movie white = new Movie("Snow White", 1937, "Exiled into the dangerous forest by her wicked stepmother, a princess finds a cabin of dwarf miners.");
	Movie bambi = new Movie("Bambi", 1942, "After losing his mother, a young buck learns the way of the forrest.");
	Movie cindy = new Movie("Cinderella", 1950, "Forced into servitude by her stepmother and two stepsisters, a young woman wishes for more in life.");
	Movie zoo = new Movie("Zootopia", 2016, "A furry bunny cop proves to the world that appearances aren't everything.");
	Movie pinno = new Movie("Pinocchio", 1940, "A little wooden puppet comes to life and wonders what it would be like to be a real boy.");
	Movie poca = new Movie("Pocahontas", 1995, "An English soldier and the daughter of an Algonquin chief share a romance while trouble stirs between colonists and tribe.");

	movieList.add(aladdin);
	movieList.add(dalmations);
	movieList.add(moana);
	movieList.add(lion);
	movieList.add(mermaid);
	movieList.add(white);
	movieList.add(bambi);
	movieList.add(cindy);
	movieList.add(zoo);
	movieList.add(pinno);
	movieList.add(poca);
    }
    public static void printMovieList(){
	for(int i = 0; i <movieList.size(); i++){
	    System.out.print(movieList.get(i).title);
	    System.out.print( " " + "("  + movieList.get(i).yearReleased + ")");
	    System.out.println(", Rating: " +  movieList.get(i).avgRating);
	    System.out.println("       " + movieList.get(i).summary);
	    System.out.println("");
	}
    }
}