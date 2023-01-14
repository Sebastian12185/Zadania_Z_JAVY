import creatures.Animal;
import creatures.Edible;
import creatures.FarmAnimals;
import creatures.Pet;
import devices.*;
import main.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Human me = new Human("Sebastian","Jakubek");
        Human me2 = new Human("Marek","Kowalski");
        Human me3 = new Human("Maciej","Stromski");
        Animal dog = new Pet("Borys","dog");
        Animal cow = new FarmAnimals("Baśka","cow");
        Phone phone = new Phone("POCO","F4 GT","black",2022);
        Diesel car = new Diesel("Ford", "Mustang", 2020, "Red",60000.0);
        LPG car2 = new LPG("Ford", "Focus", 2020, "Red",50000.0);
        Electric car3 = new Electric("VW", "Golf", 2020, "Black",50000.0);
        me.setSalary(12000.0);
        me2.setCash(801.0);
        me3.setCash(801.0);
        me.buyCar(car.toString(), car.getOfkoz());
        car.setCarOwner(me);
        phone.setPhoneOwner(me);
        dog.setAnimalOwner(me);
//                System.out.println(car);
//                System.out.println(me);
//                System.out.println(phone);
//        dog.feed();
//        System.out.println(dog);
//        for(int i=1; i<=14; i++){
//            dog.takeForWalk();
//            System.out.println(dog.weight);
//        }
//                System.out.println(dog);
//                System.out.println(me);
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
//        phone.installAnnApp("Instagram");
//        phone.installAnnApp("Messenger","1.1");
//        phone.installAnnApp("Facebook","1.1","https://play.google.com/");
//        List<String> appList = new ArrayList<>();
//        appList.add("WhatsApp");
//        appList.add("YouTube");
//        phone.installAnnApp(appList);
//        URL appURL = new URL("https://play.google.com/store/apps/details?id=com.telltalegames.walkingdead200");
//        phone.installAnnApp(appURL);
//        car3.refuel();
//        car.refuel();

    }
}