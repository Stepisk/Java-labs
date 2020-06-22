package laba15_16;

public class Main {
    public static void main(String[] args) throws Exception {
        String key = "GYBNQKURP";
        String msg = "ACT";
        NewThread[] threads = new NewThread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new NewThread(key, msg);
            threads[i].start();
        }
    }
}