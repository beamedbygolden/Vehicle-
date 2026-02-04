public class Car extends Vehicle {

    // Constructors
    public Car() {
        super(); // calls Vehicle default constructor
    }

    public Car(String name, int condition, int miles) {
        super(name, condition, miles); // calls Vehicle full constructor
    }

    // Calculate current value
    @Override
    public int getValue() {
        if (getCondition() == 0) {
            // If the car is damaged/towed, use scrap value
            return getScrapValue();
        }
        // Base vehicle value + extra $1000 per condition level
        return super.getValue() + 1000 * getCondition();
    }

    // Calculate scrap value when the car is totaled
    @Override
    public int getScrapValue() {
        // Start with max value for condition 5, subtract $500 per 1K miles
        int value = base + conditionValue * 5 - 500 * getMiles();

        // Limit value between 0 and 2000
        if (value > 2000) value = 2000;
        if (value < 0) value = 0;

        return value;
    }

    //converting a car into a golf cart
    public static Car salvage(Car c) {
        System.out.println(c.getName() + " is salvaged into a Golf Cart!");
        return new Car("Golf Cart", 5, 0); // new golf cart with default good condition
    }
}


