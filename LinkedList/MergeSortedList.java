public class MergeSortedList {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next  = null;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    public static Node merge(Node h1, Node h2){
        LinkedList list = new LinkedList();
        while (h1!=null || h2!=null){
            if(h2==null){
                list.add(h1.val);
                h1 = h1.next;
                continue;
            }else if(h1==null){
                list.add(h2.val);
                h2 = h2.next;
                continue;
            }
            if(h1.val> h2.val){
                list.add(h2.val);
                h2 = h2.next;
            }else {
                list.add(h1.val);
                h1 = h1.next;
            }
        }
        return list.head;
    }
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        Node temp = merge(l1.head, l2.head);
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}