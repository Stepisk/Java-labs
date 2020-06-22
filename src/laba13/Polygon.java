package laba13;

public class Polygon {
    private int n;
    private Coord[] coords;
    private double S;

    public Polygon(Coord[] coords) {
        this.n = coords.length;
        this.coords = coords;
        calcS();
    }

    private void calcS() {
        double sum1 = 0d, sum2 = 0d;
        for (int i = 0; i < n - 1; i++) {
            sum1 += coords[i].x * coords[i + 1].y;
            sum2 += coords[i].y * coords[i + 1].x;
        }
        sum1 += coords[n - 1].x * coords[0].y;
        sum2 += coords[n - 1].y * coords[0].x;

        this.S = Math.abs((sum1 - sum2) / 2d);
    }

    public int getN() { return n; }
    public Coord getCoord(int index) { return coords[index]; }
    public double getS() { return S; }
}