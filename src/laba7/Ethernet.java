package laba7;

/**
 * Ethernet
 */
public class Ethernet extends Telecommunications {

    private float generation, speed;
    private int ping;

    public Ethernet() {
        this(0, 0, 0);
    }

    public Ethernet(float generation, float speed, int ping) {
        super("Ethernet");
        this.generation = generation;
        this.speed = speed;
        this.ping = ping;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getPing() {
        return ping;
    }

    public void setPing(int ping) {
        this.ping = ping;
    }

    public float getGeneration() {
        return generation;
    }

    public void setGeneration(float generation) {
        this.generation = generation;
    }

    public void say() {
        System.out.println("Я Интернет!");
    }

    @Override
    public String toString() {
        return "type = " + type + " | generation = " + generation + "G | speed = " + speed + " Мб/с | ping = " + ping + " мс";
    }
}