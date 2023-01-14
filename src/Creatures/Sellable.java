package Creatures;

import Creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
