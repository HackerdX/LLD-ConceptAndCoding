package com.DecoratorPattern;

import com.DecoratorPattern.BasePizza.BasePizza;
import com.DecoratorPattern.BasePizza.Margherita;
import com.DecoratorPattern.Toppings.ExtraCheese;
import com.DecoratorPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom( new ExtraCheese( new Margherita() ) ); // you can do this
        System.out.println(pizza.cost());

        // OR THIS BELOW: ( this one is better as its not horizontally growing.
        pizza = new Margherita();
        pizza = new Mushroom(pizza);
        pizza = new ExtraCheese(pizza);

        System.out.println(pizza.cost());
    }
}