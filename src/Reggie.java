import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String mNumber = "";
        String menuChoice = "";
        ssn = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter your UC Student M Number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O, S, V, or Q)", "^[OoSsVvQq]");
        System.out.println("Here are your inputs: SSN = " + ssn + ", M Number = " + mNumber + ", and Menu Choice = " + menuChoice + ".");
    }



}
