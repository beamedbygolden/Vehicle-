/* The Truck class should also have the ability to tow (tow(Vehicle other)) other
Vehicles but not other Trucks. When a vehicle gets towed it’s condition is set to 0.
Certain Vehicles which are towed, can have scrap value even if they’re totaled
(condition = 0)
- Helicopter is 30% of current value with a condition of 0
- Car is 10% of the condition 5 value minus $500 per thousand miles but the
value can no more than $2000 and no less than 0
*/
public class Truck extends Car{
	
	public Truck(String name, int condition, int miles) {
        super(name, condition, miles); 
    }
	
	 @Override
	    public double getValue() {
	        if (getCondition() == 0) {
	            // If the truck is damaged, use scrap value
	            return getScrapValue();
	        }
	        // 
	        double value = super.getValue() + 1000 * getCondition();
	        	if(getMiles() > 10000)
	        		for(int i = 10000; i <getMiles(); i += 10000)
	        		value = ((int)(getMiles())*.095);
	        return value;		
	    }
	
	public boolean isTowed() {
		if (isTowed()) {
			return true;
		}
		return false;
	}

	public void newCondition() {
		if (isTowed())
			condition = 0;
	}
}
