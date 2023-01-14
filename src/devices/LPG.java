package devices;

public class LPG extends Car{
    public LPG(String model, String producer, int year, String color, Double ofkoz) {
        super(model, producer, year, color, ofkoz);
    }

    public void refuel() {
        System.out.println("Nabito gaz.");
    }
}
