package src.templeteMethod.classicTemplate;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\n");

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n");

        CaffeineBeverageWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();
    }
}
