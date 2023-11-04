import java.util.Scanner;
//import javax.utill.;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Node {
    char data;
    Node left;
    Node right;
    int frequency = 0;

    Node(char key) {
        frequency = 1;
        data = key;
    }

    Node(int freq, char key) {
        frequency = freq;
        data = key;
    }
}

public class Huffman {
    Node stack1[];
    int size;
    int rare;

    Huffman(int capacity) {
        this.size = 0;
        rare = 0;
        stack1 = new Node[capacity];
    }

    public Boolean ExistOrNot(char ch) {
        for (int i = 0; i < size; i++) {

            if (stack1[i].data == ch) {
                System.out.println("Reached");
                return true;
            }
        }
        return false;
    }

    public void insert(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            Boolean bool = ExistOrNot(ch[i]);
            if (!bool) {
                if (size >= stack1.length) {
                    stack1 = Arrays.copyOf(stack1, stack1.length + 1);
                }

                stack1[size] = new Node(ch[i]);
                size++;
                // System.out.println("Reached");
            } else if (bool)
                switch (ch[i]) {
                    case 'a':
                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].data == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'b':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'c':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'd':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'e':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'f':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'g':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'h':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'i':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'j':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'k':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'l':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'm':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'n':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'o':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'p':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'q':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'r':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 's':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 't':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'v':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'w':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'x':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'y':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case 'z':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;
                    case '.':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case ',':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                    case ' ':

                        for (int j = 0; j < stack1.length; j++) {
                            if (stack1[j].frequency == ch[i]) {
                                stack1[j].frequency++;
                                break;
                            }
                        }
                        break;

                }
        }
        sort();
        for (int i = 0; i < stack1.length; i++) {
            System.out.println(stack1[i].data + " ");
        }

    }

    void sort() {
        Node temp = stack1[0];
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (temp.frequency >= stack1[j].frequency) {
                    temp = stack1[i];
                    stack1[i] = stack1[j]; 
                    stack1[j] = temp;
                }
            }
        }
    }

    void incSize() {// forincreasing the size of the array
        stack1 = Arrays.copyOf(stack1, stack1.length + 5);
    }

    void push(Node node) {
        size++;

        if (size >= stack1.length) {
            incSize();
        }
        stack1[size] = node;
        sort();

    }

    Node pop() {

        if (size >= 0) {
            if (size >= stack1.length)
                size = stack1.length - 1;
            System.out.println("Hi " + size);
            Node node = stack1[size];
            stack1[size] = null;
            size--;
            return node;
        }

        return null;
    }

    Node maketree() {
        Node newNode = null;
        System.out.println(size);
        for (int i = 0; i < stack1.length; i++) {
            Node node1 = pop();
            Node node2 = pop();

            System.out.println("Here " + node1.frequency + " " + node2.frequency);
            newNode = new Node(node1.frequency + node2.frequency, '\0');
            setLeftRight(node1, node2, newNode);
            push(newNode);
        }

        return newNode;
    }

    public void InOrder(Node node) {
        // if
    }

    void setLeftRight(Node node1, Node node2, Node node) {
        if (node1.frequency < node2.frequency) {
            node.left = node1;
            node.right = node2;
        } else if (node1.frequency >= node2.frequency) {
            node.right = node1;
            node.left = node2;
        }
    }

    public static void main(String cmd[]) throws Exception {
        Huffman obj = new Huffman(1);
        char ch[] = new char[5];
        File myfile = new File("Text.txt");
        try {
            String str = new String();
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    if (i >= ch.length) {
                        ch = Arrays.copyOf(ch, ch.length + 1);
                    }
                    ch[i] = str.charAt(i);
                }
            }

            obj.insert(ch);
            // obj.decSize();
            obj.maketree();
            sc.close();
        } finally {
            System.out.println("Exception occured");
        }

        // File file = new File("text.txt");

        // Scanner sc = new Scanner("file");
        // Huffman obj = new Huffman();
    }p
}