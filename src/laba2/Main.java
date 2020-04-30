package laba2;

import static java.lang.Math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(final String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x, y, z;

        System.out.print("Введите x, y, z\nx = ");
        x = Double.parseDouble(reader.readLine());

        System.out.print("y = ");
        y = Double.parseDouble(reader.readLine());

        System.out.print("z = ");
        z = Double.parseDouble(reader.readLine());

        final double result = pow(E, abs(x - y)) * pow(abs(x - y), x + y) / (atan(x) - atan(z))
                + pow(pow(x, 6) + pow(log(y), 2), 1d / 3d);
        System.out.println("result = " + result);
    }
}
