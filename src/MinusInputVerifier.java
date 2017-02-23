/**
 * @author Drew Rife
 *
 * Verifies the input is a minus sign
 */
public class MinusInputVerifier implements InputVerifier 
{

	/**
	 * verifies the input (c) is a minus sign
	 * @return true if minus sign; false otherwise 
	 */
	@Override
	public boolean meetsCriteria(char input) 
	{
		boolean isMinus = (input == '-');
		return isMinus;
	}

}
