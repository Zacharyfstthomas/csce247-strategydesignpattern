package strategydesignpattern;

import java.util.Random;

/**
 * The Forward is one of the three children of the Player class, representing on of the 3 positions
 * in this hockey simulation. Uses the parent to obtain name, and to call setOffenceBehavior and setDefenceBehavior.
 * Additionally, contains a toString method to introduce the players at the beginning of the game.
 * @author zachary st.thomas
 *
 */

public class Forward extends Player{
	

	/**
	 * 
	 * Constructor.
	 * Uses its parent class to process the single parameter.
	 * @param name: name given to the player.
	 */ 
	public Forward(String name) {
		
		super(name);
		
	}
	
	/**
	 * setOffenceBehavior uses Random to pick a number between 0 and 1, inclusive, randomly,
	 * and if the number is 0, offenceBehavior is set to PassBehavior, otherwise 
	 * (the number is 1), offenceBehavior is set to ShootBehavior.
	 */
	

	public void setOffenceBehavior() {
		 Random r = new Random();
		int choice = r.nextInt(2);
		switch(choice){
			case 0:
				this.offenceBehavior = new PassBehavior();
				break;
			case 1:
				this.offenceBehavior = new ShootBehavior();
				break;
		
		}
		
	}
	
	/**
	 * setDefenceBehavior uses Random to pick a number between 0 and 1, inclusive, randomly,
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
	 * This toString method returns the name of the Forward, followed by a short 
	 * constant string to tell the user their position.
	 */
	public String toString() {
		return this.name + " plays the position: Forward";
		
		
	}
	
	
	
	
}
