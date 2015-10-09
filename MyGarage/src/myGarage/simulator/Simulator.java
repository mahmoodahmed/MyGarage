/**
 * 
 */
package myGarage.simulator;

import java.util.Scanner;

/**
 * @author Mahmood Ahmed
 *
 */
public class Simulator {
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to the MyGarage App!");
		System.out.println();
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("(B)uy");
			System.out.println("(S)ell");
			System.out.println();
			String choice = s.next();
			
			if(choice.equalsIgnoreCase("s")) {
				
			}
			else if(choice.equalsIgnoreCase("b")) {
				
			}
			else {
				System.out.println("That is an invalid option.");
			}
		}
	}
}
