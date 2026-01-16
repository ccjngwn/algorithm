import java.util.*;
import java.lang.*;
import java.io.*;

/*
*/
public class Main {
    public static void main(String[] args) throws IOException {

        for (int i = 1000; i <= 9999; i++) {
            int sum10 = sumOfDigits(i, 10);
            int sum12 = sumOfDigits(i, 12);
            int sum16 = sumOfDigits(i, 16);

            if (sum10 == sum12 && sum12 == sum16 && sum16 == sum10) System.out.println(i);
        }
    }

    public static int sumOfDigits(int num, int digit) {
        int sum = 0;
        for (int i = num; i > 0; i /= digit) {
            sum += i % digit;
        }

        return sum;
    }
}
