import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input Math: " );
        double Match = scanner.nextDouble();
        System.out.print("Input Physic: " );
        double Physic = scanner.nextDouble();
        System.out.print("Input Chemistry: " );
        double Chemistry = scanner.nextDouble();

        double DTB = (Match+Physic+Chemistry)/3;

        if(DTB < 5.0){
            System.out.println(DTB + "Rank: D " );
        }
        else if(DTB >= 5.0){
            System.out.println("Average DTB " + DTB + " Rank: C ");
        } else if (DTB >= 6.5) {
            System.out.println("Average DTB " + DTB + " Rank: B ");
        } else if (DTB >= 8.0) {
            System.out.println("Average DTB " + DTB + " Rank: A ");
        }
    }
}
