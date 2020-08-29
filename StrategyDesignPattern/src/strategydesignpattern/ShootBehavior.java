package strategydesignpattern;

/**
 * 
 * This is one of the offenceBehaviors that players can use on offense.
 *
 * @author zachary st.thomas
 *
 */
public class ShootBehavior implements OffenceBehavior{

	/**
	 * Very simple method. 
	 * Just returns a single string to tell the user what the player did for that play.
	 * 
	 */
	
	public String play() {
		
		return "shoots at the goal";
	}

}
