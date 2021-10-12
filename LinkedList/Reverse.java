public class Reverse {
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
            size=0;
        }

        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next = temp;
                tail =temp;
            }
            size++;
        }

        public void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void reverse(){
            tail = head;
            Node prev =null;
            Node current = head;
            Node nexT = head.next;
            while (nexT!=null){
                current.next = prev;
                prev  =current;
                current =nexT;
                nexT = nexT.next;
            }
            current.next = prev;
            head = current;
        }
    }

    public static void main(String agrs[]){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(15);
        list.reverse();
        list.print();

    }
}