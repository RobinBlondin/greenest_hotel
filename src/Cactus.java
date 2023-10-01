public class Cactus extends Vegetation{

    public Cactus(String name, double height) {
        super(name, height);
    }

    //polymorphism
    @Override
    public double waterPlant() {
        return 0.02;
    }
}
