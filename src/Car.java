public class Car {
    String model;
    String producer;
    int year;
    String color;
    Double ofkoz;


    public Car(String model, String producer, int year, String color,Double ofkoz) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
        this.ofkoz = ofkoz;
    }
    public String toString(){
        return "Model: "+ this.model+ " Producent: "+ this.producer+ " Rocznik: "+this.year+ " Kolor: "+this.color;
    }
}
