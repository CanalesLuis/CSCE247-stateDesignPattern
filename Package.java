/**
 * Package class is used to instantiate a package object
 * and print and set the state of the package.
 * Status Desing Pattern
 * @author Luis
 *
 */
public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	
	private String name;
	private State state;
	
	/**
	 * Default constructor
	 * sets the name to user input contents
	 * instantiates all states to their state classes
	 * @param contents
	 */
	public Package(String contents)
	{
		this.name = contents;
		
		this.orderedState = new OrderedState(this);
		this.inTransitState = new InTransitState(this);
		this.deliveredState = new DeliveredState(this);
	}
	
	/**
	 * sets the state to orderedState
	 * and prints the status and time to delivery
	 */
	public void order()
	{
		state = orderedState;
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * sets the state to inTransitState
	 * and prints the status and time to delivery
	 */
	public void mail()
	{
		state = inTransitState;
		state.displayStatus();
		state.displayETA();
	}
	
	/**
	 * sets the state to deliveredState
	 * and prints only the status
	 */
	public void received()
	{
		state = deliveredState;
		state.displayStatus();
	}
	
	/**
	 * Sets the states to the state input
	 * @param state
	 */
	public void setState(State state)
	{
		this.deliveredState = state;
	}
	
	/**
	 * getter to return the name/contents of package
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}
}
