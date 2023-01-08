public class Animal{
    String name;
    Integer weight;
    String specie;

    public Animal(String name, Integer weight,String specie){
        this.name=name;
        this.weight=weight;
        this.specie=specie;
    }

    public String toString(){
        return "Imię: "+ this.name+ " Rasa: "+ this.specie+ " Waga: "+this.weight;
    }
}
