package allTypeOfVariables;

public class StaticMethod {
     static int count = 10;
     int count2;
    StaticMethod(){
        System.out.println("This is StaticMethod Class");
    }

  static void staticMethodInAClass(){
        count++;
      System.out.println("This is calling from StaticMethod Class: Count = "+count);

    }

}
