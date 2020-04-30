package laba3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(final String[] args) throws IOException {
        ex1(); // if
        ex2(); // for
        ex3w(); // while
        ex3dw(); // do...while
    }

    public static void ex1() throws IOException {
        final double[] x = new double[3];
        final double[] y = new double[3];
        final double[] sides = new double[3];
        final double[] angles = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите координаты треугольника:\nx[" + i + "]: ");
            x[i] = Double.parseDouble(reader.readLine());
            System.out.print("y[" + i + "]: ");
            y[i] = Double.parseDouble(reader.readLine());
        }

        sides[0] = Math.sqrt((x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]));
        sides[1] = Math.sqrt((x[0] - x[2]) * (x[0] - x[2]) + (y[0] - y[2]) * (y[0] - y[2]));
        sides[2] = Math.sqrt((x[1] - x[2]) * (x[1] - x[2]) + (y[1] - y[2]) * (y[1] - y[2]));

        angles[0] = Math.acos((sides[0] * sides[0] + sides[1] * sides[1] - sides[2] * sides[2]) / (2 * sides[0] * sides[1]));
        angles[1] = Math.acos((sides[0] * sides[0] + sides[2] * sides[2] - sides[1] * sides[1]) / (2 * sides[0] * sides[2]));
        angles[2] = Math.acos((sides[1] * sides[1] + sides[2] * sides[2] - sides[0] * sides[0]) / (2 * sides[1] * sides[2]));

        double min = angles[0];
        if (angles[1] < min) {
            min = angles[1];
        } else if (angles[2] < min) {
            min = angles[2];
        }
        System.out.println("Наименьший угол треугольника = " + Math.toDegrees(min));
    }

    public static void ex2() throws IOException {
        System.out.print("Введите n: ");
        final int n = Integer.parseInt(reader.readLine());
        double sum = 0d;
        for (int i = 1; i <= n; i++) {
            sum += 1d / ((i * 2 - 1) * (i * 2 + 1) * (i * 2 + 3));
        }
        System.out.println("sum = " + sum);
    }

    public static void ex3w() throws IOException {
        double sum = 0d;
        int n = 0;
        boolean flag = true;

        while (flag) {
            n++;
            final double temp = sum;
            sum += Math.pow(-1, n + 1) * 1d / n;

            if (Math.abs(sum - temp) < 0.0001) {
                flag = false;
            }
        }
		
        System.out.println("Counter = " + n + "\nSum = " + sum);
    }

    public static void ex3dw() throws IOException {
        double temp, sum = 0d;
        int n = 0;
		
		do {
			n++;
			temp = sum;
			sum += Math.pow(-1, n + 1) * 1d / n;
		} while (Math.abs(sum - temp) >= 0.0001);
		
        System.out.println("Counter = " + n + "\nSum = " + sum);
    }
}
