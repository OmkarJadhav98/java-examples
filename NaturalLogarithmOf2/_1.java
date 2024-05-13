/*=====================================================================================
Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
=====================================================================================*/

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        double ln2 = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ln2 -= 1.0 / i;
            } else {
                ln2 += 1.0 / i;
            }
        }

        System.out.println("Natural logarithm of 2: " + ln2);
    }
}

