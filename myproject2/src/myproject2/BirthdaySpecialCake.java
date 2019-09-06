package myproject2;

public class BirthdaySpecialCake extends CakeStore {
	
	Cake createCake(String item) {
		if (item.equals("cheese")) {
    		return new BirthdaySpecialCheeseCake();
	} 
		else if (item.equals("fruits")) {
	    	return new BirthdaySpecialFruitCake();
	} 
		else if (item.equals("chocolate")) {
	    	return new BirthdaySpecialChocolateCake();
	} 
		else if (item.equals("velvet")) {
    		return new BirthdaySpecialVelvetCake();
	} 
		else return null;
		
	}

}