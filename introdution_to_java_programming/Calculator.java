public class Calculator {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3){
            System.out.println("Usage: e.g. (java Calculator 12 + 23)");
            System.exit(0);
        }
        int result = 0;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        switch (args[1].charAt(0)){
            case '+': {
                result = a + b;
                break;
            }
            case '-': {
                result = a - b;
                break;
            }
            case '/': {
                result = a / b;
                break;
            }
            case '.': {
                result = a * b;
                break;
            }
        }
        System.out.println("" + a + ' ' + args[1] + ' ' + b + " = " + result);
    }
}