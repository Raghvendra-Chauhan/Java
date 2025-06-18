public class Pattern {
    public static void main(String[] args) {
        int n = 4;  // number of rows

        for (int i = 1; i <= n; i++) {
            // For upper part
            if (i < n) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                System.out.print(i);

                if (i != 1) {
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(i);
                }
            } 
            // For last line
            else {
                for (int j = 1; j <= 2 * n; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
