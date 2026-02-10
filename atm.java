import java.util.*;
public class atm{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the balance of your account :$");
        int balance=sc.nextInt();
        System.out.print("Enter the withdrawl amount :$");
       int withdrawl=sc.nextInt();
       if(withdrawl%100==0&&withdrawl<=balance&&(balance-withdrawl)>=1000){
        System.out.println("Withdrawl successfull");
        System.out.println("Remaining balance :$"+ (balance-withdrawl));
       }
       else{
        System.out.println("Witihdrawl failed!");
       }

    }
}
