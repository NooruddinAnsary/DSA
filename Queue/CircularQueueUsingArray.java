package Queue;

public class CircularQueueUsingArray {
    static class QueueArr{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        QueueArr(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        //add
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //add 1st elem
            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //remove
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int res = arr[front];
            
            //last elem delete
            if (front == rear) {
                front = rear = -1;
            }else{
               front = (front+1)%size; 
            }
            
            return res;
    
        }


        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        QueueArr qa = new QueueArr(5);
        qa.add(1);
        qa.add(2);
        qa.add(3);
        System.out.print(qa.remove()+"-r ");
        qa.add(4);
        System.out.print(qa.remove()+"-r ");
        qa.add(5);

        while (!qa.isEmpty()) {
            System.out.print(qa.peek()+" ");
            qa.remove();
        }
    }
}
