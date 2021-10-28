public class QueueDynamic {
    public static class Queue{
        private int[] arr;
        private int nextIndex;
        private int size;
        private int frontIndex;
        private int capacity;
        Queue(){
            capacity = 5; // initial size
            arr = new int[capacity];
            frontIndex = -1;
            nextIndex = 0;
            size = 0;
        }
        public int getSize(){
            return size;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public void enqueue(int val){
            if(size==capacity){
                int[] newArr = new int[capacity*2];
                int counter = 0;
                while (!(isEmpty())){
                    newArr[counter] = peek();
                    dequeue();
                    counter++;
                }
                size = capacity;
                frontIndex = 0;
                nextIndex = capacity;
                capacity = capacity*2;
                arr = newArr;
            }
            arr[nextIndex] = val;
            nextIndex = (nextIndex+1)%capacity;
            size++;
            if(frontIndex==-1) frontIndex = 0;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty .");
                return -1;
            }
            return arr[frontIndex];
        }
        public int dequeue(){
            if(size==0){
                System.out.println("Queue is empty .");
                return -1;
            }
            int val = arr[frontIndex];
            frontIndex = (frontIndex+1)%capacity;
            size--;
            if(size ==0 ){
                frontIndex  = -1;
                nextIndex = 0;
            }
            return val;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(130);
        q.enqueue(102);
        q.enqueue(103);
        q.enqueue(1303);
        q.enqueue(1203);
        q.enqueue(1303);
        System.out.println(q.getSize());
        q.dequeue();
        while (!(q.isEmpty())){
            System.out.print(q.dequeue() + " ");
        }
    }
}