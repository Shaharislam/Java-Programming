package loop;

public class ForBreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i<= 3; i++) {
            if(i==3){
                System.out.println("Now Break this Loop");
                break;
            }

            for (int j = i; j<=5; j++) {

                if(j == 4) {
                    System.out.println("Now Continue and execute next Loop");
                    continue; // when j=4 then loop continue and execute again j=5
                }
                System.out.println(j);
            }
        }
    }
}

