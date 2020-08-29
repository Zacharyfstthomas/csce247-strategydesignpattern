package strategydesignpattern;
/**
 * 
 * This is one of the defenceBehaviors that players can use on defense.
 *
 * @author zachary st.thomas
 *
 */
public class ChasePuckBehavior implements DefenceBehavior{

	/**
	 * Very simple method. 
	 * Just returns a single string to tell the user what the player did for that play.
	 * 
	 */
	
	
	public String play() {
		// TODO Auto-generated method stub
		return "Chases the puck";
	}

}
