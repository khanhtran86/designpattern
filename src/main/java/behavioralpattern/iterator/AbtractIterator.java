package behavioralpattern.iterator;

public abstract class AbtractIterator {
    public abstract Item First();
    public abstract Item Next();
    public abstract boolean IsDone();
    public Item CurrentItem;
    public int Step;

    public abstract void setStep(int step);
}
