public class Main {
    public static void main(String[] args) {

    }

    private List<Vegetation> createObjects() {
        List<Vegetation> list = new ArrayList<>();
        list.add(new Cactus("Igge", 0.2));
        list.add(new PalmTree("Laura", 0.5));
        list.add(new PalmTree("Olof", 1));
        list.add(new Carnivorous("Meatloaf", 0.7));

        return list;
    }

    private String getFoodSource(String className) {
        switch(className) {
            case "Cactus" -> {
                return FoodSource.MINERAL_WATER.foodSource;
            }
            case "PalmTree" -> {
                return FoodSource.TAP_WATER.foodSource;
            }
            case "Carnivorous" -> {
                return FoodSource.PROTEIN_SHAKE.foodSource;
            }
            default -> {
                return "";
            }
        }
    }

    private void outputMessage(double amountOfWater, String foodSource) {
        String message = String.format("You need to feed the plant with %.2f litres of %s", amountOfWater, foodSource);
        JOptionPane.showMessageDialog(null, message, "result", JOptionPane.INFORMATION_MESSAGE);
    }

}