/**
 * 
 */
package myGarage.environment;

/**
 * @author Mahmood Ahmed
 *
 */
public class Item {
	public static final String[] conditions = {"New","Like New","Good","Acceptable","Damaged"};
	private String title;
	private String condition;
	private double price;
	
	public Item(String t, String c, double p){
		setTitle(t);
		setCondition(c);
		setPrice(p);
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setCondition(String c) {
		if(isValidCondition(c)){
			this.condition = c;
		}
		else {
			throw new IllegalArgumentException("Please include a valid condition.");
		}
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getCondition() {
		return condition;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isValidCondition(String c) {
		for(int i = 0; i < conditions.length; i++) {
			if(c.equalsIgnoreCase(conditions[i])) {
				return true;
			}
		}
		return false;
	}
}
