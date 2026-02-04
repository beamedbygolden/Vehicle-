public class Helicopter extends Vehicle {
    protected int maxPassengerWeight; // in thousands

    public Helicopter(String name, int condition, int miles, int maxPassengerWeight) {
        super(name, condition, miles); 
        this.maxPassengerWeight = maxPassengerWeight;
    }


    public int  getMaxPassengerWeight() {
		 return maxPassengerWeight;
	}
     public void  setMaxPassengerWeight(int maxPassengerWeight) {
		 this.maxPassengerWeight = maxPassengerWeight;
	}

    @Override
    public int getValue() {
        if (getCondition() == 0) return getScrapValue();
        return super.getValue() + (maxPassengerWeight * 5000 / 1000);
    }

    @Override
    public int getScrapValue() {
        // Helicopter scrap = 30% of current value if condition is 0
        return (int)(getValue() * 0.3);
    }

    @Override
    public String toString() {
        return super.toString() + "Max Passenger Weight: " + maxPassengerWeight + "K\n";
    }

    // Convert a Vehicle into a Helicopter
    public static Helicopter rebuild(Vehicle v) {
        System.out.println(v.getName() + " is rebuilt into a Helicopter!");
        return new Helicopter(v.getName(), v.getCondition(), v.getMiles(), 100);
    }
}
