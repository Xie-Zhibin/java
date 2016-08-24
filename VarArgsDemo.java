public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(12, 343, 45, 333);
    }

    public static void printMax(int j, double... numbers){
        if (numbers.length == 0) {
            System.out.println("No args passed!");
            return;
        }
        double result = numbers[0];
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max is: " + result);
    }
}