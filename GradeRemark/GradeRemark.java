/*========================================================================================
Write a program to print remark according to the grade obtained using switch statement.
========================================================================================*/

import java.util.Scanner;

public class GradeRemark
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);

        switch (grade)
        {
            case 'A':
                System.out.println("Excellent! Keep up the good work.");
                break;
            case 'B':
                System.out.println("Very good! Try a little harder to reach the top.");
                break;
            case 'C':
                System.out.println("Good! But you can do better.");
                break;
            case 'D':
                System.out.println("You passed, but consider reviewing your material.");
                break;
            case 'F':
                System.out.println("Unfortunately, you failed. Study harder next time.");
                break;
            default:
                System.out.println("Invalid grade entered.");
                break;
        }
    }
}
