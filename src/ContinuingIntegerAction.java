/**
 * 
 * @author Drew Rife and Jordan Long
 * 
 * For when the Integer State gets a digit after it's already been in the Integer State
 *
 */
public class ContinuingIntegerAction implements Action 
{

	/**
	 * when the input is again, a digit, set value
	 */
	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		InterimResult interimResult = new InterimResult(result);
		result.setV(10 * result.getV() + Character.getNumericValue(input));
		return interimResult;
	}

}
