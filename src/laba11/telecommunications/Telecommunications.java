package laba11.telecommunications;

public abstract class Telecommunications {
    private String type;

    public Telecommunications() {
        this("Telecommunications");
    }

    protected Telecommunications(String type) {
        this.type = type;
    }

    public String getType() { return type; }
}