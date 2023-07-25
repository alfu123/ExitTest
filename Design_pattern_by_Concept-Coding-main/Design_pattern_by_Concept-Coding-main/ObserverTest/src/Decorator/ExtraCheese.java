package Decorator;

import BaseDecorator.BasePizza;

public class ExtraCheese extends Topping{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
