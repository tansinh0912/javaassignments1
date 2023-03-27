import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Phương Trình Cân Bậc 2: ax2 + bx + c = 0 ");

        System.out.print("Value a: ");
        double a = scanner.nextDouble();

        System.out.print("Value b: ");
        double b = scanner.nextDouble();

        System.out.print("Value c: ");
        double c = scanner.nextDouble();

        double delta = (b*b) - (4*a*c);

        double x;

        //Kiểm tra hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương Trình Vô Nghiệm");
            }
            else {
                System.out.println("Phương Trình Có Một Nghiêm x : " + (x=-c/b));
            }
        }


        //Tính Delta
        if (delta == 0) {
            System.out.println("Phương Trình Có Nghiệm Kép: "+ (x=-b/2*a));
        } else if (delta > 0) {
            System.out.println("Phương Trình Có Nghiệm x1 = " + (x=((-b + Math.sqrt(delta))/2*a)));
            System.out.println("Phương Trình Có Nghiệm x2 = " + (x=((-b - Math.sqrt(delta))/2*a)));
        } else if (delta < 0) {
            System.out.println("Phương Trình Vô Nghiệm");
        }
    }
}
