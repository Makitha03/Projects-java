import java.util.Scanner;

public class Numberrange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scan.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scan.nextInt();

       
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        scan.close();
    }
}
