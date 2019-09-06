package myproject2;

public class CakeTestDrive {
	
	public static void main(String[] args) {
		
		CakeStore birthday = new BirthdaySpecialCake();
		CakeStore wedding = new WeddingSpecialCake();
 
		Cake cake = birthday.orderCake("cheese");	
		System.out.println("("+"Hasi ordered a " + cake.getName() +")"+ "\n");
		cake = wedding.orderCake("lucious");
		System.out.println("("+"Sam ordered a " + cake.getName() +")"+ "\n");
		cake = birthday.orderCake("chocolate");
		System.out.println("("+"Hasi ordered a " + cake.getName() +")"+ "\n");
		cake = birthday.orderCake("fruits");
		System.out.println("("+"Hasi ordered a " + cake.getName() +")"+ "\n");
		cake = wedding.orderCake("platinum");
		System.out.println("("+"Sam ordered a " + cake.getName() +")"+ "\n");
		cake = wedding.orderCake("summer");
		System.out.println("("+"Sam ordered a " + cake.getName() +")"+ "\n");
		cake = birthday.orderCake("velvet");
		System.out.println("("+"Hasi ordered a " + cake.getName() +")"+ "\n");
		cake = wedding.orderCake("almond");
		System.out.println("("+"Sam ordered a " + cake.getName() +")"+ "\n");
 
	}

}
