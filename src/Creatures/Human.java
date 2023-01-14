package Creatures;

import devices.Car;
import devices.Device;

import java.util.Date;
public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    private Double salary;
    private Double cash;


    public Human(String firstName, String lastName) {

        System.out.println("Witaj człowieku!");
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return "Imię: "+ this.firstName
                +" Nazwisko: "+ this.lastName;
    }
    public Double getSalary() {
        System.out.println("Pobieranie danych o wypłacie z dnia " + new Date() +" Kwota: "+salary+" zł");
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości wypłaty.");
            return;
        }

        System.out.println("Wysyłanie nowych danych do systemu księgowego.");
        System.out.println("Prosimy odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty, więc nie ma sensu ukrywać dochodu.");
        this.salary = salary;
        this.cash = salary;
    }
    public void buyCar(Car car) {
    if(salary == null) {
        System.out.println("Najpierw idź do pracy zarobić pieniądze");
    } else if (salary > car.ofkoz) {
            System.out.println("Udało się kupić samochód za gotówkę.");
        } else if (salary > car.ofkoz / 12) {
            System.out.println("Udało się kupić samochód na kredyt (no trudno).");
        } else {
            System.out.println("Niestety nie stać Cię na ten samochód. Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
            return;
        }
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void sell(Human seller, Human buyer, double price) {
        if((seller instanceof Human && buyer instanceof Human)) {
            System.out.println("Sprzedaż nieudana: Handel ludzi nie jest dostępny!");
        }
    }

}
