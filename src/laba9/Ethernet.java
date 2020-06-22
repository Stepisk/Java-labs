package laba9;

/**
 * Ethernet
 */
public class Ethernet extends Telecommunications {

    private double generation, speed;
    private int ping;
    private String tariff;

    public Ethernet() {
        this(0, 0, 0, "None");
    }

    public Ethernet(double generation, double speed, int ping, String tariff) {
        super("Ethernet");
        this.generation = generation;
        this.speed = speed;
        this.ping = ping;
        this.tariff = tariff;
    }

    public double getSpeed() { return speed; }
    public int getPing() { return ping; }
    public double getGeneration() { return generation; }
    public String getTariff() { return tariff; }

    public void checkGeneration() { checkGeneration(generation); }
    public void checkGeneration(double generation) {
        if (generation < 4) {
            System.out.println("Рекомендуем вам обновить ваше оборудование для обеспечение более скоростного доступа к Интернету");
        } else if (generation == 4) {
            System.out.println("Ваше оборудование находится в оптимальном состоянии, ничего обновлять не нужно");
        } else if (generation > 4) {
            System.out.println("Ваше оборудование одно из лучших на данный момент");
        }
    }

    public void checkSpeed() { checkSpeed(speed); }
    public void checkSpeed(double speed) {
        if (speed < 1) {
            System.out.println("Скорость вашего соединения довольно низкая, рекомендуем вам сменить тариф на более скоростной");
        } else if (speed < 5) {
            System.out.println("Скорость вашего соединения удовлетворительна, вы можете просматривать фильмы и играть в игры");
        } else if (speed >= 5) {
            System.out.println("Скорость вашего соединения довольно высокая, вы можете достаточно быстро скачивать файлы");
        }
    }

    public void changeTariff() { changeTariff("Default"); }
    public void changeTariff(String newTariff) {
        this.tariff = newTariff;
        System.out.println("Тариф сменён на \"" + newTariff + "\"");
    }

    @Override
    public String toString() {
        return "type: " + this.getType() + " | generation: " + generation + "G | speed: " + speed + " Мб/с | ping: " + ping + " мс | tariff: " + tariff;
    }
}