package myproject2;

public class DependantCakeStore {
	
	public Cake createCake(String style, String type) {
		Cake cake = null;
		if (style.equals("Wedding")) {
			if (type.equals("Lucious")) {
				cake = new WeddingSpecialLuciousLemonCake();
			} 
			else if (type.equals("Almond")) {
				cake = new WeddingSpecialAlmondHazelnutCake();
			}
			else if (type.equals("Platinum")) {
				cake = new WeddingSpecialPlatinumCake();
			}
			else if (type.equals("Summer")) {
				cake = new WeddingSpecialSummerBerryCake();
			}
			
		} 
		else if (style.equals("Birthday")) {
			
			if (type.equals("Cheese")) {
				cake = new BirthdaySpecialCheeseCake();
			} 
			else if (type.equals("Chocolate")) {
				cake = new BirthdaySpecialChocolateCake();
			} 
			else if (type.equals("Fruit")) {
				cake = new BirthdaySpecialFruitCake();
			} 
			else if (type.equals("Velvet")) {
				cake = new BirthdaySpecialVelvetCake();
			}
		}else {
		   System.out.println("Error: invalid type of cake");
		   return null;
		}
		
		cake.prepare();
		cake.bake();
		cake.shape();
		cake.box();
		return cake;
	}

}
