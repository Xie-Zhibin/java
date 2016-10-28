//: HelloDate.java
import java.util.Date;
import static net.mindview.util.Print.*;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author island
 * @author www.zhibinnet.com
 * @version 1.0
 */

public class HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments.
     * @ throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        print("Hello, it's:");
        print(new Date());
    }
}/* Output: (55% match)
Hello, it's:
Fri Oct 21 10:30:03 CST 2016
*///:~
