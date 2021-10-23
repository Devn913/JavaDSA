public class ReverseRecusively {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next = null;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        LinkedList(){
            head = tail = null;
            size= 0;
        }
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    public static Node Reverse(Node current,Node next, Node prev){
        if(next == null) {
            current.next = prev;
            return current;
        }
        current.next = prev;
        prev =current;
        current = next;
        next = next.next;
        return Reverse(current,next,prev);

    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        Node temp = Reverse(list.head, list.head.next,null);
        while (temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }

    }

}
