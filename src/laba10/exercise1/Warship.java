package laba10.exercise1;

import java.util.ArrayList;

public abstract class Warship implements ShipInterface {
    protected ArrayList<Ammunition> ammunitions;
    protected double fuel, volume;

    Warship(double fuel, double volume) {
        this.fuel = fuel;
        this.volume = volume;
        this.ammunitions = new ArrayList<Ammunition>();
    }

    @Override
    public void sail(double distance) {
        if (distance > fuel) {
            System.out.println("Вы проплыли " + fuel + " км\nНе хватило " + (distance - fuel) + " л");
            fuel = 0d;
            return;
        }
        fuel -= distance;
        System.out.println("Вы проплыли " + distance + " км");
    }

    public boolean addAmmunition(String type, int count) {
        boolean found = false;
        for (int i = 0; i < ammunitions.size(); i++) {
            if (ammunitions.get(i).type.equals(type)) {
                ammunitions.get(i).count += count;
                found = true;
            }
        }
        if (!found) {
            ammunitions.add(new Ammunition(type, count));
        }
        return true;
    }

    public boolean delAmmunition(String type, int count) {
        for (int i = 0; i < ammunitions.size(); i++) {
            if (ammunitions.get(i).type.equals(type)) {
                ammunitions.get(i).count = ammunitions.get(i).count >= count ? ammunitions.get(i).count - count : 0;
                return true;
            }
        }
        return false;
    }

    public Ammunition getAmmunition(int index) { return ammunitions.get(index); }
    public double getFuel() { return fuel; }
    public double getVolume() { return volume; }
}