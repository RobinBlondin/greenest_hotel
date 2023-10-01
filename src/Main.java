import javax.swing.*;

public class Main {
    //inkapsling
    private final String INPUT_MSG = "Please enter the name of the plant to be watered.";
    private final String INPUT_ERROR = "Couldn't find plant. Please try again!";
    private final String INPUT_EMPTY = "You must enter something. Please try again!";
    private double fluidAmount;
    private String nameOfClass;

    public static void main(String[] args) {
        Main m = new Main();

        while(true){
            if (!m.greenestHotel(m)) {
                break;
            } else {
                m.clearGlobals(m);
            }
        }
    }

    private boolean greenestHotel(Main m) {
        Vegetation[] listOfPlants = {
            new Cactus("Igge", 0.2),
            new PalmTree("Laura", 0.5),
            new PalmTree("Olof", 1),
            new Carnivorous("Meatloaf", 0.7)
        };

        String input = JOptionPane.showInputDialog(null, m.INPUT_MSG,"Greenest hotel", JOptionPane.QUESTION_MESSAGE);

        if (input == null) {
            return false;
        } else if (input.isEmpty()) {
            errorMessage(m.INPUT_EMPTY);
            return true;
        }

        findPlant(listOfPlants, input.trim());

        try {
            String foodSource = m.getFoodSource(nameOfClass);
            m.outputMessage(fluidAmount, foodSource);
        } catch(IllegalArgumentException e) {
            m.errorMessage(m.INPUT_ERROR);
        }
        return true;
    }

    private void findPlant(Vegetation[] plantList, String input) {
        for (Vegetation plant : plantList) {
            if(input.equalsIgnoreCase(plant.getName())) {
                fluidAmount = plant.waterPlant();
                nameOfClass = plant.getClass().getName().toUpperCase();
            }
        }
    }

    private String getFoodSource(String nameOfClass) {
        try {
            TypeOfPlant pt = TypeOfPlant.valueOf(nameOfClass);
            return pt.getFoodSource();
        } catch (NullPointerException e) {
            return "";
        }
    }

    private void outputMessage(double fluidAmount, String foodSource) {
        if (fluidAmount == 0 || foodSource.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String message = String.format("You need to feed the plant with %.2f litres of %s", fluidAmount, foodSource);
        JOptionPane.showMessageDialog(null, message, "result", JOptionPane.INFORMATION_MESSAGE);
    }

    private void errorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void clearGlobals(Main m) {
        m.fluidAmount = 0;
        m.nameOfClass = null;
    }

}