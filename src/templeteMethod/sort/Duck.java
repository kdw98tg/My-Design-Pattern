package src.templeteMethod.sort;

public class Duck implements Comparable<Duck>{
    private String name;
    private int weight;

    public Duck(String _name, int _weight){
        this.name = _name;
        this.weight = _weight;
    }

    @Override
    public String toString(){
        return name + " 체중 : " + weight;
    }

    public int compareTo(Duck _otherDuck){
        if (this.weight < _otherDuck.weight) {
            return -1;
        } else if (this.weight == _otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
}
