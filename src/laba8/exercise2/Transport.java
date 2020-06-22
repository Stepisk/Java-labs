package laba8.exercise2;

public abstract class Transport {
    private String type;

    public Transport() {
        this("Transport");
    }

    public Transport(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}