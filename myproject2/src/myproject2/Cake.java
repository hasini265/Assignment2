package myproject2;

import java.util.ArrayList;

public abstract class Cake {
	
	String name;
	String batter;
	ArrayList<String> frosting = new ArrayList<String>();
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		
		System.out.println("Prepare batter for " + name); 
	}
		
	
	void bake() {
		System.out.println("Preheat the oven to 325 degrees & Bake for an hour");	
	}
	
	void shape() {
		System.out.println("Shape the Cake into round one");
		System.out.println("Add frosting...");
		for (String frostings : frosting) {
			System.out.println("   " + frostings);
		}
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}		
		
	}
	
	void box() {
		System.out.println("Pack the cake in a special cake box");
		
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append(" ---- " + name + " ----\n " );
		display.append(batter + "\n" );
		for (String frostings : frosting) {
			display.append(frostings + "\n" );
		}
		for (String topping : toppings) {
			display.append(topping + "\n" );
		}	
		return display.toString(); 
	}
	
}
