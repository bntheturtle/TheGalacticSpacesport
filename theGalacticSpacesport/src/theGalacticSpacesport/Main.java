package theGalacticSpacesport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spaceship spaceship1 = new Spaceship("Gaia","Captain earth");
		Spaceship spaceship2 = new Spaceship("Pequena tierra", "billi bill");
		Spaceship spaceship3 = new Spaceship("Mercury", "CaptainGenius");
		
		
		Spaceship.displayTotalShips();
		
		Spaceship.maxCapacity();
	}
	
	

}
