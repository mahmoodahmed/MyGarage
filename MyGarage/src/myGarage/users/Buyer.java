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
public class Buyer {
	private Garage garage;
	
	public Buyer() {
		
	}
	
	public Item search(String s) {
		for(int i = 0; i < garage.getItems().size(); i++) {
			if(s.equalsIgnoreCase(garage.getItems().get(i).getTitle())) {
				return garage.getItems().get(i);
			}
		}
		System.out.println("Unfortunately, we could not find any items with your search criteria.");
		return null;
	}
}
