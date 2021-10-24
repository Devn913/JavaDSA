public class StacksUsingArray {
    public static class Stack{
        private int[] arr;
        private int nextIndex;
        Stack(int size){
            arr = new int[size];
            nextIndex = 0;
        }

        public void push(int val){
            if(nextIndex==arr.length){
                System.out.println("Stack is full");
                return;
            }
            arr[nextIndex] = val;
            nextIndex++;
        }

        public int pop(){
            if(nextIndex==0){
                System.out.println("Stack is empty");
                return -1;
            }
            nextIndex--;
            return arr[nextIndex];
        }

        public int top(){
            if(nextIndex==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[nextIndex-1];
        }

        public boolean isEmpty(){
            return nextIndex == 0;
        }
    }
    public static void main(String[] args){
        Stack s =  new Stack(5);
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.pop());
        s.push(1);
        s.push(2);
        System.out.println(s.top());
        s.push(1);
        s.push(2);
        s.push(2);


    }

}