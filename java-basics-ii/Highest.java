/* Second Highest Number in an array */
import java.util.Scanner;
class Highest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
            arr[i] = sc.nextInt();
        int max = -1;
        int secMax = -1;
        for(int n : arr){
            if(n >= max){
                int temp = max;
                max = n;
                secMax = temp;
            }else if(n > secMax){
                secMax = n;
            }
        }
        System.out.println(max+" "+secMax);
    }
}
