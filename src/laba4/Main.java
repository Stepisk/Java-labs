package laba4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ex1();
        ex2();
    }

    public static void ex1() throws IOException{
        System.out.print("Введите размерность массива:\nn = ");
        int n = Integer.parseInt(reader.readLine());

        int[] a = new int[n];
        int[] b = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(100);
            b[i] = rand.nextInt(100);
        }
        System.out.println("\nВывод массива:");
        showArray(a);
        showArray(b);

        int[] na = new int[n];
        int[] nb = new int[n];
        for (int i = 0; i < n; i++) {
            na[i] = a[i] + b[i];
            nb[i] = a[i] - b[i];
        }
        System.out.println("\nВывод нового массива:");
        showArray(na);
        showArray(nb);
    }

    public static void ex2() throws IOException {
        System.out.print("Введите размерность массива:\nm = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("n = ");
        int n = Integer.parseInt(reader.readLine());

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        System.out.println("\nВывод массива:");
        showArray(arr);

        for (int i = 0; i < m; i++) {
            int check = arr[i][0];
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != check) {
                    break;
                } else if (j == n - 1) {
                    setArrayRow(arr, i, 0);
                }
            }
        }

        System.out.println("\nВывод изменённого массива:");
        showArray(arr);
    }

    public static void setArrayRow(int[][] arr, int row, int value) {
        for (int i = 0; i < arr[row].length; i++) {
            arr[row][i] = value;
        }
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}