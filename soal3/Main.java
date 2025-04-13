package soal3;
public class Main {
    public static void main(String[] args) {
        BackForwardBrowser backForward = new BackForwardBrowser();

        backForward.tambahData("https://www.google.com/search?q=comparable+java+integer");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareto-method");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareunsigned-method");

        backForward.back();
        backForward.forward();
        backForward.history();
    }
}
