package finalKey;

public class TestFinal {
    public static void main(String[] args) {

        FinalKeyWord fk = new FinalKeyWord();
        fk.displayFinal();

        Students st = new Students();

        st.display1(); // from students class method
        st.display(); // final method from University class but Inherit from Students class
    }
}
