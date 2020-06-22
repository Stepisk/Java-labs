package laba8.exercise2;

public class Vagon {
    protected int numOfBaggage;

    Vagon(int numOfBaggage) {
        this.numOfBaggage = numOfBaggage;
    }

    public int getNumOfBaggage() {
        return numOfBaggage;
    }

    @Override
    public String toString() {
        return "numOfBaggage = " + numOfBaggage;
    }
}