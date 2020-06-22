package laba10.exercise1;

public class AeroCarrier extends Warship {
    public AeroCarrier(double fuel, double volume) {
        super(fuel, volume);
    }

    @Override
    public String toString() {
        String result = "Авианосец | fuel " + fuel + " | volume = " + volume + "\nАммуниция:\n";
        for (Ammunition ammunition : ammunitions) {
            result += "type = " + ammunition.type + " | count = " + ammunition.count + "\n";
        }
        return result;
    }
}