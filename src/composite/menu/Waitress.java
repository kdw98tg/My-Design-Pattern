package src.composite.menu;

public class Waitress {
    private MenuComponent allMenus = null;
    public Waitress(MenuComponent _allMenus){
        this.allMenus = _allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
