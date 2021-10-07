/*
Deleting a node in a linked list
 */
public class DeletingANode {
    public static class Node{
        int val;
        Node next;

        Node(int value){
            val =value;
            next= null;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head=tail=temp;
            }else{
                tail.next = temp;
                tail = temp;
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

        public int get(int index){
            if(index<0 || index>size){
                return -1;
            }else{
                int counter  =0;
                Node temp =  head;
                while(counter<index-1){
                    temp= temp.next;
                    counter++;
                }
                return temp.val;
            }
        }

        public void addAt(int index, int val){
            if(index == size){
                add(val);
            }else if(index > size || index<0){
                return;
            }else{
                Node temp  = head;
                int counter  = 0;
                while (counter<index-1){
                    temp = temp.next;
                    counter++;
                }
                Node temp2 = new Node(val);
                temp2.next = temp.next;
                temp.next = temp2;
            }
        }

        public void removeAt(int index){
            if(index == 0){
                head = head.next;
            }else if(index == size -1){
                int counter =0;
                Node temp = head;
                while (counter<index-1){
                    temp = temp.next;
                    counter++;
                }
                tail = temp;
            }else if(index<0 || index>=size){
                return;
            }else{
                Node temp = head;
                int counter= 0;
                while(counter<index-1){
                    temp =temp.next;
                    counter++;
                }
                temp.next = (temp.next).next;
            }
        }
    }

    public static void main(String agrs[]){
        LinkedList list  = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.addAt(4,500);
        list.add(60);
        list.add(70);
        list.removeAt(3);
        list.print();
    }
}