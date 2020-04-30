package okr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in)
    );

    public static void main(String[] args) throws IOException {
        ex1();
        ex2();
    }

    public static void ex1() throws IOException {
        System.out.print("Задание 1\nВведите n = ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= n; i++) {
            String binaryStr = toBinaryString(i);
            if (isPalindrom(binaryStr)) {
                System.out.println("n = " + i + "\t|\tbinary = " + binaryStr);
            }
        }
    }

    public static void ex2() throws IOException {
        System.out.print("Задание 2\nВведите n = ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Введите массив a:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            a[i] = Integer.parseInt(reader.readLine());

            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Модуль наибольшего элемента последовательности = "
            + Math.abs(max));
    }

    public static String toBinaryString(int value) {
        String binaryStr = "";
        for (int i = 0; i < 32; i++) {
            binaryStr += (value & 0x80000000) == 0x80000000 ? "1" : "0";
            value <<= 1;
        }
        return binaryStr;
    }

    public static boolean isPalindrom(String binaryStr) {
        for (int i = 0, j = binaryStr.length() - 1; i < j; i++, j--) {
            if (binaryStr.charAt(i) != binaryStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}