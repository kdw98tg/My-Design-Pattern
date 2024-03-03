package src.factory.pizzaf;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    abstract void prepare();

    protected void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    protected void cut(){
        System.out.println("피자 사선으로 자르기");
    }
    protected void box(){
        System.out.println("상자에 피자 담기");
    }
    protected void setName(String _name){
        this.name = _name;
    }
    protected String getName(){
        return name;
    }
    public String toString(){
        //피자 이름 출력
        return null;
    }
}
