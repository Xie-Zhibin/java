/***********************************
File Name: ReadData.java
Author: island
Email: 1159401236@qq.com 
Created Time: 2016年08月28日 星期日 08时49分14秒
***********************************/
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args)
    throws Exception {
        // Create a File instance
        java.io.File file = new java.io.File("scores.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score);
        }
        // Close the file
        input.close();
    }
}

