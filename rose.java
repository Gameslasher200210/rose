import java.util.Scanner;

public class rose {
    public static void area(int length, int breadth, int height) {
        int answer = length * breadth * height;
        System.out.println(answer);
    }

    public static int area2(int length, int breadth, int height) {
        int answer = length * breadth * height;
        return answer;
    }

    public static void main(String[] args) {
        Scanner roseScanner = new Scanner(System.in);
        System.out.println("Enter breadth:");
        int breadth = roseScanner.nextInt();
        System.out.println("Enter length:");
        int length = roseScanner.nextInt();
        System.out.println("Enter height:");
        int height = roseScanner.nextInt();

        area(length, breadth, height);
        int b = area2(length, breadth, height);
        System.out.println(b);
    }
}

