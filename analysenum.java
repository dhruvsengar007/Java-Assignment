import java.util.*;
public class analysenum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        int reverse=0;
        if(n<0){
            System.out.println("invalid input !");
        }
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
            sum=sum+digit;
            count++;
            n=n/10;

        }
        System.out.println("Reverse of number :"+reverse);
        System.out.println("Sum of digits :"+sum);
        System.out.println("No of digits in number :"+count);
    }
    
}
