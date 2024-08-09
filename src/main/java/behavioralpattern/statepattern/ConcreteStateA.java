package behavioralpattern.statepattern;

public class ConcreteStateA extends State{
    public ConcreteStateA(String Name) {
        super(Name);
    }

    @Override
    public void Handle1() {
        System.out.println("ConcreteStateA handles request 1.");
        State stateB = new ConcreteStateB("State B");
        stateB.context = this.context;
        this.context.TransitionTo(stateB);
    }

    @Override
    public void Handle2() {
        System.out.println("ConcreteStateA handles request 2.");
    }
}
