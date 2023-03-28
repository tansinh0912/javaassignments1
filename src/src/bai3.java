import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phuong Trinh Bac Nhat Mot An : ax+b=0");

        System.out.print("Input Value a: ");
        double a = scanner.nextInt();
        System.out.print("Input Value b: ");
        double b = scanner.nextInt();

        double kq = -(b/a);

        if (a > 0) {
            System.out.println("Value x: " + kq);
        } else if (a < 0) {
            System.out.println("Value x: " + kq);
        } else  {
            System.out.println("The Equation Has No Solution");
        }
    }
}
