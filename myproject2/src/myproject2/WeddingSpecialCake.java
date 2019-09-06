package myproject2;

public class WeddingSpecialCake extends CakeStore { 
	
	Cake createCake(String item) {
		if (item.equals("lucious")) { 
			return new WeddingSpecialLuciousLemonCake();
		} else if (item.equals("almond")) {
			return new WeddingSpecialAlmondHazelnutCake();
		}else if (item.equals("platinum")) {
			return new WeddingSpecialPlatinumCake();
		}else if (item.equals("summer")) {
			return new WeddingSpecialSummerBerryCake();
		}else return null;
		
	}

}
