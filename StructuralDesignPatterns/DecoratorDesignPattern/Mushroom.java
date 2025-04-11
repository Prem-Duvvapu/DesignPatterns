package design-patterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator {
    BasePizza pizza;

    Mushroom(BasePizza pizza) {
        this.pizza=pizza;
    }

    public int cost() {
        return pizza.cost()+40;
    }
}
