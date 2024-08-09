package behavioralpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Collection{
    List<Item> items = new ArrayList<>();

    public AbtractIterator createIterator()
    {
        return new Iterator(this);
    }

    public Item get(int index)
    {
        return items.get(index);
    }

    public void add(Item item)
    {
        this.items.add(item);
    }

    public int getSize()
    {
        return items.size();
    }
}
