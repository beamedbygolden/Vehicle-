public class Highway extends Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c);
		System.out.println(((Truck)c).isTowed());
		System.out.println(activeCars);
		System.out.println();
	}

}
