package stringPackage;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Rakib");

        System.out.println("sb:= "+sb);

        sb.append(" +Bristy "); // two string add but in General String we can't use. for that String Buffer is best
        System.out.println("Append:= "+sb);

        sb.append(25);
        System.out.println("Add 25:= "+sb);
        sb.setLength(10);
        System.out.println("Length of 10:= "+sb);

    }
}
