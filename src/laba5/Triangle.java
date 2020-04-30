package laba5;

/**
 * Triangle
 */
public class Triangle {

    private double[] sides, angles, highs;

    public Triangle(double side1, double angle1, double angle2) {
        this.sides = new double[3];
        this.angles = new double[3];
        this.highs = new double[3];

        this.sides[0] = side1;
        this.angles[0] = Math.toRadians(angle1);
        this.angles[1] = Math.toRadians(angle2);
        this.angles[2] = Math.toRadians(180 - angle1 - angle2);

        calcSides();
        calcHighs();
    }

    public boolean addAngle(int num, double percent) {
        if (num < 0 || num > 1) return false;
        double modifier = angles[num] * percent / 100;
        if (angles[num] + modifier > Math.toRadians(180) || angles[num] + modifier < 0) return false;

        angles[num] += modifier;
        for (int i = 0; i < 3; i++) {
            if (i == num) continue;
            angles[i] -= modifier / 2;
        }

        calcSides();
        calcHighs();
        return true;
    }

    public double[] getHighs() {        
        return highs;
    }

    public double[] getSides() {
        return sides;
    }

    private void calcSides() {
        sides[1] = sides[0] * Math.sin(angles[0]) / Math.sin(angles[2]);
        sides[2] = sides[1] * Math.sin(angles[1]) / Math.sin(angles[0]);
    }

    private void calcHighs() {
        highs[0] = sides[0] * Math.sin(angles[1]);
        highs[1] = sides[1] * Math.sin(angles[2]);
        highs[2] = sides[2] * Math.sin(angles[0]);
    }
}