package week2;

public class Array2D {
    public static void main(String[] args) {
        int sum = 0;
        int a[][] = {{10, 20, 30},
                     {40, 50, 60}};
        for(int i = 0; i < 2; i++) { // for row
            for(int j = 0; j < 3; j++) { // for column
                sum = sum + a[i][j];
            }
        }

        System.out.println("Value of Avg: " + sum/6);
    }
}