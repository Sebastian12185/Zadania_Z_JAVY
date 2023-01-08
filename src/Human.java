import devices.Car;

import java.util.Date;
public class Human {
    String firstName, lastName;
    Animal pet;
    Car car;
    private Double salary;


    Human() {
        System.out.println("Witaj człowieku!");
    }
    public String toString(){
        return "Imię: "+ this.firstName
                +" Nazwisko: "+ this.lastName+ " Zwierzę: "+ this.pet+ " Samochód: "+this.car;
    }
    public Double getSalary() {
        System.out.println("Pobieranie danych o wypłacie z dnia " + new Date());
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
    }
    public void setCar(Car car) {
        if (salary > car.ofkoz) {
            System.out.println("Udało się kupić samochód za gotówkę.");
        } else if (salary > car.ofkoz / 12) {
            System.out.println("Udało się kupić samochód na kredyt (no trudno).");
        } else {
            System.out.println("Niestety nie stać Cię na ten samochód. Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
            return;
        }

        this.car = car;
    }
}
