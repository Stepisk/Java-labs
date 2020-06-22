package laba8.exercise2;

public class Train extends Transport {

    private Vagon[] vagons;
    
    public Train(Vagon[] vagons) {
        this("Train", vagons);
    }

    protected Train(String type, Vagon[] vagons) {
        super(type);
        this.vagons = vagons;
    }

    public Vagon getVagon(int num) {
        return vagons[num];
    }

    public int getNumOfVagons() {
        return vagons.length;
    }
}