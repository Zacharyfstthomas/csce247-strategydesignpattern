package strategydesignpattern;
import java.util.Random;

/**
 * 
 * This is one of the defenceBehaviors that players can use on defense.
 *
 * @author zachary st.thomas
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

	/**
	 * play uses Random to pick a number between 0 and 3, inclusive, randomly,
	 * and depending on which number is chosen, it will result in a different string being returned.
	 * A default is included to ensure that in the very unlikely event of none of the cases
	 * being satisfied, the method returns a String. 
	 * 
	 * 	 */
	
	
	public String play() {
		Random r = new Random();
		int choice = r.nextInt(4);
		switch(choice) {

		
		case 0 :
			return "hand blocks the puck";
		case 1 :
			return "catches the puck";
		case 2 :
			return "blocks puck with knee pads";
		case 3 :
			return "blocks puck with stick";
		default :
		return "hand blocks the puck";	
			
		}

	} 

}
