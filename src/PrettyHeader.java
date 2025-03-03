import java.util.Scanner;
public class PrettyHeader {
    public static void main(String[] args) {
        String msg;
        Boolean ok = false;
        Scanner in = new Scanner(System.in);

        //Do While for valid string to be centered
        do {
            msg = SafeInput.getNonZeroLenString(in, "Enter your message to be centered");
            if (msg.length() < 54) {
                ok = true;
            }
            else{
                System.out.println("The message must be shorter than 54 characters");
            }

        } while (!ok);
        //Call Pretty Header
        SafeInput.prettyHeader(msg);

    }
}
