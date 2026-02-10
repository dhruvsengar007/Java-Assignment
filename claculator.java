import java.util.*;
public class claculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number  :");
        int a=sc.nextInt();
        System.out.print("Enter second number :");
        int b=sc.nextInt();

        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.print("Select one of them :");
        int cases=sc.nextInt();
        switch(cases){
            case 1:{
                System.out.println("your result are :"+(a+b));
                break;
            }
            case 2:{
                System.out.println("your result are :"+ (a-b));
                break;
            }
            case 3:{
                System.out.println("your result are :"+(a*b));
                break;
            }
            case 4:{
                System.out.println("your result are :"+(a/b));
                break;
            }
            case 5:{
                System.out.println("your result are :"+(a%b));
                break;
            }
            default :
            System.out.println("Invalid choice");
        }

    }
    
}
