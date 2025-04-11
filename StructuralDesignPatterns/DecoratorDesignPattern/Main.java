package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1=new Mushroom(new VegDelight());
        BasePizza pizza2=new ExtraCheese(new Mushroom(new Marghetia()));

        System.out.println(pizza1.cost()); //10+40
        System.out.println(pizza2.cost()); //20+40+30
    }
}
