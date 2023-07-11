package arrayAndList;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String > country_name = new LinkedList<String >();

        country_name.add("Bangladesh");
        country_name.add("Pakistan");
        country_name.add("Afghanistan");
        country_name.add("Canada");
        country_name.add("Japan");
        country_name.add("UK");
        country_name.addFirst("Mokka-Modina");
        country_name.addLast("India");

        for (String country: country_name){
            System.out.println(country);
        }
        System.out.println();
        System.out.println("After Remove:");
        country_name.remove(7);
        for (String country: country_name){
            System.out.println(country);
        }

        // Remove Method Apply
        country_name.removeFirst();
        country_name.removeLast();
        System.out.println();
        System.out.println("After Remove First and Last Value:");
        for (String country: country_name){
            System.out.println(country);
        }

        System.out.println();
        System.out.print(" LinkedList Size:= "+country_name.size());
        System.out.println();

        // Apply Get Method
        System.out.println("First Element:= "+country_name.getFirst());
        System.out.println("Last Element:= "+country_name.getLast());

        // Apply Clear method
        country_name.clear();

        System.out.println("\nAfter Clear LinkedList:= ");
        System.out.println(country_name);
    }
}
