public class PalmTree extends Vegetation {
    public PalmTree(String name, double height) {
        super(name, height);
    }

    @Override
    public double waterPlant() {
        return 0.0;
    }
}
