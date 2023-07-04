package objects;

import java.awt.*;

public class anonymousObject {

    void fact(int  n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
    }
        public static void main(String[] args) {

        new anonymousObject().fact(5);//example of Anonymous Object
    }
}
