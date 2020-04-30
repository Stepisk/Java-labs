package laba7;

/**
 * MobileConnection
 */
public class MobileConnection extends Telecommunications {

    private float generation, signal;
    private String operator;

    public MobileConnection() {
        this(0, 0, "None");
    }

    public MobileConnection(float generation, float signal, String operator) {
        super("MConnection");
        this.generation = generation;
        this.signal = signal;
        this.operator = operator;
    }

    public float getGeneration() {
        return generation;
    }

    public void setGeneration(float generation) {
        this.generation = generation;
    }

    public float getSignal() {
        return signal;
    }

    public void setSignal(float signal) {
        this.signal = signal;
    }

    public String getOperator() {
        return operator;
    }

    public void say() {
        System.out.println("Я Мобильная Связь!");
    }

    @Override
    public String toString() {
        return "type = " + type + " | generation = " + generation + "G | signal = " + signal + " | operator = " + operator;
    }
}