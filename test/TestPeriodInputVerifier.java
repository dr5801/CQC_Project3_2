import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Drew Rife and Jordan Long
 *
 * Tests the functionality fo the PeriodInputVerifier
 */
public class TestPeriodInputVerifier 
{

	/**
	 * Tests valid input by inputting a period
	 */
	@Test
	public void testValidInputAsPeriod()
	{
		PeriodInputVerifier periodVerifier = new PeriodInputVerifier();
		assertTrue(periodVerifier.meetsCriteria('.'));
	}
	
	/**
	 * Tests invalid input as minus sign
	 */
	@Test
	public void testInvalidInputAsMinusSign()
	{
		PeriodInputVerifier periodVerifier = new PeriodInputVerifier();
		assertFalse(periodVerifier.meetsCriteria('-'));
	}
	
	/**
	 * tests invalid input as plus sign
	 */
	@Test
	public void testValidInputAsPlusSign()
	{
		PeriodInputVerifier periodVerifier = new PeriodInputVerifier();
		assertFalse(periodVerifier.meetsCriteria('+'));
	}
	
	/**
	 * tests invalid input as digit
	 */
	@Test
	public void testInvalidInputAsDigit()
	{
		PeriodInputVerifier periodVerifier = new PeriodInputVerifier();
		assertFalse(periodVerifier.meetsCriteria('1'));
	}
	
	/**
	 * tests invalid input as letter
	 */
	@Test
	public void testInvalidInputAsLetter()
	{
		PeriodInputVerifier periodVerifier = new PeriodInputVerifier();
		assertFalse(periodVerifier.meetsCriteria('a'));
	}
}
