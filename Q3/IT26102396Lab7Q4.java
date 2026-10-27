import java.util.Scanner;

public class IT26102396Lab7Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.05;
        final int NUMBER_OF_CUSTOMERS = 5;

        double billAmount, amountToPay;
        char paymentMode;
        double discount = 0;

        for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++) {

            System.out.println("Customer: " + customerCount);

            System.out.println("Enter the total Bill Amount:");
            billAmount = input.nextDouble();

            System.out.println("Enter the mode of payment (C for cash, O for other):");
            paymentMode = input.next().toUpperCase().charAt(0);

            if (paymentMode == 'C') {

                discount = billAmount * DISCOUNT_RATE;
                amountToPay = billAmount - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be Paid: " + amountToPay);

            } else if (paymentMode == 'O') {

                amountToPay = billAmount;

                System.out.println("No Discount Applicable");
                System.out.println("Amount to be Paid: " + amountToPay);

            } else {

                System.out.println("Payment Mode Is Not Valid");
                System.out.println("");
                continue;
            }

            System.out.println("");
        }

        
        
    }
}
