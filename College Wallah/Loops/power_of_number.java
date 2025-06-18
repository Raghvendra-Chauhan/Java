import java.util.*;
public class power_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of exponential : ");
        int p = sc.nextInt();
        int res=1;
        for(int i=1;i<=p;i++){
            res = res*n;
        }
        System.out.println("The value of " +n+" exponential "+p+" is : "+res);
    }
}
