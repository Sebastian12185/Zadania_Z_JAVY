package devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, int year, String color, Double ofkoz) {
        super(model, producer, year, color, ofkoz);
    }

    public void refuel() {
        System.out.println("Zatankowano paliwo.");
    }
}
