import java.util.ArrayList;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class ll{
    node head;
    public ArrayList<Integer> arr = new ArrayList<>();
    public void add(int data) {
        // if(head ==null){
        //     node n = new node(data);
        //     head = n;
        //         }
        arr.add(data);
    }

    public void pri(){
        for(int i = arr.size()-1 ; i >= 0 ; i--){
            System.out.println(arr.get(i));
        }

    }
    
}



public class stack {
    public static void main(String[] args) {
        ll l = new ll();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(25);
        l.pri();
    }
}