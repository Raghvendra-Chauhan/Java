import java.util.Arrays;

public class second_max_array {
    public static void main(String[] args) {
        int ar[] = {4,2,5,1,6,8,7};
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]<ar[i+1]){
                int temp= ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }
        }
        System.out.println(ar[2]);
        System.out.println(Arrays.toString(ar));
    }
}
