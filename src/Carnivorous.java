public class Carnivorous extends Vegetation {
    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public double waterPlant() {
        return 0.0;
    }
}
