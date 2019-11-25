/**
 * Implements State
 * In Transit State occurs when a Package is sent out for delivery
 * called by package.mail();
 * @author Luis
 *
 */
public class InTransitState implements State{
private Package pkg;

	/**
 	* instantiates the package in InTransitState
 	* @param pkg
 	*/
	public InTransitState(Package pkg)
	{
		this.pkg = pkg;
	}
	
	/**
	 * Displays that the package is out for delivery
	 * Package was ordered
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" is out for delivery");
	}
	
	/**
	 * Displays the amount of time for the package to arrive
	 * package should arrive within 5 days
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive within 5 days");
	}
}
