package devices;

import main.Human;
import main.Sellable;

import java.net.URL;
import java.util.List;


public class Phone extends Device implements Sellable {

    public static final String DEFAULT_SERVER_ADDRESS = "https://appstore.com";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_VERSION = "1.0";
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

    public void installAnnApp(String appName) {
        System.out.println("Zainstalowano: "+appName);
    }
    public void installAnnApp(String appName, String appVersion) {
        System.out.println("Zainstalowano: "+appName+", Wersja: "+ appVersion);
    }
    public void installAnnApp(String appName, String appVersion, String serverAddress) {
        System.out.println("Zainstalowano: "+appName+", Wersja: "+ appVersion+", Adress serwera:"+serverAddress);
    }
    public void installAnnApp(List<String> appNames) {
        System.out.println("Zainstalowano: "+appNames);
    }
    public void installAnnApp(URL appURL) {
        System.out.println("Zainstalowano aplikację z adresu: "+appURL);
    }
}
