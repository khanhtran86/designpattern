package behavioralpattern.statepattern;

public class ConcreteStateB extends State{
    public ConcreteStateB(String Name) {
        super(Name);
    }

    @Override
    public void Handle1() {
        System.out.println("ConcreteStateB handle request 1.");
    }

    @Override
    public void Handle2() {
        System.out.println("ConcreateStateB handle request 2.");
        this.context.TransitionTo(new ConcreteStateA("State A"));
    }
}
