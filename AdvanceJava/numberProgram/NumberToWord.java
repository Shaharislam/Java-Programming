package numberProgram;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input your number:= ");
        int n= sc.nextInt();
        String number = String.valueOf(n);
        numberToWords(number.toCharArray());
    }

    static void numberToWords(char num[])
    {
        int len = num.length;
        if (len == 0)
        {
            System.out.println("The string is empty.");
            return;
        }
        if (len > 4)
        {
            System.out.println("\n The given number has more than 4 digits.");
            return;
        }
        String[] oneDigitNumber = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twoDigitNumber = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multipleOften = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powerOften = new String[] {"Hundred", "Thousand"};

        System.out.print(String.valueOf(num) + ": ");
        if (len == 1)
        {
            System.out.println(oneDigitNumber[num[0]-'0']);
            return;
        }
        int x = 0;
        while (x < num.length)
        {
            if (len >= 3)
            {
                if (num[x] - '0' != 0)
                {
                    System.out.print(oneDigitNumber[num[x] - '0'] + " ");
                    System.out.print(powerOften[len - 3]+ " ");
                }
                --len;
            }
            else
            {
                if (num[x] - '0' == 1)
                {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(twoDigitNumber[sum]);
                    return;
                }
                else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)
                {
                    System.out.println("Twenty");
                    return;
                }
                else
                {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(multipleOften[i]+ " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(oneDigitNumber[num[x] - '0']);
                }
            }
            ++x;
        }
    }
}
