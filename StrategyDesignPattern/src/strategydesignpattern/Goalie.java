package strategydesignpattern;

/**
 * The goalie is one of the three children of the Player class, representing on of the 3 positions
 * in this hockey simulation. Uses the parent to obtain name, and to call setOffenceBehavior and setDefenceBehavior.
 * Additionally, contains a toString method to introduce the players at the beginning of the game.
 * @author zachary st.thomas
 *
 */
public class Goalie extends Player{
	
	/**
	 * 
	 * Constructor.
	 * Uses its parent class to process the single parameter.
	 * @param name: name given to the player.
	 * 
	 */
	public Goalie(String name) {
		
		super(name);
		
	}

	/**
	 * Unlike either the Defenceman or the Forward, the Goalie has the same, consistant
	 * behavior for both offense and defense. This behavior is BlockGoalBehavior,
	 * and so there is no randomness involved in assigning Goalie's offenceBehavior to 
	 * that behavior.
	 */
	
	public void setOffenceBehavior() {
		
		this.offenceBehavior = new BlockGoalBehavior();
		
	}
	
	public void setDefenceBehavior() {
		
		this.defenceBehavior = new BlockGoalBehavior();
		
	}
	
	/**
	 * This toString method returns the name of the Goalie, followed by a short 
	 * constant string to tell the user their position.
	 */
	public String toString() {
		return this.name + " plays the position: Goalie";
		
		
	}
	
}
