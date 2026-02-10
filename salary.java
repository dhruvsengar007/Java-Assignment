import java.util.*;
public class salary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter basic salary :");
        double salary=sc.nextDouble();
        double HRA,DA,PF;
        if(salary>=30000){
            HRA=salary*.20;
            DA=salary*.15;

        }else{
            HRA=salary*.10;
            DA=salary*.08;
        }
        PF=salary*.12;
        double netSalary=salary+HRA+DA-PF;
        System.out.print("Your monthly salary is : "+ netSalary);

    }
    
}
