package devices;

public class Phone {
    String producer;
    String model;
    String color;

    public Phone(String producer, String model,String color){
        this.producer=producer;
        this.model=model;
        this.color=color;
    }

    public String toString(){
        return "Producent: "+ this.producer+ " Model: "+ this.model+ " Kolor: "+this.color;
    }
}
