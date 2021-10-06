/*
Adding elements into a linked list
 */

public class AddElement {
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
            size = 0;
        }

        public void add(int val){
            if(size==0){
                Node temp = new Node(val);
                head = tail= temp;
            }else{
                Node temp = new Node(val);
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.val+ " ") ;
            temp = temp.next;
        }

    }
}