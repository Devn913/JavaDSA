/*
Stack implementation using a Linked list
*/
public class StackUsingLL {
    public static class Node{
        int val;
        Node next;
        Node(int value){
            val = value;
            next  = null;
        }
    }
    public static class Stack{
        private Node head;
        private int size;
        public void push(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public int top(){
            if(size == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        public int pop(){
            if(size == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int val = head.val;
            size--;
            head = head.next;
            return val;
        }

        public int getSize(){
            return size;
        }

        public boolean isEmpty(){
            return size==0;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(310);
        s.push(103);
        System.out.println(s.pop());
        System.out.println(s.top());
        s.push(1033);
        s.push(1203);
        System.out.println(s.getSize());


    }
}