package forwork.java.in;

import java.util.Scanner;

public class Romannumber {

	 public static int charToInteger(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static int romanToInteger(String roman) {
        int value = 0;
        int prevValue = 0;
        int flag = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int num1 = charToInteger(roman.charAt(i));

            if (num1 != -1) {
                if (num1 < prevValue) {
                    if (prevValue / num1 != 5 && prevValue / num1 != 10) {
                        flag = 1;
                        break;
                    }
                    value -= num1;
                } else {
                    value += num1;
                }
                prevValue = num1;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            return value;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Roman Letter :-");
        String roman = ob.next().toUpperCase();

        int result = romanToInteger(roman);

        if (result != -1) {
            System.out.println(roman + " : " + result);
        } else {
            System.out.println("Invalid Roman numeral.");
        }
    }
}