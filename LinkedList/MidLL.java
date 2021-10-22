public class MidLL {
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
            head = tail =null;
            size = 0;
        }
        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail= temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public void print(){
            Node temp =head;
            while (temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int mid(){
            Node slow = head;
            Node fast = head.next;
            while (fast!=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.val;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(12);
        list.add(31);
        list.add(14);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.mid());
    }

}