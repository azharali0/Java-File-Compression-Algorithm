import java.util.Arrays;

class Stack {
    int size;
    int capacity;
    int index;
    Stack stack[];

    Stack(int key) {
        size = 1;
        capacity = 5;
        stack = new Stack[capacity];
    }

    int StackOverFlow(Stack stack[]) {
        stack = Arrays.copyOf(stack, capacity + 5);
        return stack;
    }
}

public class HuffmanProject {
    int parent(int i) {
        return (i - 1) / 2;
    }

    // to get index of left child of node at index i
    int left(int i) {
        return (2 * i + 1);
    }

    // to get index of right child of node at index i
    int right(int i) {
        return (2 * i + 2);
    }

    public void insertKey(int key) {
        if()
    }

    public static void main(String cmd[]) {
        HuffmanProject CompressionObject = new HuffmanProject();
        Stack File = new Stack();
    }
}
