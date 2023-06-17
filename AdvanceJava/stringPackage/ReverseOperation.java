package stringPackage;

public class ReverseOperation {
    public static void main(String[] args){
        reverseString("First Hello World","First Operation:= ");
        reverseString("Hello","Second Operation:= ");

    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text,String OperationName){
        System.out.print(OperationName);
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
