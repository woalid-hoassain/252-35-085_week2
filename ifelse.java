package week2;

public class ifelse {
    public static void main(String[] args) {
        int x = 22;
        if(x % 2 == 0 && x % 5 == 0) {
            System.out.println("Hi");
        }
        else if(x % 2 == 0) {
            System.out.println("Divisible by 2 only");
        }
        else if(x % 5 == 0) {
            System.out.println("Divisible by 5 only");
        }
        else {
            System.out.println("Not divisible by 2 or 5");
        }
    }
}