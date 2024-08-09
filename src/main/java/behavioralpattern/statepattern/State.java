package behavioralpattern.statepattern;

public abstract class State {
    public State(String Name)
    {
        this.Name = Name;
    }
    public String Name;

    public Context context;

    public void setContext(Context context)
    {
        this.context = context;
    }

    public abstract void Handle1();
    public abstract void Handle2();
}
