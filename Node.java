public class Node {
    Node next;
    Object data;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
       return data;
    }
}
