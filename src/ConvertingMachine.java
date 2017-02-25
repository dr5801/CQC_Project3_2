/**
 * A finite state machine that parses a string containing a real number. Will
 * throw NumberFormatExcaption if the string doesn't not contain a legal
 * representation of a real number. Note: we are not dealing with scientific
 * notation
 * 
 * @author Merlin
 *
 */
public class ConvertingMachine
{

	private final Edge[] machine =
	{
			new Edge(State.START, new DigitInputVerifier(),
					new ValueIsDigitAction(), State.INTEGER),
			new Edge(State.START, new MinusInputVerifier(), new NegateAction(),
					State.INTEGER),
			new Edge(State.START, new PlusInputVerifier(), new NoAction(),
					State.INTEGER),
			new Edge(State.START, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.INTEGER, new DigitInputVerifier(),
					new ContinuingIntegerAction(), State.INTEGER),
			new Edge(State.INTEGER, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.DECIMAL, new DigitInputVerifier(),
					new ContinuingFractionAction(), State.DECIMAL)

	};

	/**
	 * parses the string of text for the state machine 
	 * 
	 * @param text
	 * @return the final result
	 */
	public double parse(String text)
	{
		State currentState = State.START;
		InterimResult interimResult = new InterimResult(0,1,0);
		
		for(char character : text.toCharArray())
		{
			Edge nextEdge = searchForEdge(currentState, character);
			
			interimResult = nextEdge.action.execute(interimResult, character);
			
			if(nextEdge != null)
			{
				currentState = nextEdge.nextState;
			}
		}
		
		double finalResult = interimResult.getS() * interimResult.getV();
		
		return finalResult;
	}

	/**
	 * search for the next edge by the given paramters 
	 * 
	 * @param currentState - the current state of the system
	 * @param character - the character that is inputted
	 * @return the next state
	 */
	private Edge searchForEdge(State currentState, char character)
	{
		Edge nextEdge = null;
		
		for(Edge edge : machine)
		{
			if(edge.currentState == currentState && edge.inputVerifier.meetsCriteria(character))
			{
				nextEdge = edge;
			}
		}
		
		if(nextEdge == null)
		{
			throw new NumberFormatException();
		}
		
		return nextEdge;
	}

	/**
	 * An Edge that stores the currentState, inputVerifier, an action and the nextState
	 */
	private class Edge
	{
		State currentState;
		InputVerifier inputVerifier;
		Action action;
		State nextState;

		public Edge(State currentState, InputVerifier inputVerifier,
				Action action, State nextState)
		{
			this.currentState = currentState;
			this.inputVerifier = inputVerifier;
			this.action = action;
			this.nextState = nextState;
		}
	}

	private enum State
	{
		START, INTEGER, DECIMAL, END
	}
}
