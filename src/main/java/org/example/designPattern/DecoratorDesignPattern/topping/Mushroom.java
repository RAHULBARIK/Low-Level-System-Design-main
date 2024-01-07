package org.example.designPattern.DecoratorDesignPattern.topping;

import org.example.designPattern.DecoratorDesignPattern.basePizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;
    int mushroomCost = 30;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return basePizza.cost() + mushroomCost;
    }
}
