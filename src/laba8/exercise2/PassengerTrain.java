package laba8.exercise2;

import java.util.ArrayList;

public class PassengerTrain extends Train {

    private PassengerVagon[] vagons;
    
    public PassengerTrain(PassengerVagon[] vagons) {
        super("Passenger_Train", new Vagon[0]);
        this.vagons = vagons;
    }

    public void sortForComfort() {
        for (int i = 0; i < vagons.length; i++) {
            for (int j = i + 1; j < vagons.length; j++) {
                if (vagons[j].getComfort() > vagons[i].getComfort()) {
                    PassengerVagon temp = vagons[i];
                    vagons[i] = vagons[j];
                    vagons[j] = temp;
                }
            }
        }
        System.out.println("Пассажирские вагоны отсортированы по комфортабельности");
    }

    public ArrayList<PassengerVagon> findVagonsWithPassenger(int min, int max) {
        ArrayList<PassengerVagon> listOfVagons = new ArrayList<PassengerVagon>();
        for (PassengerVagon passengerVagon : vagons) {
            if (passengerVagon.numOfPassengers >= min && passengerVagon.numOfPassengers <= max) {
                listOfVagons.add(passengerVagon);
            }
        }
        return listOfVagons;
    }

    @Override
    public PassengerVagon getVagon(int num) {
        return vagons[num];
    }

    @Override
    public int getNumOfVagons() {
        return vagons.length;
    }
}