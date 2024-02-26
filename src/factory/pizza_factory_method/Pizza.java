package src.factory.pizza_factory_method;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    protected void prepare() {
        System.out.println("준비중... " + name);
        System.out.println("도우 전달중...");
        System.out.println("소스 바르는 중...");
        System.out.println("토핑 넣는 중: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    protected void bake() {
        System.out.println("350도에서 25분 구움, bake 호출");
    }

    protected void cut() {
        System.out.println("피자 자름, cut 호출");
    }

    protected void box() {
        System.out.println("피자 포장중, box 호출");
    }

    public String getName() {
        return name;
    }

    public String toString() {
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
