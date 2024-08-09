package behavioralpattern.statepattern;

public class Context {
    private State state;

    public Context(State state)
    {
        this.TransitionTo(state);
    }

    public void TransitionTo(State state)
    {
        System.out.println("Context: Transition to "+ state.Name);
        this.state = state;
    }

    public void Request1()
    {
        this.state.Handle1();
    }

    public void Request2()
    {
        this.state.Handle2();
    }
}
