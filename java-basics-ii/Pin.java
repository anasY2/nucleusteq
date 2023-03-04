/*Validate a string */
import java.util.Scanner;
class Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        String pin = sc.nextLine();
        String str = pin.replaceAll("\\s", "");
        if(str.length() != 6){
            System.out.println("Not a valid pin");
            return;
        }
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){
                System.out.println("Invalid pin");
                return;
            }
        }
        System.out.println(str+" is valid pin code.");
    }
}
