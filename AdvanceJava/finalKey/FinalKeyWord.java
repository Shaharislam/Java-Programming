package finalKey;

public class FinalKeyWord {
    final String UNIVERSITY_NAME = "BSMRSTU"; // this value we can't change / modify anywhere
    static final int FEES; // blank final variable

    static {
        FEES = 3000; // static final variable only can assign static blocks
    }
    void displayFinal(){
        System.out.println("Final Value:= "+UNIVERSITY_NAME);
        System.out.println("Static Blank Final Variable Fees: "+FEES);
    }
}
