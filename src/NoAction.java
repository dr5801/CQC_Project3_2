/**
 * @author Drew Rife and Jordan Long
 *
 * NoAction does nothing because a plus sign was inputted
 */
public class NoAction implements Action 
{
	/**
	 * @return the InterimResult back
	 */
	@Override
	public InterimResult execute(InterimResult result, char input) 
	{
		return result;
	}

}
