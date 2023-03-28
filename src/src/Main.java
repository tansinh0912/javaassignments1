

public class Main {
    public static void main(String[] args) {



        int a = 7;
        int b = 10;

        System.out.println("First Value a: " +a);
        System.out.println("First Value b: " +b);

        int c = a;
        a = b;
        b = c;

        System.out.println("Swap Value: " +a);
        System.out.println("Swap Value: " +b);
    }
    };
