/* Currency Conversion */
import java.util.Scanner;
class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Select  your currency:");
        System.out.println("1. Rupees.");
        System.out.println("2. Dollars.");
        System.out.println("3. Pounds.");
        int choice1 = sc.nextInt();


        System.out.println("Enter amount: ");
        double amount = sc.nextFloat();


        int choice2 = 0;
        double newAmount = 0;


        System.out.println("Select  your desired currency:");
        switch(choice1){
            case 1:
            System.out.println("2. Dollars.");
            System.out.println("3. Pounds.");
            choice2 = sc.nextInt();
            break;
            case 2:
            System.out.println("1. Rupees.");
            System.out.println("3. Pounds.");
            choice2 = sc.nextInt();
            break;
            case 3:
            System.out.println("1. Rupees.");
            System.out.println("2. Dollars.");
            choice2 = sc.nextInt();
            break;
        }
        
        
        switch(choice1){
            case 1:
            switch(choice2){
                case 2:
                newAmount = (amount / 81.71);
                break;
                case 3:
                newAmount = (amount / 98.34);
                break;
                default:
                break;
            }
            break;
            case 2:
            switch(choice2){
                case 1:
                newAmount = (amount * 81.71);
                break;
                case 3:
                newAmount = (amount / 1.20);
                break;
                default:
                break;
            }
            break;
            case 3:
            switch(choice2){
                case 1:
                newAmount = (amount * 98.34);
                break;
                case 2:
                newAmount = (amount * 1.20);
                break;
                default:
                break;
            }
            break;
            default:
            System.out.println("Error Occured");
            break;
        }
        System.out.println(String.format("%.2f", newAmount));
        
    }
}
