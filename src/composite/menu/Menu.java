package src.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name = null;
    private String description = null;

    public Menu(String _name, String _description){
        this.name = _name;
        this.description = _description;
    }

    public void add(MenuComponent _menuComponent){
        menuComponents.add(_menuComponent);
    }
    public void remove(MenuComponent _menuComponent){
        menuComponents.remove(_menuComponent);
    }

    public MenuComponent getChild(int _i){
        return (MenuComponent)menuComponents.get(_i);
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
