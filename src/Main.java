public class Main {

    public static void main(String[] args) {

        int result = factorial(5);

        System.out.println("result:" + result);
    }

    public static int factorial(int num) {

        int value = 1;

        for (int n = 1; n <= num; n++) {
            value = value * n;
        }
        return value;
    }

}