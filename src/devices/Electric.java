package devices;

public class Electric extends Car{
    public Electric(String model, String producer, int year, String color, Double ofkoz) {
        super(model, producer, year, color, ofkoz);
    }

    public void refuel() {
        System.out.println("Naładowano samochód");
    }
}
