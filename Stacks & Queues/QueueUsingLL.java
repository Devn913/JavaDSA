/*
Implementation of Queue using a Linked List
 */
public class QueueUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next = null;
        }
    }
    public static class Queue{
        private Node head;
        private Node tail;
        private int size;
        Queue(){
            head = tail = null;
            size = 0;
        }
        public int getSize(){
            return size;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public void enqueue(int val){
            Node temp = new Node(val);
            if (size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty ");
                return -1;
            }
            return head.val;
        }
        public int dequeue(){
            if(size == 0){
                System.out.println("Queue is empty ");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            if (size == 0){
                head =tail = null;
            }
            return val;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.getSize());
        while (!(q.isEmpty())){
            System.out.println(q.dequeue());
        }



    }

}