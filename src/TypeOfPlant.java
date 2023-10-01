public enum TypeOfPlant {
    CACTUS("mineral water"),
    PALMTREE("tap water"),
    CARNIVOROUS("protein shake");

    private final String foodSource;

    TypeOfPlant(String foodSource) {
        this.foodSource = foodSource;
    }

    public String getFoodSource() {
        return this.foodSource;
    }
}
