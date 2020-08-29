package strategydesignpattern;
/**
 * This interface is used to both act as a template for
 * offensive behaviors a player may do, and to refer to a offensive behavior even
 * when one may not have been assigned yet. Very helpful
 * considering the defenceBehavior is randomly chosen, and categorizing each behavior
 * like this is very useful for programming.
 * @author zachary st.thomas
 *
 */
public interface OffenceBehavior {
	public String play();
}
