package abstractPackage;

public  abstract class MobileUser {
    abstract void sendMessage(); // abstract method

    // Non_Abstract method
    void call(){
        System.out.println(" Non_Abstract method");
    }
}
