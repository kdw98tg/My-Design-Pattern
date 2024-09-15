package src.iterator.dinerMerger;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] items = null;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] _items) {
        this.items = _items;
    }

    @Override
    public boolean hasNext() {
        return items.length > position;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
