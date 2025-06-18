import java.util.*;
public class Sum_of_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum-i;
            }
            else{
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}
