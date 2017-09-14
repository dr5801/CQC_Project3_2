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
	
	InputVerifier digitInputVerifier = (char c) ->  Character.isDigit(c);
	InputVerifier minusInputVerifier = (char c) -> c == '-';
	InputVerifier plusInputVerifier = (char c) -> c == '+';
	InputVerifier periodInputVerifier = (char c) -> c == '.';
	
	Action noAction = (InterimResult result, char input) -> result;
	Action valueIsDigitAction = (InterimResult result, char input) -> { 
		InterimResult interimResult = new InterimResult(result);
		interimResult.setV(Character.getNumericValue(input));
		return interimResult;
	};
	
	Action negateAction = (InterimResult result, char input) -> {
		InterimResult interimResult = new InterimResult(result);
		interimResult.setS(-1);
		return interimResult;
	};
	
	Action startFraction = (InterimResult result, char input) -> {
		InterimResult interimResult = new InterimResult(result);
		interimResult.setP(0.1);
		return interimResult;
	};
	 
	Action continuingIntegerAction = (InterimResult result, char input) -> {
		InterimResult interimResult = new InterimResult(result);
		interimResult.setV(10 * result.getV() + Character.getNumericValue(input));
		return interimResult;
	};
	
	Action continuinFractionAction = (InterimResult result, char input) -> {
		InterimResult interimResult = new InterimResult(result);
		double value = interimResult.getP() * Character.getNumericValue(input);
		interimResult.setV(interimResult.getV() + value);
		interimResult.setP(interimResult.getP() / 10);
		return interimResult;
	};
	
	private final Edge[] machine =
	{
			new Edge(State.START, digitInputVerifier, valueIsDigitAction, State.INTEGER),
			new Edge(State.START, minusInputVerifier, negateAction, State.INTEGER),
			new Edge(State.START, plusInputVerifier, noAction, State.INTEGER),
			new Edge(State.START, periodInputVerifier, startFraction, State.DECIMAL),
			new Edge(State.INTEGER, digitInputVerifier, continuingIntegerAction, State.INTEGER),
			new Edge(State.INTEGER, periodInputVerifier, startFraction, State.DECIMAL),
			new Edge(State.DECIMAL, digitInputVerifier, continuinFractionAction, State.DECIMAL)
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
