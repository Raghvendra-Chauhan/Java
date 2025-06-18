class sum{
    static int add (int a, int b){
    int result = a+b;
    System.out.println(result);
    return 0;
}
}

public class Sum_of_two_num {

    static void subtract(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        // sum obj = new sum();
        // int ans= obj.add(2,3);
        // System.out.println(ans);
        Sum_of_two_num obj = new Sum_of_two_num();
        sum.add(2,3);
        subtract(2,4);

    }
    
}
