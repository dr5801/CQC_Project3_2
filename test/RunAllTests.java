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
			ConvertingMachineTest.class
		})
public class RunAllTests {}
