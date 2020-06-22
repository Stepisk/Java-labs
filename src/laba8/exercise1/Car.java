package laba8.exercise1;

public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private double fuel, volumeOfTank;
    private String model;

    public Car(String model, int countOfWheel, double volumeOfTank, double fuelPer100km) {
        this.fuel = 0;
        this.model = model;
        wheels = new Wheel[countOfWheel];
        engine = new Engine(fuelPer100km);
        this.volumeOfTank = volumeOfTank;
    }

    public void drive(double distance) {
        double consumption = distance / 100 * engine.getFuelPer100km();
        if (consumption > fuel) {
            System.out.println("У вас недостаточно топлива, чтобы проехать это расстояние");
            return;
        }
        System.out.println("Вы проехали " + distance + " километров. Расход состовляет " + consumption + " литров.");
        fuel -= consumption;
    }

    public void refuel(double liters) {
        if (fuel + liters > volumeOfTank) {
            System.out.println("У вас переполнен бак. Не поместилось " + (fuel + liters - volumeOfTank) + " литров");
            fuel = volumeOfTank;
            return;
        }
        fuel += liters;
        System.out.println("Вы заправили " + liters + " литров. Текущая ёмкость " + fuel + "/" + volumeOfTank);
    }

    public void changeWheel(int num) {
        if (num <= 0 || num > wheels.length) {
            System.out.println("Такого колеса в машине нет!");
            return;
        }
        System.out.println("Заменено " + num + "-е колесо");
    }

    public double getFuel() { return fuel; }
    public double getVolumeOfTank() { return volumeOfTank; }
    public String getModel() { return model; }
}