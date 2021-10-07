public class InsertingNodeAti {
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
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
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
            if(index>size || index<0){
                return -1;
            }
            int counter = 0;
            Node temp = head;
            while(counter<index){
                temp = temp.next;
                counter ++;
            }
            return temp.val;
        }

        public void addAt(int index, int val){
            if(index == size){
                add(val);
            }else if(index>size || index<0){
                return;
            }else{
                Node temp = head;
                int counter = 0;
                while(counter<index-1){
                    temp = temp.next;
                    counter++;
                }
                Node main = new Node(val);
                main.next = temp.next;
                temp.next = main;
            }
        }
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(130);
        list.add(140);
        list.add(150);
        list.addAt(3,10);
        list.print();

    }

}