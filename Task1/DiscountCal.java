import java.util.Scanner;

public class DiscountCal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the purchase amt: ");
        double purchaseamt = scanner.nextDouble();

        
        double discount = 0;
        if(purchaseamt<=500)
        {
	discount=purchaseamt;
         }
       else if (purchaseamt >= 500 && purchaseamt <= 1000) 
      {

            discount = purchaseamt * 0.10; 
        } 
        else if (purchaseamt > 1000) 
       {
            discount = purchaseamt * 0.20; 
        }

        double finalAmount = purchaseamt- discount;

        
        System.out.printf("The final payable amount after discount is"+finalAmount);

       
        scanner.close();
    }
}
