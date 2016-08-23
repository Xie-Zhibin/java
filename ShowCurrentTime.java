package learnJava;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = (int)(totalMilliSeconds / 1000.0);
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("GMT: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
