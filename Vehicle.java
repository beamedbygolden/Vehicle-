public class Vehicle {
    private String name; 
    private int condition; 
    private int miles;

    protected static int activeCars = 0, totalCars = 0;
    protected static final int base = 20000;
    protected static final int conditionValue = 8000;

    // Default constructor
    public Vehicle() {
        this("Honda Accord", 5, 0);
    }

    // Full constructor
    public Vehicle(String name, int condition, int miles) {
        this.name = name; 
        this.condition = condition;
        this.miles = miles; 
        totalCars++;
        if (miles < 200 && condition > 0) activeCars++;
    }

    // Value calculation
    public int getValue() {
        if (condition == 0) return getScrapValue();
        return base + conditionValue * condition;
    }

    // Default scrap value
    public int getScrapValue() {
        return 0;
    }

    // toString
    public String toString() {
        return getClass().getSimpleName() + " Name: " + name +
               "\nCondition: " + condition +
               "\nMiles: " + miles + "K" +
               "\nValue: $" + getValue();
    }
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	
	
	
	
}
