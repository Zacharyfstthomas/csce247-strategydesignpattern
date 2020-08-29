package strategydesignpattern;
import java.util.Random;

/**
 * The Defenceman is one of the three children of the Player class, representing on of the 3 positions
 * in this hockey simulation. Uses the parent to obtain name, and to call setOffenceBehavior and setDefenceBehavior.
 * Additionally, contains a toString method to introduce the players at the beginning of the game.
 * @author zachary st.thomas
 *
 */
public class Defenceman extends Player{
	private Random r = new Random();

	
	/**
	 * 
	 * Constructor.
	 * Uses its parent class to process the single parameter.
	 * @param name: name given to the player.
	 */ 
	public Defenceman(String name) {
		
		super(name);
		
	}
/**
 * 
 * setOffenceBehavior uses the imported Random class
 * to randomly select between setting the offenceBehavior to either
 * SlapShotBehavior or PassBehavior, with a 90% chance to select PassBehavior.
 * This is done by using Random to pick a number from 0 to 9, inclusive, randomly,
 * and only setting offenceBehavior to SlapShotBehavior if the picked number is 9,
 * otherwise setting offenceBehavior to PassBehavior.
 */
	public void setOffenceBehavior() {
		 Random r = new Random();
		int choice = r.nextInt(10);
		switch(choice){
			case 9:
				this.offenceBehavior = new SlapShotBehavior();
				break;
			default:
				this.offenceBehavior = new PassBehavior(); 
				break;
		}
				
	}
	
	/**
	 * setDefenceBehavior uses Random as well. 
	 * Unlike setOffenceBehavior, however, both options are equally likely to be picked.
	 * To simplify, a number between 0 and 1, inclusive is picked using Random, randomly,
	 * and if the number is 0, defenceBehavior is set to ChasePuckBehavior, otherwise 
	 * (the number is 1), defenceBehavior is set to BlockBehavior.
	 */
	
	public void setDefenceBehavior() {
		 Random r = new Random();
		int choice = r.nextInt(2);
		switch(choice){
			case 0:
				this.defenceBehavior = new ChasePuckBehavior();
				break;
			case 1:
				this.defenceBehavior = new BlockBehavior();
				break;
		}
	}
	
	/**
	 * This toString method returns the name of the Defenceman, followed by a short 
	 * constant string to tell the user their position.
	 */
	public String toString() {
		return this.name + " plays the position: Defenceman";
		
		
	}
	
	
	
	
}
