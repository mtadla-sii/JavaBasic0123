package ch9_constructor;

public class BrowserProgram {
    public static void main(String[] args) {
        Browser chrome = new Browser("google", "chrome", 120);
        Browser edge = new Browser("ms", "edge", 100);

        System.out.println(chrome.getBrowserData());
        System.out.println(edge.getBrowserData());
    }
}
