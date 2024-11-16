/* Write a program that takes an integer input n and prints an inverted triangle of numbers.
 * For example, if n = 5, the output should be:
 */


 import java.util.Scanner;

 public class prob8 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows: ");
         int n = sc.nextInt();
         printInvPyramid(n);
     }
 
     public static void printInvPyramid(int n) {
         int i, j;
         // outer loop to handle number of rows
         for (i = n; i >= 1; i--) {
             // inner loop to handle number of columns
             for (j = 1; j <= i; j++) {
                 // printing column values upto the row value
                 System.out.print(j + " ");
             }
 
             // print new line for each row
             System.out.println();
         }
     }
 }
