package stringPackage;

public class OperationString {
    public static void main(String[] args) {
        String country = "  Bangladesh is My  Country   ";
        System.out.println(country);

        String s3  = country.trim();// Remove Space from first and last word;
        System.out.println("Remove fisrt and last space:= "+s3);

        char ch = country.charAt(5);
        System.out.println("Ch:= "+ch);// first char of this string

        int value = country.indexOf("is");
        System.out.println("Index of Is:= "+value);

        int pos = country.lastIndexOf('n');
        System.out.println("Last N index:= "+pos);
    }
}
