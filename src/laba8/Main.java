package laba8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import laba8.exercise1.Car;
import laba8.exercise2.PassengerTrain;
import laba8.exercise2.PassengerVagon;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        ex1();
        ex2();
    }

    public static void ex1() throws IOException {
        System.out.println("Задание 1");

        System.out.print("Введите модель автомобиля: ");
        String model = reader.readLine();
        System.out.print("Введите количество колёс у автомобиля: ");
        int countOfWheels = Integer.parseInt(reader.readLine());
        System.out.print("Введите ёмкость бака: ");
        double volumeOfTank = Double.parseDouble(reader.readLine());
        System.out.print("Введите расход на 100км: ");
        double fuelPer100km = Double.parseDouble(reader.readLine());
        Car car = new Car(model, countOfWheels, volumeOfTank, fuelPer100km);

        boolean active = true;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Проехать расстояние");
            System.out.println("2. Заправить автомобиль");
            System.out.println("3. Поменять колесо");
            System.out.println("0. Выйти из \"Задание 1\"");

            int choose = Integer.parseInt(reader.readLine());
            switch (choose) {
            case 1:
                System.out.print("Введите расстояние, которое нужно проехать: ");
                double distance = Double.parseDouble(reader.readLine());
                car.drive(distance);
                break;

            case 2:
                System.out.print("Введите сколько заправить: ");
                double fuel = Double.parseDouble(reader.readLine());
                car.refuel(fuel);
                break;

            case 3:
                System.out.print("Введите номер колеса, которое нужно заменить (отсчёт от левого переднего): ");
                int num = Integer.parseInt(reader.readLine());
                car.changeWheel(num);
                break;

            case 0:
                active = false;
            }
        } while (active);
    }

    public static void ex2() throws IOException {
        System.out.println("Задание 2");

        System.out.print("Введите количество вагонов: ");
        int numOfVagons = Integer.parseInt(reader.readLine());
        PassengerVagon[] vagons = new PassengerVagon[numOfVagons];

        for (int i = 0; i < numOfVagons; i++) {
            System.out.print("Количество багажа[" + (i + 1) + "]: ");
            int numOfBaggage = Integer.parseInt(reader.readLine());
            System.out.print("Количество пассажиров[" + (i + 1) + "]: ");
            int numOfPassengers = Integer.parseInt(reader.readLine());
            System.out.print("Комфортабельность[" + (i + 1) + "]: ");
            int comfort = Integer.parseInt(reader.readLine());
            PassengerVagon vagon = new PassengerVagon(numOfBaggage, numOfPassengers, comfort);
            vagons[i] = vagon;
        }

        PassengerTrain train = new PassengerTrain(vagons);
        
        train.sortForComfort();
        for (int i = 0; i < train.getNumOfVagons(); i++) {
            System.out.println("Вагон[" + (i + 1) + "] = " + train.getVagon(i).toString());
        }

        System.out.println("Введите диапазон пассажиров:");
        System.out.print("мин = ");
        int min = Integer.parseInt(reader.readLine());
        System.out.print("макс = ");
        int max = Integer.parseInt(reader.readLine());
        ArrayList<PassengerVagon> foundVagons = train.findVagonsWithPassenger(min, max);
        for (int i = 0; i < foundVagons.size(); i++) {
            System.out.println("Найденный вагон[" + (i + 1) + "] = " + foundVagons.get(i).toString());
        }
    }
}