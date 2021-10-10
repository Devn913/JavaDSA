public class LinearSearch {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val =  value;
            next = null;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        LinkedList(){
            head=tail=null;
            size = 0;
        }

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail =temp;
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
        public int search(int value){
            Node temp = head;
            int counter =0;
            while(temp!=null){
                if(temp.val==value) {
                    return counter;
                }
                counter++;
                temp =temp.next;
            }
            return -1;
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
        System.out.println(list.search(4));
    }

}
