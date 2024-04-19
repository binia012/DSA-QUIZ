public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Queue:");
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.enqueue(1);
        linearQueue.enqueue(2);
        linearQueue.enqueue(3);
        System.out.println("Dequeued item: " + linearQueue.dequeue()); // Output: 1


        System.out.println("\nCircular Queue:");
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        System.out.println("Dequeued item: " + circularQueue.dequeue()); // Output: 1

        // Testing LinearQueueUsingStacks
        System.out.println("\nLinear Queue Using Stacks:");
        LinearQueueUsingStacks queueUsingStacks = new LinearQueueUsingStacks();
        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(2);
        queueUsingStacks.enqueue(3);
        System.out.println("Dequeued item: " + queueUsingStacks.dequeue()); // Output: 1
    }

    }

}