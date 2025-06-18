import java.util.Scanner;

public class pattern_12121212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter no. of column : ");
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int a = ((i+j)%2); 
                if(a==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
    
}
