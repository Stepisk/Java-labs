package laba14;

public class UnsignedException extends Exception {
    private static final long serialVersionUID = 9044938880057848821L;

    public UnsignedException() {
        super("Данное число может быть лишь положительным!");
    }
}
