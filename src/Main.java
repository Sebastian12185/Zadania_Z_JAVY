import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Sebastian";
        me.lastName = "Jakubek";
//        System.out.println(me);
        Animal dog = new Animal("Borys","dog");
//        System.out.println(dog);
        Phone phone = new Phone("POCO","F4 GT","black",2022);
//        System.out.println(phone);
        me.pet= dog;
//        dog.feed();
//        System.out.println(dog);
//        for(int i=1; i<=14; i++){
//            dog.takeForWalk();
//            System.out.println(dog.weight);
//        }
        Car car = new Car("Ford", "Mustang", 2020, "Red",60000.0);
        Car car2 = new Car("Ford", "Mustang", 2020, "Red",50000.0);
//        System.out.println(me);
        me.setSalary(12000.0);
//        System.out.println(me.getSalary());
        me.setCar(car);
//        if(car.equals(car2)){
//            System.out.println("Dwa samochody są takie same z opisem: "+car);
//        }
//        car.turnOn();
//        phone.turnOn();
    }
}