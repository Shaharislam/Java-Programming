package stringPackage;

public class SplitString {
    public static void main(String[] args) {
        String s1 = " This is_my Country.";
        String s2 = s1.replace('i','j'); // i replace to J

        System.out.println("First String:= "+s1);
        System.out.println("Replace i to J:= "+s2);

        String[] s3 = s1.split(" "); // split this String where space
        for (String x: s3)
            System.out.println(x);

        String[] s4 = s1.split("_");
        for (String x: s4)
            System.out.println(x);
    }
}
