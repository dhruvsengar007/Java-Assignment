import java.util.*;
public class amount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter price of item :");
        double price=sc.nextDouble();
        System.out.print("Enter quantity of item :");
        int qty=sc.nextInt();
        
        double total=price*qty;
        double discount=0;
        if(total>=5000){
            discount=total*.10;
        }if(total>=2000){
            discount=total*.05;
        }
        double amountaftdicnt=total-discount;
        double gst=amountaftdicnt*.18;
        double finalamount=gst+amountaftdicnt;
        System.out.print("Total amount :");
        System.out.print(finalamount);

    }
    
} 
