/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Lucas Mao
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        //Show example of adding two ints
        int one = add(3, 8);
        System.out.println("add 3 and 8 = " + one);

        int two = add(3,8,4,9);
        System.out.println("add 3 8 4 9 and you get " + two);

        String three = morningGreeting("Toby Fox");
        System.out.println("Good morning to Toby Fox is " + three);

        String four = afternoonGreeting("Mac Miller");
        System.out.println("Good afternoon to Mac Miller is " + four);

        String five = triple("oohbaby");
        System.out.println("Triple that and you get " + five);
        /*
        int six = half(17);
        int seven = half(8);
        System.out.println("Halving 17 and 8 gives you " + six + " and " + seven);

        /*

        double eight = roundpositivetonearestinteger(8.5);
        double nine = roundpositivetonearestinteger(8.49);
        System.out.println("Rounding positive integers 8.5 and 8.49 give you " + eight +  " and " + nine);

        double ten = floor(-8.5);
        double eleven = floor(-8.49);
        System.out.println("Rounding negative integers -8.5 and -8.49 give " + ten + " and " + eleven);

         */
    }



    // 1. add
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        int sum1 = add(num1, num2);
        int sum2 = add(sum1, num3);
        return add(sum2, num4);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
    return ("早上好, " + name + "!");
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
    return ("下午好, " + name + "!");
    }

    // 5. triple
    public static String triple(String word){
    return word + word + word;
    }

    // 6. half
    public static double half(double num){
    return num/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double num9){
    return Math.round(num9);
    }

    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double num){
    return -Math.round(-num);
    }

}
