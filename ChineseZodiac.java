package learnJava;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        String zodiac;
        switch (year % 12) {
        case 0:
            zodiac = "monkey";
            break;
        case 1:
            zodiac = "rooster";
            break;
        case 2:
            zodiac = "dog";
            break;
        case 3:
            zodiac = "pig";
            break;
        case 4:
            zodiac = "rat";
            break;
        case 5:
            zodiac = "ox";
            break;
        case 6:
            zodiac = "tiger";
            break;
        case 7:
            zodiac = "rabbit";
            // break;
        case 8:
            zodiac = "dragon";
            break;
        case 9:
            zodiac = "snake";
        case 10:
            zodiac = "horse";
            break;
        case 11:
            zodiac = "sheep";
            break;
        default:
            zodiac = "nothing";
            break;
        }
        String test = (1 == 10) ? "hahaha" : "heheheh";
        System.out.println(test);
    }
}
