/**
 * @author Drew Rife and Jordan Long
 * 
 * NegateAction for a minus sign as an input
 */
public class NegateAction implements Action {

	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		InterimResult interimResult = new InterimResult(result);
		interimResult.setS(-1);
		return interimResult;
	}

}
