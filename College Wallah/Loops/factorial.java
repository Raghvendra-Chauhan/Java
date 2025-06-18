import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact=1;

        for (int i=1;i<=n;i++){
            fact*=i;
        }                                // Icncremental loop
        System.out.println(fact); 

        for (int i=n;i>0;i--){
            fact*=i;
        }                                  // Decremental loop
        System.out.println(fact);

    }
    
}
