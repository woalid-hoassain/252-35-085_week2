package week2;

public class operator1 {
    public static void main(String[] args) {
        int x;
        x = 5;

        System.out.println("Current value of x is: " + x++); // 5 - 6
        System.out.println("Current value of x is: " + ++x);

        x = 5;

        System.out.println("Current value of x is: " + ++x); // 6 - 6
        System.out.println("Current value of x is: " + x++); // 6 - 7
    }
}
