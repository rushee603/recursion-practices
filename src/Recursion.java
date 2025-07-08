public class Recursion {

    /**
     * Recursion - Recursion refers to a function that calls itself either directly or indirectly
     *
     * @return - result 120
     * @factorial- here it will start from 5->4->3->2 then if there is one it will stop and return 1.
     * @para - num input value
     */

    public static int factorial(int num) {

        if (num == 1) return 1;

        return num * factorial(num - 1);
    }

}
