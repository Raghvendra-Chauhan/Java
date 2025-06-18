import java.util.*;
public class max_array {
    public static void main(String[] args) {
        int ar[] = {5, 3, 1, 4, 2};
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                int temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
        
        System.out.println(ar[ar.length - 1]);
        System.out.println(Arrays.toString(ar));
    }
}
