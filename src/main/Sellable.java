package main;

import main.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
