package abstractPackage;

public class TestAbs {
    public static void main(String[] args) {
        MobileUser mu; // Abstract class reference Object

        mu = new Rahim();
        mu.sendMessage();
        mu.call();

        mu = new Karim();
        mu.sendMessage();
        mu.call();
    }
}
