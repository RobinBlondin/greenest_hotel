public class Carnivorous extends Vegetation {
    public Carnivorous(String name, double height) {
        super(name, height);
    }

    //Polymorphism
    @Override
    public double waterPlant() {
        return 0.1 + (this.getHeight() * 0.2);
    }
}
