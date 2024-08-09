package behavioralpattern.templatepattern;


public class Test {
    public static void main(String[] args) {
        PageTemplate homepage = new HomePage();
        homepage.showPage();

        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();
    }
}
