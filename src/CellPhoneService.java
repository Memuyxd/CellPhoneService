import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter talk minutes needed >> ");
        int minutesNeeded = input.nextInt();
        System.out.print("Enter text messages needed >> ");
        int textNeeded = input.nextInt();
        System.out.print("Enter gigabytes of data needed >> ");
        int gbNeeded = input.nextInt();

        if(minutesNeeded<500 && textNeeded == 0 && gbNeeded == 0){
            System.out.println("Plan A $49 per month");
        }
        if (minutesNeeded<500 && textNeeded>0 && gbNeeded == 0) {
            System.out.println("Plan B $55 per month");
        }
        if (minutesNeeded >= 500 && textNeeded <= 100 && gbNeeded == 0 ) {
            System.out.printf("Plan C $61 per month.%nOr for more than 100 text get plan D $70 per month.");
        }
        if (minutesNeeded >= 500 && textNeeded > 100 && gbNeeded == 0 ) {
            System.out.println("Plan D $70 per month");
        }
        if (minutesNeeded == 0 && textNeeded == 0 && gbNeeded == 3) {
            System.out.printf("Plan E $79 per month.%nGet more than 3gb to get plan F $87 per month");
        }
        {
        if (minutesNeeded == 0 && textNeeded == 0 && gbNeeded > 3) {
            System.out.println("Plan F $87 per month");
        }
        }
    }
}
    

