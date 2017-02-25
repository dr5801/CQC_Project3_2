import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Drew Rife and Jordan Long
 * Rusn all of the test
 */
@RunWith(Suite.class)
@Suite.SuiteClasses (	
		{
			InterimResultTest.class,
			ConvertingMachineTest.class,
			TestContinuingFractionAction.class,
			TestContinuingIntegerAction.class,
			TestDigitInputVerifier.class,
			TestMinusInputVerifier.class,
			TestNegateAction.class,
			TestNoAction.class,
			TestPeriodInputVerifier.class,
			TestPlusInputVerifier.class
		})
public class RunAllTests {}
