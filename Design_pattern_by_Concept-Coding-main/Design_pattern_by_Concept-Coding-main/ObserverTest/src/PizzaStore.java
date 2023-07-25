import BaseDecorator.BasePizza;
import BaseDecorator.FarmHouse;
import BaseDecorator.Magherita;
import BaseDecorator.VegDelight;
import Decorator.ExtraCheese;
import Decorator.Mushroom;
import Decorator.Topping;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza farmHouse=new FarmHouse();
        BasePizza magherita=new Magherita();
        BasePizza vegDelight=new VegDelight();
        Topping topping1=new ExtraCheese(farmHouse);
        Topping topping2=new Mushroom(vegDelight);
        Topping topping3=new Mushroom(new ExtraCheese(farmHouse));
        System.out.println(topping1.cost());
        System.out.println(topping2.cost());
        System.out.println(topping3.cost());
    }
}
