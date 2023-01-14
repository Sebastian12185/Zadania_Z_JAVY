package devices;

import java.util.Objects;

import main.Sellable;

import main.Human;

public class Car extends Device implements Sellable{
    public Double ofkoz;
    public Human owner;

    public Car(String model, String producer, int year, String color,Double ofkoz) {
        super(producer,model,color,year);
        this.ofkoz = ofkoz;
        this.owner = null;
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
        return "Model: "+ this.model+ " Producent: "+ this.producer+ " Rocznik: "+this.year+ " Kolor: "+this.owner;
    }
    public void setCarOwner(Human owner) {
        this.owner = owner;
    }

    public String getCarOwner() {
        return "Właścicielem pojazdu jest: "+owner;
    }


    public void sell(Human seller, Human buyer, double price) {
        if (buyer.getCash() == null || this.owner == null){
            System.out.println("Tranzakcja nieudana");
        }
        else if(this.owner.equals(seller) && buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            this.setCarOwner(buyer);

            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
