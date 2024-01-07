package org.example.designPattern.DecoratorDesignPattern;

import org.example.designPattern.DecoratorDesignPattern.basePizza.Margherita;
import org.example.designPattern.DecoratorDesignPattern.topping.ExtraCheese;
import org.example.designPattern.DecoratorDesignPattern.topping.Mushroom;
import org.example.designPattern.DecoratorDesignPattern.topping.ToppingDecorator;

public class Main {
    public static  void main(String[] args){
        // I need a pizza having margherita base and mushroom and cheese as topping find me the cost;
        ToppingDecorator pizza = new Mushroom(new ExtraCheese(new Margherita()));

        System.out.println("cost of the final pizza: "+pizza.cost());

    }
}
