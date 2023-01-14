package creatures;

public class Pet extends Animal{
    public Pet(String name,String specie) {
        super(name,specie);
    }
    public void beEaten() throws Exception{
        throw new Exception("Halo Policja");
    }
}
