package myproject2;

public abstract class CakeStore {
	 
	abstract Cake createCake(String item);
 
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		
		System.out.println("--- Make a " + cake.getName() + " ---" + "\n");	
		cake.prepare();
		cake.bake();
		cake.shape();
		cake.box();
		return cake; 
	}
}


