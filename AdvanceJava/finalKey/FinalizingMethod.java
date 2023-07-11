package finalKey;
import  java.lang.*;
public class FinalizingMethod  extends Students{
    public static void main(String[] args)
    {
        FinalizingMethod m = new FinalizingMethod();

        //Note: As finalize is a method and not a reserved keyword, so we can call finalize method
        // Calling finalize method Explicitly.
        m.finalize();
        m.finalize();
        m = null;

        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }

    // Here overriding finalize method
    //Note: As finalize is a method and not a reserved keyword, so we can call finalize method
    public void finalize()
    {

        System.out.println("finalize method overridden");
    }
}
