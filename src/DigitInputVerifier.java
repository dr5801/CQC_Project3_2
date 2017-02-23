/**
 * @author Drew Rife
 * 
 * Verifies the input
 */
public class DigitInputVerifier implements InputVerifier 
{

	/**
	 * checks to see if the character input (c) is a digit
	 * 
	 * @return true if digit; false otherwise
	 */
	@Override
	public boolean meetsCriteria(char c) 
	{
		return Character.isDigit(c);
	}

}
