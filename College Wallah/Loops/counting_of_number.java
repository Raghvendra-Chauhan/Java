import java.util.*;
public class counting_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check length : ");
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
    
}
