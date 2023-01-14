package devices;

import Creatures.Human;
import Creatures.Sellable;

public class Phone extends Device implements Sellable {

    public Human owner;
    public Phone(String producer, String model,String color,Integer year){
        super(producer,model,color,year);
        this.owner = null;
    }

    public void turnOn() {
        System.out.println("Uruchamianie telefonu...");
    }
    public String toString(){
        return "Producent: "+ this.producer+ " Model: "+ this.model+ " Kolor: "+this.color;
    }

    public void setPhoneOwner(Human owner) {
        this.owner = owner;
    }

    public String getPhoneOwner() {
        return "Właścicielem telefonu jest: "+owner;
    }

    public void sell(Human seller, Human buyer, double price) {
        if (buyer.getCash() == null || this.owner == null){
            System.out.println("Tranzakcja nieudana");
        }
        else if(this.owner.equals(seller) && buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            this.setPhoneOwner(buyer);

            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed");
        }
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
