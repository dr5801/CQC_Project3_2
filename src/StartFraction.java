/**
 * @author Drew Rife and Joss Steward
 * 
 * sets the point to 0.1 for fractioning
 */
public class StartFraction implements Action {

	/**
	 * Executes an action when an input is '.'
	 * Sets the point to (0.1) since it's a fraction (/10)
	 */
	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		InterimResult interimResult = new InterimResult(result);
		interimResult.setP(0.1);
		return interimResult;
	}

}
