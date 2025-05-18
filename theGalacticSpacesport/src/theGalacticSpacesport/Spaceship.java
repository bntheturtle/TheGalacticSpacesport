package theGalacticSpacesport;

public class Spaceship {

	
	String name; 
	String captain; 
	static int totalships = 0 ;
	static int MAX_CAPACITY = 5;
	
	 Spaceship(String name, String captain ){
		
		 if(totalships >= MAX_CAPACITY) {
			System.out.println(" Spaceport full ! Can not add any spaceships anymore :/ ");
		} else {
			
		this.name = name; 
		this.captain = captain;
		 totalships++;
		 System.out.println(" New spaceship arrived \nName : " + name + " \nCpatain  is the " + captain + " of the spacship " + "\n" );
		 }
	 }
	 
	 String inTheSpacePort = "those are some fiery spaceships piou piou " ;
	 
	 @Override
	public String toString() {
		 return "The spaceship that you are looking for is " + name + " He is piloted by " + captain ;
	 }
	 
	 
	 public static void displayTotalShips () {
		System.out.println("there is now : " + totalships +  " spaceships who are actually present in the spaceport" );
		 
	 }
	 
	 public static void maxCapacity() {
		 if (totalships > 5) {
			 System.out.println("the maximum number of spaceships presents have been attained");
			 }
			 else {
				 System.out.println(" you can still add new spaceships to the spaceport ! ");
			 }
		 }
	 }

