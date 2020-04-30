package horse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horse {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int x, y, hX, hY;
        System.out.print("Введите координаты шахматной фигуры:\nx = ");
        x = Integer.parseInt(reader.readLine());
        System.out.print("y = ");
        y = Integer.parseInt(reader.readLine());

        System.out.print("Введите координаты коня:\nx = ");
        hX = Integer.parseInt(reader.readLine());
        System.out.print("y = ");
        hY = Integer.parseInt(reader.readLine());

        //Умное условие
        if (Math.abs(hX - x) * Math.abs(hY - y) == 2) {
            System.out.println("Конь бьёт шахматную фигуру");
        } else {
            System.out.println("Конь не может побить шахматную фигуру из текущего положения");
        }
    }
}