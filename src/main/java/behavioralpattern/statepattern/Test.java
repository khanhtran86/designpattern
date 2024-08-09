package behavioralpattern.statepattern;

public class Test {
    public static void main(String[] args) {
        State stateA = new ConcreteStateA("State A");
        Context context = new Context(stateA);
        stateA.setContext(context);

        context.Request1();
        context.Request2();
    }
}
