package laba5;

import static app.App.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            clearConsole();
            System.out.print("Введите данные для создания треугольника\nДлина стороны = ");
            double side1 = Double.parseDouble(reader.readLine());
            System.out.print("Угол 1 = ");
            double angle1 = Double.parseDouble(reader.readLine());
            System.out.print("Угол 2 = ");
            double angle2 = Double.parseDouble(reader.readLine());

            if (side1 <= 0 || angle1 <= 0 || angle2 <= 0 || (180 - angle1 - angle2) <= 0) {
                clearConsole();
                System.out.println("Вы ввели недопустимые данные для создания треугольника!");
                pauseConsole();
            } else {
                flag = false;

                Triangle tr = new Triangle(side1, angle1, angle2);
                System.out.println("Стороны = " + Arrays.toString(tr.getSides()));
                System.out.println("Высоты = " + Arrays.toString(tr.getHighs()));
            }
        }
    }
}
