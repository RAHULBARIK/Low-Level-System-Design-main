package org.example.designPattern.DecoratorDesignPattern.topping;

import org.example.designPattern.DecoratorDesignPattern.basePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    BasePizza basePizza;
    int cheeseCost = 20;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost()+cheeseCost;
    }
}
