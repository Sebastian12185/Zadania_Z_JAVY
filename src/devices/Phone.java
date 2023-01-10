package devices;

public class Phone extends Device{

    public Phone(String producer, String model,String color,Integer year){
        super(producer,model,color,year);
    }

    public void turnOn() {
        System.out.println("Uruchamianie telefonu...");
    }
    public String toString(){
        return "Producent: "+ this.producer+ " Model: "+ this.model+ " Kolor: "+this.color;
    }
}
