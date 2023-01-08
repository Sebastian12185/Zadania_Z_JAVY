public class Car {
    String model;
    String producer;
    int year;
    String color;


    public Car(String model, String producer, int year, String color) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
    }
    public String toString(){
        return "Model: "+ this.model+ " Producent: "+ this.producer+ " Rocznik: "+this.year+ " Kolor: "+this.color;
    }
}
