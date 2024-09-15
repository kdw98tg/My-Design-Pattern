package src.iterator.dinerMerger;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String _name, String _description, boolean _vegetarian, double _price) {
        this.name = _name;
        this.description = _description;
        this.vegetarian = _vegetarian;
        this.price = _price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
