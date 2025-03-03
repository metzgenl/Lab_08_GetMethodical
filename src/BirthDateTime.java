import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950,2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);

        //Case for BirthDay
        switch(birthMonth) {
            //Feb
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth month", 1, 29);
                break;
                //31 Days
            case 1,3,5,7,8,10,12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth month", 1, 31);
                break;
                //30 Days
            case 4,6,9,11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth month", 1, 30);
                break;
        }
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1,24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1,59);

        System.out.println("\nYour birth date and time is as follows: " + birthMonth + " " + birthDay + ", " + birthYear + " at " + birthHour + " hour(s) and " + birthMinute + " minute(s).");

    }
}