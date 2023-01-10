package devices;

import java.util.Objects;

public class Car extends Device{
    public Double ofkoz;


    public Car(String model, String producer, int year, String color,Double ofkoz) {
        super(producer,model,color,year);
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

    public void turnOn() {
        System.out.println("Uruchamianie silnika...");
    }

    public String toString(){
        return "Model: "+ this.model+ " Producent: "+ this.producer+ " Rocznik: "+this.year+ " Kolor: "+this.color;
    }
}
