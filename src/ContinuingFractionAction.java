/**
 * @author Drew Rife
 * 
 * Continues decimal functionality when a digit is inputted into the decimal state again
 */
public class ContinuingFractionAction implements Action {

	/**
	 * executes an action when the input is a digit again in the decimal state
	 */
	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		InterimResult interimResult = new InterimResult(result);
		
		double value = interimResult.getP() * Character.getNumericValue(input);
		interimResult.setV(interimResult.getV() + value);
		interimResult.setP(interimResult.getP() / 10);
		
		return interimResult;
	}
}
