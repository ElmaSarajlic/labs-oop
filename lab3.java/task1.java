import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


//First task
public class Main {
    public static void main(String[] args) {
        double answer=average(4,3,6,1);
        System.out.println("Average of numbers is: "+ answer);
    }
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = number1+number2+number3+number4;
        double averageNumber = (double)sum / 4;

        return averageNumber;
    }
}
