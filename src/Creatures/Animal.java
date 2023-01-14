package Creatures;

public class Animal implements Sellable{
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 5.0;
    private static final Double DEFAULT_MOUSE_WEIGHT = 1.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    String name;
    public Double weight;
    Boolean isAlive;
    String specie;
    public Human owner;

    public Animal(String name,String specie){
        this.name = name;
        this.specie =specie;
        this.isAlive = true;
        this.owner = null;
        switch(specie){
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "mouse" -> this.weight = DEFAULT_MOUSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed(){
        if(this.isAlive) {
            this.weight += 1;
            System.out.println("dzięki za żarcie");
        }
        else {
            System.out.println("Wszystko dobrze z głową?");
        }
    }
    public void takeForWalk(){
        if(this.isAlive){
            this.weight-=1;
            System.out.println("Dzięki za spacer");
        }
        if(this.weight<=0) {
            this.isAlive = false;
            System.out.println("Zwierzę nie żyje");
        }

    }

    public String toString(){
        return "Imię: "+ this.name+ " Rasa: "+ this.specie+ " Waga: "+this.weight;
    }

    public void setAnimalOwner(Human owner) {
        this.owner = owner;
    }

    public String getAnimalOwner() {
        return "Właścicielem zwierzęcia jest: "+owner;
    }

    public void sell(Human seller, Human buyer, double price) {
        if (buyer.getCash() == null || this.owner == null){
            System.out.println("Tranzakcja nieudana");
        }
        else if(this.owner.equals(seller) && buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            this.setAnimalOwner(buyer);

            System.out.println("Transaction successful");
        } else {
            System.out.println("Transaction failed");
        }
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
