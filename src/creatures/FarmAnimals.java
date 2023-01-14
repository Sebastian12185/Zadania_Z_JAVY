package creatures;

public class FarmAnimals extends Animal implements Edible{
    public FarmAnimals(String name,String specie) {
        super(name,specie);
    }
    public void beEaten() {
        System.out.println(this.getName() + " został/a zjedzony/a.");
    }
}
