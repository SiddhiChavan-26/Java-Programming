import java.util.Scanner;

interface StackInterface {
    void push(int element);
    int pop();
    int peek();
    void displayStack();
}

interface QueueInterface{
	void enqueue(int element);
	int dequeue();
	void displayQueue();
}

class StackQueue implements StackInterface , QueueInterface{
	private int[] stackArr;
	private int[] queueArr;
	private int top;
	private int front, rear;
	private int size;
	
	public StackQueue(int size) {
		this.size = size;
		stackArr = new int[size];
		queueArr = new int[size];
		top = -1;
		front = -1;
		rear = -1;
	}
	
	@Override
	public void push(int element) {
		if(top == size -1) {
			System.out.println("Stack overflow.");
		}else {
			top++;
			stackArr[top] = element;
			System.out.println(element + " pushed in stack");
		}
	}
	
	@Override
	public int pop(){
		if(top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			int val = stackArr[top--];
			System.out.println(val + " popped from stack");
			return val;
		}	
	}
	
	@Override
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            System.out.println("Top element: " + stackArr[top]);
            return stackArr[top];
        }
    }
	
	@Override
    public void displayStack() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArr[i] + " ");
            }
            System.out.println();
        }
    }
	
	@Override
    public void enqueue(int element) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0; 
            queueArr[++rear] = element;
            System.out.println(element + " enqueued to queue.");
        }
    }
	
	@Override
    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return -1;
        } else {
            int val = queueArr[front++];
            System.out.println(val + " dequeued from queue.");
            return val;
        }
    }
	
	@Override
    public void displayQueue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArr[i] + " ");
            }
            System.out.println();
        }
    }
	
	
}
public class StackQueueTest {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter size for Stack & Queue: ");
	     int n = sc.nextInt();
	     
	     StackQueue sq = new StackQueue(n);
	     
	     int choice;
	        do {
	            System.out.println("\n---- Menu ----");
	            System.out.println("1. Push to Stack");
	            System.out.println("2. Pop from Stack");
	            System.out.println("3. Peek Stack");
	            System.out.println("4. Display Stack");
	            System.out.println("5. Enqueue to Queue");
	            System.out.println("6. Dequeue from Queue");
	            System.out.println("7. Display Queue");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element to push: ");
	                    sq.push(sc.nextInt());
	                    break;
	                case 2:
	                    sq.pop();
	                    break;
	                case 3:
	                    sq.peek();
	                    break;
	                case 4:
	                    sq.displayStack();
	                    break;
	                case 5:
	                    System.out.print("Enter element to enqueue: ");
	                    sq.enqueue(sc.nextInt());
	                    break;
	                case 6:
	                    sq.dequeue();
	                    break;
	                case 7:
	                    sq.displayQueue();
	                    break;
	                case 0:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 0);

	        sc.close();
	}
	 
}
