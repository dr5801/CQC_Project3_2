/**
 * @author Drew Rife
 * 
 * An action for when an input is a digit 
 */
public class ValueIsDigitAction implements Action 
{

	/**
	 * execute an action when a digit is verified 
	 */
	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		InterimResult interimResult = new InterimResult(result);
		interimResult.setV(Character.getNumericValue(input));
		return interimResult;
	}

}
