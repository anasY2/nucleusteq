/*Calculate simple interest and compound interest */
import java.util.Scanner;
class Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal amount: ");
        float p=sc.nextFloat();
        System.out.println("Rate: ");
        float r = sc.nextFloat();
        System.out.println("Time: ");
        float t = sc.nextFloat();
        float si = (p*r*t) / 100;
        float ci = (float)(p*Math.pow((1+(r/100)),t)) - p;
        System.out.println("Simple Interest: "+si+" Compound Interest: "+String.format("%.2f", ci));
    }
}