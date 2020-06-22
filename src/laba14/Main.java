package laba14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import laba12.HillCipher;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, UnsignedException {
        System.out.print("Введите размерность ключа: ");

        int n = -1;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Вы должны были ввести число...");
        } finally {
            System.out.println("Размерность ключа = " + n);
        }

        if (n < 0) { throw new UnsignedException(); }

        System.out.print("Введите сообщение, которое нужно зашифровать (на английском): ");
        String msg = reader.readLine();
        System.out.print("Введите ключ (на английском): ");
        String key = reader.readLine();

        HillCipher cipher = new HillCipher(key, msg);
        String enc = cipher.encrypt();

        System.out.println("Зашифрованное сообщение: " + enc);
    }
}
