
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        if(n%2 == 0){
            int last=0;
            for(int i=1;i<=n/2;i++){
		    str+=i;
                last=i;
            }
            while(last>0){
                str+=last;
                last--;
            }
        }else{
            int last=-1;
            for(int i=1;i<=n/2;i++){
                str+=i;
                last=i;
            }
		str+=(last+1);
             while(last>0){
		    str+=last;
                last--;
            }
            
        }
        System.out.println(str);
    }
}