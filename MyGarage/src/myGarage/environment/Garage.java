/**
 * 
 */
package myGarage.environment;

import java.util.ArrayList;

/**
 * @author Mahmood Ahmed
 *
 */
public class Garage {
	private ArrayList<Item> items;
	private String date;
	private String location;
	private String title;
	
	public Garage(String t, String loc, String d, ArrayList<Item> i) {
		setTitle(t);
		setLocation(loc);
		setDate(d);
		setItems(i);
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setLocation(String loc) {
		this.location = loc;
	}
	
	public void setDate(String d) {
		this.date = d;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public String getDate() {
		return date;
	}

	public String getLocation() {
		return location;
	}

	public String getTitle() {
		return title;
	}
}
