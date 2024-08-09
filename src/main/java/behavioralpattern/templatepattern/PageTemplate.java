package behavioralpattern.templatepattern;

public abstract class PageTemplate {
    protected void showHeader()
    {
        System.out.println("<header/>");
    }

    protected void showNavigation(){
        System.out.println("<Nav/>");
    }

    public void showFooter(){
        System.out.println("<Footer/>");
    }

    protected abstract void showBody();

    public final void showPage()
    {
        showHeader();
        showNavigation();
        showBody();
        showFooter();
    }
}
