import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final String INPUT_MSG = "Please enter the name of the plant to be watered.";
    private final String INPUT_ERROR = "Couldn't find plant. Please try again!";

    private final String INPUT_EMPTY = "You must enter something. Please try again!";
    private double amountOfWater;
    private String nameOfClass;

    public static void main(String[] args) {
        Main m = new Main();
        List<Vegetation> plantList = m.createObjects();

        String input = JOptionPane.showInputDialog(null, "Please enter the name of the plant to be watered.").trim();
        double amountOfWater = 0;
        String className = "";

        for (Vegetation plant : plantList) {
            if(input.equalsIgnoreCase(plant.getName())) {
                amountOfWater = plant.waterPlant();
                className = plant.getClass().getName();
            }
        }

        String foodSource = m.getFoodSource(className);
        m.outputMessage(amountOfWater, foodSource);
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