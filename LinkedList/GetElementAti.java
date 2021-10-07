/*
Getting element of  linked list at i index
 */

public class GetElementAti {
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

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail =temp;
            }
            size++;
        }

        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int get(int index){
            if(index>size || index <0){
                return -1;
            }
            Node temp = head;
            int counter = 0;
            while (counter!=index){
                temp = temp.next;
                counter++;
            }
            return temp.val;
        }

    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(140);
        list.add(1430);
        list.add(130);
        list.add(1320);
        System.out.print(list.get(4));
    }
}