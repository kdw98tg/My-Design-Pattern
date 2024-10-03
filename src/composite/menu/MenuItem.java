package src.composite.menu;

public class MenuItem extends MenuComponent {
    private String name = null;
    private String description = null;
    private boolean isVegetarian = false;
    private double price = 0d;

    public MenuItem(String _name, String _description, boolean _isVegetarian, double _price) {
        this.name = _name;
        this.description = _description;
        this.isVegetarian = _isVegetarian;
        this.price = _price;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }
    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
}
