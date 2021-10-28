public class QueueStaticArray {
    public static class Queue{
        private int[] arr;
        private int size;
        private int capacity;
        private int nextIndex;
        private int frontIndex;
        Queue(int fixedSize){
            arr = new int[fixedSize];
            size = 0;
            nextIndex = 0;
            capacity = fixedSize;
            frontIndex = -1;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public int getSize(){
            return size;
        }
        public void enqueue(int val){
            if(size == capacity){
                System.out.println("Stack is full");
                return;
            }
            arr[nextIndex] = val;
            size++;
            nextIndex = (nextIndex +1)%capacity;
            if(frontIndex==-1){
                frontIndex = 0;
            }
        }
        public int peek(){
            if(size ==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[frontIndex];
        }
        public int dequeue(){
            if(size ==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int val = arr[frontIndex];
            frontIndex = (frontIndex +1)%capacity;
            size--;
            if(size==0){
                frontIndex = -1;
                nextIndex = 0;
            }
            return val;
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(350);
        q.enqueue(330);
        System.out.println(q.getSize());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(40);
        q.enqueue(0);
        q.enqueue(50);
        q.enqueue(350);
        System.out.println(q.getSize());
        while (!(q.isEmpty())){
            System.out.print(q.dequeue() + " ");
        }
        System.out.println(q.getSize());






    }
}