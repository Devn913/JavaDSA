public class RemoveDuplicates {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val =  value;
            next = null;
        }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        int size;
        Linkedlist(){
            head = tail =null;
            size = 0;
        }
        public void add(int val){
            Node temp = new Node(val);
            if(size ==0){
                head = tail= temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public void print(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeDuplicates(){
            Node temp = head;
            while(temp.next!=null){
                if(temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
        }
    }
    public static void main(String args[]){
        Linkedlist list = new Linkedlist();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(24);
        list.add(24);
        list.print();
        list.removeDuplicates();
        list.print();
    }
}
