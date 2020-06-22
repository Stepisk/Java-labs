package laba13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.print("Введите количество сторон многоугольника: ");
        int n = Integer.parseInt(reader.readLine());
        Coord[] coords = new Coord[n];

        System.out.println("Введите координаты многоугольника");
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            double x = Double.parseDouble(reader.readLine());
            System.out.print("y[" + i + "] = ");
            double y = Double.parseDouble(reader.readLine());
            coords[i] = new Coord(x, y);
        }

        Polygon polygon = new Polygon(coords);
        System.out.println("Площадь равна: " + polygon.getS());
    }
}
