/**
 * Implements State
 * Delivered State occurs when a Package has arrived at
 * its destination
 * called by package.recieved();
 * @author Luis
 *
 */
public class DeliveredState implements State{
	private Package pkg;
	
	/**
 	* instantiates the package to deliveredState
 	* @param pkg
 	*/
	public DeliveredState(Package pkg)
	{
		this.pkg = pkg;
	}
	
	/**
	 * Displays that the package has arrived
	 * Package is here for you
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is here for you");
	}
	
	/**
	 * Displays the amount of time for the package to arrive
	 * package is here
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" is here");
	}
}
