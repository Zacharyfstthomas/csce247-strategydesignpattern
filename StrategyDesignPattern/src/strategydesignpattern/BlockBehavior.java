package strategydesignpattern;

import java.util.Random;

/**
 * 
 * This is one of the defenceBehaviors that players can use on defense.
 *
 * @author zachary st.thomas
 *
 */

public class BlockBehavior implements DefenceBehavior {
	/**
	 * play returns a string detailing what the player did for their play.
	 * It uses Random to pick a number between 0 and 2, inclusive, randomly,
	 * and depending on which number is chosen, it will result in a different string being returned.
	 * A default is included to ensure that in the very unlikely event of none of the cases
	 * being satisfied, the method returns a String. 
	 * 
	 * 	 */
	
	public String play() {
		Random r = new Random();
		int choice = r.nextInt(3);
		switch(choice) {

		
		case 0 :
			return "blocks player from passing";
		case 1 :
			return "blocks player from shooting";
		case 2 :
			return "checks player with puck";
		default :
		return "blocks player from passing";	
			
		}

	}
	
	

}
