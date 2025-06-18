public class Strings_Builder {
    public static void main(String[] args) {
        var sb = new StringBuilder("Hello");
        System.out.println(sb);

        // chatAt
        System.out.println(sb.charAt(3));

        // setCharAt
        sb.setCharAt(1,'o');
        System.out.println(sb);

        //insert
        sb.insert(5,'G');
        System.out.println(sb);

        //delete
        sb.delete(5, 6);
        System.out.println(sb);
        
    }
    
}
