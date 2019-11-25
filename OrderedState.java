/**
 * Implements State
 * Ordered State occurs when a Package is ordered
 * called by package.order();
 * @author Luis
 *
 */
public class OrderedState implements State{
	private Package pkg;
	
	/**
	 * instantiates the package in ordered state
	 * @param pkg
	 */
	public OrderedState(Package pkg)
	{
		this.pkg = pkg;
	}
	
	/**
	 * Displays that the package was ordered
	 * Package was ordered
	 */
	public void displayStatus()
	{
		System.out.println(pkg.getName()+" was ordered");
	}
	
	/**
	 * Displays the amount of time for the package to arrive
	 * package should arrive in 5 to 7 business days
	 */
	public void displayETA()
	{
		System.out.println(pkg.getName()+" should arrive in 5 to 7 business days");
	}
}
