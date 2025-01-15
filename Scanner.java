import java.util.Scanner;

public class InfoOf3 {
    // Function to check if all numbers are equal
    public static boolean allAreEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Function to check if exactly two numbers are equal
    public static boolean twoAreEqual(int a, int b, int c) {
        return (a == b && b != c) || (a == c && b != c) || (b == c && a != b);
    }

    // Function to check if none of the numbers are equal
    public static boolean noneAreEqual(int a, int b, int c) {
        return a != b && b != c && a != c;
    }

    // Function to check if the numbers are in ascending order
    public static boolean areAscending(int a, int b, int c) {
        return a <= b && b <= c;
    }

    // Function to check if the numbers are in descending order
    public static boolean areDescending(int a, int b, int c) {
        return a >= b && b >= c;
    }

    // Function to check if the numbers are strictly in ascending order
    public static boolean strictlyAscending(int a, int b, int c) {
        return a < b && b < c;
    }

    // Function to check if the numbers are strictly in descending order
    public static boolean strictlyDescending(int a, int b, int c) {
        return a > b && b > c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("first number? ");
        int a = sc.nextInt();

        System.out.print("second number? ");
        int b = sc.nextInt();

        System.out.print("third number? ");
        int c = sc.nextInt();

        System.out.println("allAreEqual: " + allAreEqual(a, b, c));
        System.out.println("twoAreEqual: " + twoAreEqual(a, b, c));
        System.out.println("noneAreEqual: " + noneAreEqual(a, b, c));
        System.out.println("areAscending: " + areAscending(a, b, c));
        System.out.println("areDescending: " + areDescending(a, b, c));
        System.out.println("strictlyAscending: " + strictlyAscending(a, b, c));
        System.out.println("strictlyDescending: " + strictlyDescending(a, b, c));
    }
}

	
