import java.util.*;

public class num_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int res =0;
        while(n>0){
            res = res*10 +(n%10);
            n=n/10;
        }
        System.out.println(res);
        
    }
    
}
