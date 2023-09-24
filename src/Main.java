public class Main {


    public static void main(String[] args) {

        int sumOfTwoNumbers = add(1,2);
        System.out.println(sumOfTwoNumbers);
        int sumOfFourNumbers = add(1,2,3,4);
        System.out.println(sumOfFourNumbers);
        String morning = morningGreeting("Thomas");
        System.out.println(morning);
        String afternoon = afternoonGreeting("Theodore Zhu");
        System.out.println(afternoon);
        String three = triple("oohbabbbbyyyy");
        System.out.println(three);
        double overTwo = half(5);
        System.out.println(overTwo);
        int roundPositive = roundPositiveValueToNearestInteger(6.9);
        System.out.println(roundPositive);
        int roundNegative = roundNegativeValueToNearestInteger(-6.9);
        System.out.println(roundNegative);

    }

    // 1. add
    public static int add(int a, int b) {
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(add(a,b),c),d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String oohbaby) {
        System.out.println(oohbaby + oohbaby + oohbaby);
        return oohbaby + oohbaby + oohbaby;

    }


    // 6. half
    public static double half(int a) {
        return (double) a /2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) (a+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        return (int) (a-0.5);
    }


}