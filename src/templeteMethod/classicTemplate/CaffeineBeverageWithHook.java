package src.templeteMethod.classicTemplate;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
            addCondiments();
    }

    protected abstract void brew();
    protected abstract void addCondiments();
    private void boilWater(){
        System.out.println("물 끓이는 중");
    }
    private void pourInCup(){
        System.out.println("컵에 따르는 중");
    }
    public boolean customerWantsCondiments(){
        return true;
    }

}
