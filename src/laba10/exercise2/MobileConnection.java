package laba10.exercise2;

/**
 * MobileConnection
 */
public class MobileConnection extends Telecommunications implements GenerationInterface {

    private double generation, signal, speed;
    private String operator;

    public MobileConnection() {
        this(0, 0, 0, "None");
    }

    public MobileConnection(double generation, double signal, double speed, String operator) {
        super("Mobile_Connection");
        this.generation = generation;
        this.signal = signal;
        this.speed = speed;
        this.operator = operator;
    }

    public double getGeneration() { return generation; }
    public double getSignal() { return signal; }
    public double getSpeed() { return speed; }
    public String getOperator() { return operator; }

    public void checkGeneration() { checkGeneration(generation); }
    public void checkGeneration(double generation) {
        if (generation < 4) {
            System.out.println("Рекомендуем вам приобрести сим-карту с поддержкой 4G");
        } else if (generation == 4) {
            System.out.println("Обновление сим-карты не требуется");
        } else if (generation > 4) {
            System.out.println("Ваша сим-карта поддерживает одну из новейших технологий связи");
        }
    }

    public void checkSpeed() { checkSpeed(speed); }
    public void checkSpeed(double speed) {
        if (speed < 1) {
            System.out.println("Скорость вашего соединения довольно низкая, рекомендуем вам сменить местоположение");
        } else if (speed < 5) {
            System.out.println("Скорость вашего соединения удовлетворительна, вы можете просматривать фильмы и играть в игры");
        } else if (speed >= 5) {
            System.out.println("Скорость вашего соединения довольно высокая, вы можете достаточно быстро скачивать файлы");
        }
    }

    public void changeOperator() { changeOperator("Default"); }
    public void changeOperator(String newOperator) {
        this.operator = newOperator;
        System.out.println("Оператор сменён на \"" + newOperator + "\"");
    }

    @Override
    public String toString() {
        return "type: " + this.getType() + " | generation: " + generation + "G | signal: " + signal + " | speed: " + speed + " | operator: " + operator;
    }
}