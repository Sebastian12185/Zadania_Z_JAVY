public class Human {
    String firstName, lastName;
    Animal pet;
    private double salary;

    Human() {
        System.out.println("Witaj człowieku!");
    }
    public String toString(){
        return "Imię: "+ this.firstName
                +" Nazwisko: "+ this.lastName+ " Zwierzę: "+ this.pet;
    }
}
