package src.factory.pizzas_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("준비중입니다" + name);
    }
    public void bake(){
        System.out.println("요리중입니다" + name);
    }
    public void cut(){
        System.out.println("자르는중입니다" + name);
    }
    public void box(){
        System.out.println("포장중입니다" + name);
    }
    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
