/**
 * 
 */
package myGarage.users;

import myGarage.environment.Garage;
import myGarage.environment.Item;

/**
 * @author Mahmood Ahmed
 *
 */
public class Owner {
	private Garage garage;
	
	public Owner(Garage g) {
		setGarage(g);
	}
	
	public void setGarage(Garage g) {
		this.garage = g;
	}
	
	public Garage getGarage() {
		return garage;
	}
	
	public void post(Item i) {
		getGarage().getItems().add(i);
	}
}
