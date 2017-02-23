/**
 * @author Drew Rife
 * 
 * PeriodInputVerifier verifies an input is a period
 */
public class PeriodInputVerifier implements InputVerifier 
{

	/**
	 * checks to see if the input is a period
	 * @return true if the input is a period; false otherwise
	 */
	@Override
	public boolean meetsCriteria(char input) 
	{
		boolean isPeriod = (input == '.');
		return isPeriod;
	}

}
