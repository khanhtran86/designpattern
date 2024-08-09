package behavioralpattern.iterator;

public class Iterator extends AbtractIterator{
    Collection collection;
    int current=0;
    public Iterator(Collection collection)
    {
        this.collection = collection;
        this.Step =1;
    }
    @Override
    public Item First() {
        current =0;
        return (Item) collection.get(current);
    }

    @Override
    public Item Next() {
        current= current+ Step;
        if(!IsDone())
            return (Item) collection.get(current);
        return null;
    }

    public Item getCurrentItem()
    {
        return collection.get(current);
    }

    public boolean IsDone()
    {
        return current>= collection.getSize();
    }

    public void setStep(int step)
    {
        this.Step = step;
    }
}
