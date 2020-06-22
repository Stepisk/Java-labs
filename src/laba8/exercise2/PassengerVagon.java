package laba8.exercise2;

public class PassengerVagon extends Vagon {

    protected int numOfPassengers;
    protected int comfort;
    
    public PassengerVagon(int numOfBaggage, int numOfPassengers, int comfort) {
        super(numOfBaggage);
        this.numOfPassengers = numOfPassengers;
        this.comfort = comfort;
    }

    public int getNumOfPassgengers() {
        return numOfPassengers;
    }

    public int getComfort() {
        return comfort;
    }

    @Override
    public String toString() {
        return "numOfBaggage = " + numOfBaggage + " | numOfPassengers = " + numOfPassengers + " | comfort = " + comfort;
    }
}