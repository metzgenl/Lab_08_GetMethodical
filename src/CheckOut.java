import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        Boolean done = Boolean.FALSE;
        do{
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item $", 0.50,10.00);
            totalPrice = totalPrice + itemPrice;
            done = SafeInput.getYNConfirm(in, "Would you like to enter another item (Y or N)");
        }while(done);

        System.out.printf("\nThe total cost of your items is $%.2f \n", totalPrice);

        }



    }