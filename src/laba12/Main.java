package laba12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        System.out.print("Введите сообщение, которое нужно зашифровать (на английском): ");
        String msg = reader.readLine();
        System.out.print("Введите ключ (на английском): ");
        String key = reader.readLine();

        HillCipher cipher = new HillCipher(key, msg);
        String enc = cipher.encrypt();

        System.out.println("Зашифрованное сообщение: " + enc);
    }
}
