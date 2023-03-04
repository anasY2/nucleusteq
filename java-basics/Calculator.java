import java.util.Scanner;
class Calculator
 {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Remainder: "+(a%b));
        }
}