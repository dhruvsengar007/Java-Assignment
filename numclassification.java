import java.util.*;
public class numclassification {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Number is positive.");
        }else{
            System.out.println("Number is negative.");
        }
        if(n%2==0){
            System.out.println("NUmber is even.");
        }else{
            System.out.println("NUmber is odd.");
        }
        if(n%5==0&&n%7==0){
            System.out.println("Number is divisible by both 7 and 5.");
        }else{
            System.out.println("Number is not divisible by 7 and 5.");
        }
    }
    
    
}
