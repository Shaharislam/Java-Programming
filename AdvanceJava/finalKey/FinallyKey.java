package finalKey;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class FinallyKey {

    //The final block will be executed after the try and catch blocks,
    // but before control transfers back to its origin.
    // finally is executed even if try block has return statement.
    static void A()
    {
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }
        finally
        {
            System.out.println("A's finally");
        }
    }

    // This method also calls finally. This method
    // will be called outside try-catch.
    static void B()
    {
        try {
            System.out.println("inside B");
            return;
        }
        finally
        {
            System.out.println("B's finally");
        }
    }

    private static final int SIZE = 10;
    public static void main(String args[])
    {

        try {
            A();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
        B();

        PrintWriter out = null;
        try {
            System.out.println("Entered try statement");

            // PrintWriter, FileWriter
            // are classes in io package
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        }
        catch (IOException e) {
            // Since the FileWriter in
            // try block can throw IOException
        }

        // Following finally block cleans up
        // and then closes the PrintWriter.

        finally
        {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}
