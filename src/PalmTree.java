public class PalmTree extends Vegetation {
    public PalmTree(String name, double height) {
        super(name, height);
    }

    @Override
    public double waterPlant() {
        return this.getHeight() * 0.5;
    }
}
