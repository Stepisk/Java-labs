package laba7;

/**
 * Telecommunications
 */
public abstract class Telecommunications {

    protected String type;

    public Telecommunications() {
        this("None");
    }

    public Telecommunications(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void say();
}