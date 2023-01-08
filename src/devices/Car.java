package devices;

import java.util.Objects;

public class Car {
    String model;
    String producer;
    int year;
    String color;
    public Double ofkoz;


    public Car(String model, String producer, int year, String color,Double ofkoz) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
        this.ofkoz = ofkoz;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(color, car.color);
    }

    public String toString(){
        return "Model: "+ this.model+ " Producent: "+ this.producer+ " Rocznik: "+this.year+ " Kolor: "+this.color;
    }
}
