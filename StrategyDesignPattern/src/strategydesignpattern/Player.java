package strategydesignpattern;
import java.util.Random;

/**
 *
 * The Player class acts to give each player attributes,
 * such as names and behaviors, to every hockey player in the program.
 * The Player class also contains methods to determine whether to use offence vs defence behaviors,
 * as well as switch the offence variable.
 * @author zachary st.thomas
 *
 */
public abstract class Player {


	protected String name;  
	private boolean offence = true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;

	/**
	 * 
	 * Constructor.
	 * Calls setDefenceBeavior and setOffenceBehavior.
	 * This proves crucial for the children of this class,
	 * as they use those methods to set their behaviors for a certain play.
	 * @param name: entered in the driver class, represents the name of the player.
	 *
	 */
	
	
	public Player(String name) {
		
		this.name = name;
		setDefenceBehavior();
		setOffenceBehavior();
		
	}
	/**
	 * Although both setDefenceBehavior and setOffenceBehavior are empty in this class,
	 * the children of this class inherit these methods and use them to set their offensive
	 * and defensive behaviors.
	 */
	public void setDefenceBehavior() {
	
		
	}

	public void setOffenceBehavior() {
		
		
	}
	
		/**
		 * Returns what a player did during a certain play, or their behavior for that play
		 * 
		 * @return
		 *  Whether it calls the offenceBehavior of that Player's play method
		 *  or the defenceBehavior of that Player's play method depends on whether or not the offence
		 *  variable is true.
		 */
	
	public String play() {
		if(offence) {
			
			return offenceBehavior.play();
		}
		else {
			return defenceBehavior.play();
			
		}
		
		
	}
	
	/**
	 * Converts offence to the opposite of what it was.
	 */
	
	public void turnover() {
		
		this.offence = !(this.offence);
		
	}
	
	
	
}
