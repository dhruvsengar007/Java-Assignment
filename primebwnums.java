import java.util.*;
public class primebwnums {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter staring num:");
        int start=sc.nextInt();
        System.out.print("Enter ending num:");
        int end=sc.nextInt();
        for(int num=start;num<=end;num++){
            if(num<=1)
                continue;
            int count=0;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(num+" ");
            }
        }
    }
    
}
