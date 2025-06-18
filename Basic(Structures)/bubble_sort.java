 public class bubble_sort {

    public static int printAr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        return 0;
    } 
    public static void main(String[] args) {
        int ar[] ={7,8,3,1,2};
        for(int i =0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }
    
}
