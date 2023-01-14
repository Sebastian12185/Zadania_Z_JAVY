import creatures.Animal;
import creatures.Edible;
import creatures.FarmAnimals;
import creatures.Pet;
import main.Human;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) throws Exception {

        Human me = new Human("Sebastian","Jakubek");
        Human me2 = new Human("Marek","Kowalski");
        Human me3 = new Human("Maciej","Stromski");
//        System.out.println(me);
        Animal dog = new Pet("Borys","dog");
        Animal cow = new FarmAnimals("Baśka","cow");
//        System.out.println(dog);
        Phone phone = new Phone("POCO","F4 GT","black",2022);
//        System.out.println(phone);
//        dog.feed();
//        System.out.println(dog);
//        for(int i=1; i<=14; i++){
//            dog.takeForWalk();
//            System.out.println(dog.weight);
//        }
        Car car = new Car("Ford", "Mustang", 2020, "Red",60000.0);
        Car car2 = new Car("Ford", "Focus", 2020, "Red",50000.0);
//        System.out.println(me);
        me.setSalary(12000.0);
        me2.setCash(801.0);
        me3.setCash(801.0);
        me.buyCar(car);
//        System.out.println(car);
        car.setCarOwner(me);
        phone.setPhoneOwner(me);
        dog.setAnimalOwner(me);
//        System.out.println(me.getCar());
//        if(car.equals(car2)){
//            System.out.println("Dwa samochody są takie same z opisem: "+car);
//        }
//        car.turnOn();
//        phone.turnOn();
//        me.getCash();
//        System.out.println(me.getCash());
//        System.out.println(me2.getCash());
//        System.out.println(car.getCarOwner());
//        car.sell(me, me2, 800.0);
//        car2.sell(me2,me,100);
//        System.out.println(me.getCar());
//          me.sell(me2,me3,1.0);
//        System.out.println(car.getCarOwner());
//        System.out.println(me.getCash());
//        System.out.println(me2.getCash());
//        System.out.println(phone.getPhoneOwner());
//        phone.sell(me,me2,1.0);
//        System.out.println(phone.getPhoneOwner());
//                System.out.println(dog.getAnimalOwner());
//        System.out.println(me.getCash());
//        dog.sell(me,me2,1.0);
//        System.out.println(me.getCash());
//        System.out.println(dog.getAnimalOwner());
//        dog.beEaten();
//        cow.beEaten();
    }
}