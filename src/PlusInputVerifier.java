/**
 * @author Drew Rife and Jordan Long
 *
 * Verifies an input was a plus sign
 */
public class PlusInputVerifier implements InputVerifier 
{
	/**
	 * checks that the input is a plus sign
	 * @return true if the input is a plus sign; false otherwise
	 */
	@Override
	public boolean meetsCriteria(char input) 
	{
		boolean isPlusSign = (input == '+');
		return isPlusSign;
	}

}
