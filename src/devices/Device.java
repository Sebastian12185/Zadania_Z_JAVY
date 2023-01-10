package devices;

abstract public class Device {
    final String producer;
    final String model;
    final String color;
    Integer year;

    public Device(String producer, String model, String color, Integer year){
        this.producer = producer;
        this.model = model;
        this.color=color;
        this.year=year;
    }

    @Override
    public String toString() {
        return "producent: " + producer+" model: " + model +"kolor: "+ color+" rok produkcji: " + year;
    }

    abstract public void turnOn();
}
