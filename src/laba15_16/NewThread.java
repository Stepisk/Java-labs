package laba15_16;

import laba12.HillCipher;

public class NewThread extends Thread {
    private HillCipher cipher;
    private static int counter = 0;


    NewThread(String key, String msg) {
        super("newThread");
        cipher = new HillCipher(key, msg);
    }

    @Override
    public void run() {
        System.out.println("Поток №" + counter++);
        System.out.println("Сообщение: " + cipher.getMessage());
        System.out.println("Ключ: " + cipher.getKey());
        System.out.println("Зашифрованное сообщение: " + cipher.encrypt());
        System.out.println();
    }
}
