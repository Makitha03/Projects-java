import java.util.Scanner;

public class SmallestNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three values:");

        System.out.print("Enter a values: ");
        int a = scanner.nextInt();

        System.out.print("Enter a values: ");
        int b= scanner.nextInt();

        System.out.print("Enter a values: ");
        int c = scanner.nextInt();

        if(a<b  && a<c)
    {
	System.out.println("a is a Smallest number");
     }
     else if(b<a && b<c)
     {
	System.out.println("b is a Smallest number");
     }
    else
   {
        System.out.println("c is a Smallest number");
  }
        scanner.close();
    }
}
