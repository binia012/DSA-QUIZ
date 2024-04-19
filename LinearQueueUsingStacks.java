import java.util.Stack;

public class LinearQueueUsingStacks {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public LinearQueueUsingStacks() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void enqueue(int item) {
        inputStack.push(item);
    }

    public int dequeue() {
        if (outputStack.isEmpty()) {
            if (inputStack.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

}
