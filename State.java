/**
 * Interface that all states must implement
 * display Status- displays where the object is
 * ordered, delivered, here
 * display ETA - displays how long until object will arrive
 * 5-7 business days, less than 5 days, here
 * @author Luis
 *
 */
public interface State {
	public void displayStatus();
	public void displayETA();
}
